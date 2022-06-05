<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.LinkedList" %>
<%@ page import="model.Refugee" %>
<%@ page import="model.RefugeeModel" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="design.css">
        <link rel="Icon" href="Photos/logo.JPG">
        <title>Login</title>
    </head>
    <body>
        <header class="hdr-spec">
            <a href="<%= request.getContextPath()%>/PagesController?page=index"><h1>Gifted</h1></a>
        </header>
        
        <div class="note-logn">
            <div class="texty">Note: Logging in is ONLY allowed to Refugees so if you are not a refugee you can go back, and watch the videos that were created by talented refugees.</div>
            <a href="<%= request.getContextPath()%>/PagesController?page=index"><div class="watch-vids">Watch Videos</div></a>
        </div>

        <div class="specy">
            <div class="specy-img"><img src="Photos/logo.JPG" alt="The Logo of the website, representing an eye"></div>
            <div class="specy-logn"><h1>Login</h1></div>
        </div>

        <form action="<%=request.getContextPath()%>/MembersController" method="post" class="secret-questions">
            <label for="email-log" class="lbl">Email</label><br>
            <input type="text" id="email-log" name="email" class="ques" placeholder="Enter your email" required><br>
            <label for="secret-pass" class="lbl">Password</label><br>
            <input type="password" id="secret-pass" name="pass" class="ques reley" placeholder="Enter your password" required><br>
            <a href="<%= request.getContextPath()%>/PagesController?page=login" class="sgn-up">Not Registered? Signup Now</a>
            <div style="color: red; margin-top: 10px; margin-left: 2px;" class="sgn-up">
            	${message}
            	<% session.removeAttribute("message"); %>
            </div>
            <input type="hidden" name="action" value="loginsubmit"> 
            <button type="submit">Login</button>
        </form>
    </body>
</html>