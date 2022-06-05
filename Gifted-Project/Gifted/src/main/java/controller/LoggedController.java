package controller;

import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import java.util.LinkedList;
import java.io.*;
import javax.sql.DataSource;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import jakarta.annotation.Resource;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;
import model.Refugee;
import model.RefugeeModel;
import model.Video;
import model.VideoModel;

@MultipartConfig(maxFileSize = 169999999)
@WebServlet("/LoggedController")
public class LoggedController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 @Resource(name = "jdbc/project")
	 private DataSource dataSource;
    
    public LoggedController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String param = request.getParameter("action");
		switch(param) {
			case "personal-account": 
				getServletContext().getRequestDispatcher("/personal-account.jsp").forward(request, response);
				break;
			case "Update-Personal-Information":
				getServletContext().getRequestDispatcher("/Update-Personal-Information.jsp").forward(request, response);
				break;
			case "Deleting-Created-Videos":
				getServletContext().getRequestDispatcher("/Deleting-Created-Videos.jsp").forward(request, response);
				break;
			case "Upload-Video":
				getServletContext().getRequestDispatcher("/Upload-Video.jsp").forward(request, response);
				break;
			case "destroy": 
				request.getSession().invalidate();
				response.sendRedirect(request.getContextPath()+"/MembersController?action=login");
				break;
			default: 
				break;
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String param = request.getParameter("action");
		switch(param) {
			case "updatesubmit": 
				updateAuthanticate(request, response);
				break;
			case "uploadvideo":
				uploadVideo(request, response);
				break;
			case "deletesubmit":
				deleteVideo(request, response);
				break;
		}
	}
	
	public void updateAuthanticate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstName =  request.getParameter("first-name"),
				lastName = request.getParameter("last-name"), email = request.getParameter("email"), 
				phoneNumber = request.getParameter("phone-number"), pass = request.getParameter("pass"),
				birthDate = request.getParameter("birth-date");
		Refugee refugee = new Refugee(((String)request.getSession().getAttribute("refugee_id")), firstName, lastName, email, phoneNumber, pass, birthDate);
		LinkedList<Refugee> refug = new LinkedList<Refugee>();
		refug.add(refugee);
		new RefugeeModel().updateRfugeeInfo(dataSource, refugee);
		request.getSession().setAttribute("allInfo", refug);
		response.sendRedirect(request.getContextPath() + "/LoggedController?action=Update-Personal-Information");
	} public void uploadVideo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String categoryName = request.getParameter("category-selected"),
				description = request.getParameter("descripty"), refugee_id = (String)request.getSession().getAttribute("refugee_id");
		Part filePart = request.getPart("vid-upload");
	    String fileName = filePart.getSubmittedFileName();
	    filePart.write("C:\\Users\\USER\\eclipse-workspace\\Gifted\\src\\main\\webapp\\Photos\\" + fileName);
	    new VideoModel().addVideo(dataSource, fileName, categoryName, description, refugee_id);
		request.getSession().setAttribute("message", "The video has been successfully uploaded!");
		LinkedList<Video> videos = new LinkedList<Video>();
		videos = new VideoModel().listVideos(dataSource, "SELECT * FROM videos WHERE refugee_id = '"+ refugee_id +"'");
		request.getSession().setAttribute("videos", videos);
		response.sendRedirect(request.getContextPath() + "/LoggedController?action=Upload-Video");
			
	} public void deleteVideo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String confirmation = request.getParameter("inserted-text");
		Integer videoId = Integer.parseInt(request.getParameter("id-del"));
		if(!confirmation.equals("delete")) {
			request.getSession().setAttribute("message", "Please write delete to confirm");
			response.sendRedirect(request.getContextPath() + "/LoggedController?action=Deleting-Created-Videos");
		} else {
			LinkedList<Video> check = new LinkedList<Video>();
			LinkedList<Video> checky = new LinkedList<Video>();
			check = new VideoModel().listVideos(dataSource, "SELECT * FROM videos WHERE refugee_id = '"+ request.getSession().getAttribute("refugee_id") +"'");
			for(int i = 0; i < check.size(); i++) {
				if(check.get(i).getVideoId() == videoId) {
					checky = new VideoModel().listVideos(dataSource, "SELECT * FROM videos WHERE video_id = '"+ videoId +"'");
					File  file = new File("C:\\Users\\USER\\eclipse-workspace\\Gifted\\src\\main\\webapp\\Photos\\", checky.get(0).getAddress());
					file.delete();
					new VideoModel().removeVideo(dataSource, videoId);
					request.getSession().setAttribute("message", "The Video Has Been Deleted!");
					request.getSession().setAttribute("videos", new VideoModel().listVideos(dataSource, "SELECT * FROM videos WHERE refugee_id = '"+ request.getSession().getAttribute("refugee_id") +"'"));
					response.sendRedirect(request.getContextPath() + "/LoggedController?action=Deleting-Created-Videos");
					return;
				}
			}
			request.getSession().setAttribute("message", "This videos wasn't uploaded by you!");
			response.sendRedirect(request.getContextPath() + "/LoggedController?action=Deleting-Created-Videos");
		}
		
	}

}
