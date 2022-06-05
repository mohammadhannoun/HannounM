package controller;
import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import java.net.URLEncoder;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import javax.sql.DataSource;
import jakarta.annotation.Resource;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.Refugee;
import model.RefugeeModel;
import model.Video;
import model.VideoModel;


@WebServlet("/MembersController")
public class MembersController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    @Resource(name = "jdbc/project")
    private DataSource dataSource;
    
    
    
    public MembersController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String param = request.getParameter("action");
		switch(param) {
			case "login": 
				getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
				break;
			case "signup":
				getServletContext().getRequestDispatcher("/signup.jsp").forward(request, response);
				break;
			default: 
				break;
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String param = request.getParameter("action");
		switch(param) {
			case "loginsubmit":
				loginAuthanticate(request, response);
				break;
			case "signupsubmit":
				signupAuthanticate(request, response);
				break;
				
		}
	}
	
	public void loginAuthanticate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email"), pass = request.getParameter("pass");
		String failedToLogin = "";
		LinkedList<Refugee> refugee = new LinkedList<Refugee>();
		refugee = new RefugeeModel().listRfugees(dataSource, "SELECT * FROM refugee WHERE email = '"+email+"'");
		if(refugee.size() <= 0) {
			failedToLogin = "Sorry, the email entered is not correct";
			request.getSession().setAttribute("message", failedToLogin);
			response.sendRedirect(request.getContextPath() + "/MembersController?action=login");
		} else if(!(pass.equals(refugee.get(0).getPassword()))) {
			failedToLogin = "Sorry, the password entered is not correct";
			request.getSession().setAttribute("message", failedToLogin);
			response.sendRedirect(request.getContextPath() + "/MembersController?action=login");
		} else {
			request.getSession().invalidate();
			HttpSession newSession = request.getSession(true);
		    newSession.setMaxInactiveInterval(300000000);
		    newSession.setAttribute("refugee_id", refugee.get(0).getRefugeeId());
		    request.getSession().setAttribute("allInfo", refugee);
		    LinkedList<Video> videos = new LinkedList<Video>();
			videos = new VideoModel().listVideos(dataSource, "SELECT * FROM videos WHERE refugee_id = '"+refugee.get(0).getRefugeeId()+"'"); 
			if(videos != null) {
				request.getSession().setAttribute("videos", videos);}
			response.sendRedirect(request.getContextPath() + "/LoggedController?action=personal-account");
		}
	}
	
	public void signupAuthanticate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String refugeeId = request.getParameter("refug-id"), firstName =  request.getParameter("first-name"),
				lastName = request.getParameter("last-name"), email = request.getParameter("email"), 
				phoneNumber = request.getParameter("phone-number"), pass = request.getParameter("pass"),
				birthDate = request.getParameter("birth-date"), failedToLogin = "";
		LinkedList<Refugee> refugee = new LinkedList<Refugee>();
		refugee = new RefugeeModel().listRfugees(dataSource, "SELECT * FROM refugee WHERE refugee_id = '"+refugeeId+"'");
		if(refugee.size() > 0) {
			failedToLogin = "Sorry, the id entered is already used";
			request.getSession().setAttribute("message", failedToLogin);
			response.sendRedirect(request.getContextPath() + "/MembersController?action=signup");
		} else {
			Refugee refugeeAdded = new Refugee(refugeeId, firstName, lastName, email, phoneNumber, pass, birthDate);
			new RefugeeModel().addRfugees(dataSource, refugeeAdded);
			request.getSession().invalidate();
			HttpSession newSession = request.getSession(true);
		    newSession.setMaxInactiveInterval(300000000);
		    newSession.setAttribute("refugee_id", refugeeId);
		    request.getSession().setAttribute("allInfo", refugee);
		    LinkedList<Video> videos = new LinkedList<Video>();
			videos = new VideoModel().listVideos(dataSource, "SELECT * FROM videos WHERE refugee_id = '"+refugeeId+"'");
			if(videos != null) {
			request.getSession().setAttribute("videos", videos);}
			response.sendRedirect(request.getContextPath() + "/LoggedController?action=personal-account");
		}
		
	}
	
	

}
