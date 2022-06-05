<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.LinkedList" %>
<%@ page import="model.Refugee" %>
<%@ page import="model.Video" %>
<%@ page import="model.VideoModel" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="design.css">
        <link rel="Icon" href="Photos/logo.JPG">
        <title>Personal Account</title>
    </head>
    <body>
    <% 
    LinkedList<Refugee> refg = (LinkedList)request.getSession().getAttribute("allInfo");
    %>
        <header class="spec-hdr-up">
            <a href="<%= request.getContextPath()%>/PagesController?page=index" class="hdr-spec" style="border: none;"><h1>Gifted</h1></a>
            <div id="logo">
                <a href="<%= request.getContextPath()%>/PagesController?page=index">
                    <img src="Photos/logo.JPG" alt="The logo of the website" class="uppy-img">
                </a>
            </div>
        </header>

        <div class="phot-name">
            <i class="fa fa-user big-logo"></i>
            <div class="big-name"><%= refg.get(0).getFirstName().toUpperCase() + " " + refg.get(0).getLastName().toUpperCase() %></div>
        </div>

        <div class="options-pers">
            <div class="opt"><a href="<%= request.getContextPath()%>/PagesController?page=Update-Personal-Information">Update Personal Information</a></div>
            <div class="opt"><a href="<%= request.getContextPath()%>/PagesController?page=Deleting-Created-Videos">Delete Created Videos</a></div>
            <div class="opt"><a href="<%= request.getContextPath()%>/PagesController?page=Upload-Video">Upload a Video</a></div>
            <div class="opt"><a href="<%= request.getContextPath()%>/LoggedController?action=destroy">Logout</a></div>
        </div>

        <div class="huge-container">
            <div class="uploaded-vids-txt">Uploaded Videos</div>
            <div class="uploaded-vids-cont">
				<%
				if(((LinkedList)request.getSession().getAttribute("videos")) != null){
					LinkedList<Video> videos = (LinkedList)request.getSession().getAttribute("videos");
					for(int i = 0; i < videos.size(); i++){
						
				%>
                <div class="tiny-place">
                        <video class="tiny-one" controls="controls" preload="metadata">
                        <source src="Photos/<%=videos.get(i).getAddress()%>#t=0.5" type="video/mp4">
                        </video>
                        <h5 class="id-number">ID: <%= videos.get(i).getVideoId() %></h5>
                </div>
                <% } }  %>
				

            </div>
        </div>

    </body>
</html>