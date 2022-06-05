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
        <title>Upload videos</title>
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
            <div class="specy-logn"><h1>Upload a Video</h1></div>
        </div>

        <!--Adding Content Starts-->
        <form action="<%=request.getContextPath()%>/LoggedController" method="post" class="secret-questions uppy" enctype="multipart/form-data">
            <label for="cat-select" class="lbl">Category</label>
            <select name="category-selected" id="cat-select" class="ques" required>
                            <option value="" disabled selected>Category Name</option>
                            <option value="Sport">Sport</option>
                            <option value="Voice">Voice</option>
                            <option value="Speech">Speech</option>
                            <option value="Mathematics">Mathematics</option>
                            <option value="Cooking">Cooking</option>
                            <option value="Technology">Technology</option>
                            <option value="Others">Others</option>
            </select>

            <label for="vid-upload">Upload Video</label>
            <input type="file" id="vid-upload" name="vid-upload" accept="image/*" class="hidden-up" required>


            <label for="description-fo" class="lbl">Description</label>
            <input type="text" id="description-fo" name="descripty" placeholder="A description of the video" class="ques" required>
            <input type="hidden" name="action" value="uploadvideo"> 
            <button type="submit" class="sbt">
                Upload
            </button>
    
         </form>
         	<div style="margin: auto; text-align: center; color: green; margin-top: -20px">
         	${message}
         	<% session.removeAttribute("message"); %>
         	</div>
         <!--Adding Content Ends-->
    </body>
</html>
