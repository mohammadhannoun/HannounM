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
	LinkedList<Video> videosList = new LinkedList<Video>();
	LinkedList<Refugee> regCreat = new LinkedList<Refugee>();
	Connection conn = null;
	
	Statement stmt = null;
	
	ResultSet rs = null;
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/cutter", "admin", "Aa12345!@");
		stmt = conn.createStatement();
		rs = stmt.executeQuery("SELECT * FROM videos WHERE category_name= '"+ ((String)request.getAttribute("categoryName"))+"'");
		while(rs.next()) {
			videosList.add(new Video
				    (rs.getInt("video_id"),
					rs.getString("address"),
					rs.getString("category_name"),
					rs.getString("video_discription"),
					rs.getString("refugee_id")
					));
		}
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
        <title>Category's Videos</title>
    </head>
    <body>
        <!--Header Starts-->
        <header>

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

        <!--Creating the menu-->
        <div class="container">
            <div class="menu-wrap">
                <input type="checkbox" class="toggler">
                <div class="hamburger"><div></div></div>
                <div class="menu">
                    <div>
                        <div>
                            <ul>
                                <li><a href="<%= request.getContextPath()%>/PagesController?page=Category/Sport" class="add-news-menu">Sport</a></li>
                                <li><a href="<%= request.getContextPath()%>/PagesController?page=Category/Voice">Voice</a></li>
                                <li><a href="<%= request.getContextPath()%>/PagesController?page=Category/Speech">Speech</a></li>
                                <li><a href="<%= request.getContextPath()%>/PagesController?page=Category/Mathematics">Mathematics</a></li>
                                <li><a href="<%= request.getContextPath()%>/PagesController?page=Category/Cooking">Cooking</a></li>
                                <li><a href="<%= request.getContextPath()%>/PagesController?page=Category/Technology">Technology</a></li>
                                <li><a href="<%= request.getContextPath()%>/PagesController?page=Category/Others">Others</a></li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
                <ul class="big-scre">
                    <li><a href="<%= request.getContextPath()%>/PagesController?page=Sport" class="add-news-menu">Sport</a></li>
                                <li><a href="<%= request.getContextPath()%>/PagesController?page=Category/Voice">Voice</a></li>
                                <li><a href="<%= request.getContextPath()%>/PagesController?page=Category/Speech">Speech</a></li>
                                <li><a href="<%= request.getContextPath()%>/PagesController?page=Category/Mathematics">Mathematics</a></li>
                                <li><a href="<%= request.getContextPath()%>/PagesController?page=Category/Cooking">Cooking</a></li>
                                <li><a href="<%= request.getContextPath()%>/PagesController?page=Category/Technology">Technology</a></li>
                                <li><a href="<%= request.getContextPath()%>/PagesController?page=Category/Others">Others</a></li>
                </ul>
        </div> 
    <!--End creating the navbar for mobile phone-->


        <div class="before-content">
            <div class="specy-logn caty"><h1><%=request.getAttribute("categoryName")%></h1></div>
        </div>

        <div class="videos-container">
        <% for(int i = (videosList.size()-1); i >= 0; i--){ %>
    	 <div class="single-unit">
            <a href="<%= request.getContextPath()%>/PagesController?page=Creator-Contact-Information-<%=videosList.get(i).getRefugeeIdFK()%>"><div class="created-by"><b>Created By:</b> 
			<% rs = stmt.executeQuery("SELECT * FROM refugee WHERE refugee_id = '" +videosList.get(i).getRefugeeIdFK()+"'"); 
			while(rs.next()) {
				regCreat.add(new Refugee
					    (rs.getString("refugee_id"), 
						rs.getString("first_name"),
						rs.getString("last_name"),
						rs.getString("email"),
						rs.getString("phone_number"),
						rs.getString("pass"),
						rs.getString("birth_date")
						));
			}
			String firstName = regCreat.get(0).getFirstName();
			String lastName = regCreat.get(0).getLastName();
			out.print(firstName + " " + lastName);
			regCreat.remove(0);
			%>
			
			</div></a>
            <div id="video-p">
                <video id="my-video" src="Photos/<%=videosList.get(i).getAddress()%>" controls></video>
                <div class="description">Description: <%=videosList.get(i).getVideoDescription()%></div>
            </div>
        </div>
        <% } %>
    </div>
    </body>
</html>