<%@page import="com.mysql.cj.jdbc.Driver"%>
<%@page import="java.sql.Connection"%>
<%@page import="model.RefugeeModel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.LinkedList" %>
<%@ page import="model.Video" %>
<%@ page import="model.VideoModel" %>
<%@ page import="model.Refugee" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="jakarta.servlet.annotation.WebServlet" %>
<% 

	String id = (String)request.getAttribute("Creator_contact_information_get_id");
	LinkedList<Video> videos = new LinkedList<Video>();
	Connection conn = null;
	
	Statement stmt = null;
	
	ResultSet rs = null;
	
	LinkedList<Refugee> list = new LinkedList<Refugee>();
try{
	Class.forName("com.mysql.cj.jdbc.Driver");
	conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/cutter", "admin", "Aa12345!@");
	stmt = conn.createStatement();
	rs = stmt.executeQuery("SELECT * FROM refugee WHERE refugee_id = '" +id+"'");
	while(rs.next()) {
		list.add(new Refugee
			    (rs.getString("refugee_id"), 
				rs.getString("first_name"),
				rs.getString("last_name"),
				rs.getString("email"),
				rs.getString("phone_number"),
				rs.getString("pass"),
				rs.getString("birth_date")
				));
	}
	rs = stmt.executeQuery("SELECT * FROM videos WHERE refugee_id = '"+id+"'");
	while(rs.next()) {
		videos.add(new Video
			    (rs.getInt("video_id"),
				rs.getString("address"),
				rs.getString("category_name"),
				rs.getString("video_discription"),
				rs.getString("refugee_id")
				));
	}
	request.getSession().setAttribute("Creator_contact_information_get_id", null);
} catch(Exception e){
	e.printStackTrace();
}
%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="design.css">
        <link rel="Icon" href="Photos/logo.JPG">
        <title>Contact Information</title>
    </head>
    <body>
        <!--Header Starts-->
        <header class="hhe">

            <!--Big Name In the Header-->
            <div id="name">
                <a href="<%= request.getContextPath()%>/PagesController?page=index"><h1>Gifted</h1></a>
            </div>

            <!--Logo Creation-->
            <div id="logo">
                <a href="<%= request.getContextPath()%>/PagesController?page=index">
                    <img src="Photos/logo.JPG" alt="The logo of the website">
                </a>
            </div>
            <!--Personal Account-->
            <div id="personala">
                <a href="<%= request.getContextPath()%>/PagesController?page=login"><i class="fa fa-user user-logo"></i></a>
                <a href="<%= request.getContextPath()%>/PagesController?page=login"><h3>Personal Account</h3></a> 
            </div>
        </header>
        <!--Header Ends-->
        <div class="phot-name creat">
            <i class="fa fa-user big-logo"></i>
            <div class="big-name meme"><b>Full Name: </b><%=list.get(0).getFirstName().toUpperCase() + " " + list.get(0).getLastName().toUpperCase()%></div>
            <div class="big-name meme"><b>Phone Number: </b><%=list.get(0).getPhoneNumber()%></div>
            <div class="big-name meme"><b>Email: </b><%=list.get(0).getEmail()%></div>
        </div>
        <div class="huge-container">
            <div class="uploaded-vids-txt">Uploaded Videos</div>
            <div class="uploaded-vids-cont">
                <%
				if(videos != null){
					for(int i = 0; i < videos.size(); i++){
				%>
                <div class="tiny-place">
                        <video class="tiny-one" controls="controls" preload="metadata">
                        <source src="Photos/<%=videos.get(i).getAddress()%>#t=0.5" type="video/mp4">
                        </video>
                </div>
                <% } }  %>
            </div>
        </div>
    </body>
</html>