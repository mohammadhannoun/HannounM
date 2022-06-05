package controller;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Statement;
import java.util.LinkedList;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.Refugee;
import model.RefugeeModel;
import model.Video;
import model.VideoModel;



@WebServlet("/PagesController")
public class PagesController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Resource(name="jdbc/project")
	private DataSource dataSource;
	
   
    
    public PagesController() {
        super();
        // TODO Auto-generated constructor stub
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String param = request.getParameter("page");
		if(param.length() > 8 && param.substring(0, 8).equals("Category")) {
			String categoryName = param.substring(param.lastIndexOf('/')+1);
			request.setAttribute("categoryName", categoryName);
			getServletContext().getRequestDispatcher("/Category-Videos.jsp").forward(request, response);
		} else if(param.length() > 7 && param.substring(0, 7).equals("Creator")) {
			String id = param.substring(param.lastIndexOf('-')+1);
			request.setAttribute("Creator_contact_information_get_id", id);
			getServletContext().getRequestDispatcher("/Creator-Contact-Information.jsp").forward(request, response);
		} else if(param.equalsIgnoreCase("Deleting-Created-Videos")) {
			response.sendRedirect(request.getContextPath() + "/LoggedController?action=Deleting-Created-Videos");
		} else if(param.equalsIgnoreCase("index")) {
			getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
		} else if(param.equalsIgnoreCase("personal-account")) {
			response.sendRedirect(request.getContextPath() + "/LoggedController?action=personal-account");
		} else if(param.equalsIgnoreCase("signup")) {
			response.sendRedirect(request.getContextPath() + "/MembersController?action=signup");
		} else if(param.equalsIgnoreCase("Update-Personal-Information")) {
			response.sendRedirect(request.getContextPath() + "/LoggedController?action=Update-Personal-Information");
		} else if(param.equalsIgnoreCase("Upload-Video")) {
			response.sendRedirect(request.getContextPath() + "/LoggedController?action=Upload-Video");
		} else if(param.equalsIgnoreCase("login")) {
			response.sendRedirect(request.getContextPath() + "/MembersController?action=login");
		} else {
			getServletContext().getRequestDispatcher("/Error.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
