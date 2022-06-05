<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="design.css">
        <link rel="Icon" href="Photos/logo.JPG">
        <title>Deleting Created Videos</title>
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

        <div class="before-content">
            <div class="specy-logn"><h1>Delete Uploaded Videos</h1></div>
        </div>

        <form action="<%=request.getContextPath()%>/LoggedController" method="post" class="secret-questions">
            <label for="idel-insert" class="lbl">ID</label>
            <input type="text" name="id-del" id="idel-insert" placeholder="The ID of the video" class="ques" required>

            <label for="confirmation" class="lbl">Confirmation</label>
            <input type="text" id="confirmation" name="inserted-text" class="ques" placeholder="Write delete to confirm" required>
			<input type="hidden" name="action" value="deletesubmit"> 
			<div style="color: red; margin-top: 10px; margin-left: 2px;" class="sgn-up">
            	${message}
            	<% session.removeAttribute("message"); %>
            </div>
            <button type="submit" class="sbt">
                Delete
            </button>
         </form>
        
    </body>
</html>