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
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="design.css">
        <link rel="Icon" href="Photos/logo.JPG">
        <title>Update Personal Information</title>
    </head>
    <body>
	<% LinkedList<Refugee> refugee = (LinkedList)request.getSession().getAttribute("allInfo");  %>
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
                <a href="<%= request.getContextPath()%>/LoggedController?action=personal-account"><i class="fa fa-user user-logo"></i></a>
                <a href="<%= request.getContextPath()%>/LoggedController?action=personal-account"><h3>Personal Account</h3></a> 
            </div>
            
        </header>
        <!--Header Ends-->

        <div class="before-content">
            <div class="specy-logn"><h1>Update Personal Information</h1></div>
        </div>

        <form action="<%=request.getContextPath()%>/LoggedController" method="post" class="secret-questions hid-big">

            <label for="secret-id-upd" class="lbl">ID</label><br>
            <input type="text" id="secret-id-upd" name="refug-id" class="ques" placeholder="Enter your ID" value="<%=refugee.get(0).getRefugeeId()%>" readonly><br>

            <label for="firsty-upd" class="lbl">First Name</label><br>
            <input type="text" id="firsty-upd" name="first-name" class="ques" placeholder="Enter your first name" value="<%=refugee.get(0).getFirstName()%>" required><br>

            <label for="lasty-upd" class="lbl">Last Name</label><br>
            <input type="text" id="lasty-upd" name="last-name" class="ques" placeholder="Enter your first name" value="<%=refugee.get(0).getLastName()%>" required><br>

            <label for="email-o-upd" class="lbl">Email</label><br>
            <input type="text" id="email-o-upd" name="email" class="ques" placeholder="Enter your email" value="<%=refugee.get(0).getEmail()%>" required><br>

            <label for="phonee-upd" class="lbl">Phone Number</label><br>
            <input type="text" id="phonee-upd" name="phone-number" class="ques" placeholder="Enter your phone number" value="<%=refugee.get(0).getPhoneNumber()%>" required><br>

            <label for="passy-upd" class="lbl">Password</label><br>
            <input type="password" id="passy-upd" name="pass" class="ques" placeholder="Enter your password" value="<%=refugee.get(0).getPassword()%>" required><br>

            <label for="birthy-upd" class="lbl">Birth Date</label><br>
            <input type="date" id="birthy-upd" name="birth-date" class="ques" value="<%=refugee.get(0).getBirthDate()%>" required><br>
            <input type="hidden" name="action" value="updatesubmit"> 
            <button type="submit">Update</button>
        </form>

        <form action="<%=request.getContextPath()%>/LoggedController" method="post" class="hid-mob centr">
        <div>
            <label for="secret-id-upd" class="lbl">ID</label><br>
            <input type="text" id="secret-id-upd" name="refug-id" class="ques-big" placeholder="Enter your ID" value="<%= refugee.get(0).getRefugeeId() %>"  readonly><br>


            <label for="lasty-upd" class="lbl">Last Name</label><br>
            <input type="text" id="lasty-upd" name="last-name" class="ques-big" placeholder="Enter your first name" value="<%= refugee.get(0).getLastName() %>" required><br>


            <label for="phonee-upd" class="lbl">Phone Number</label><br>
            <input type="text" id="phonee-upd" name="phone-number" class="ques-big" placeholder="Enter your phone number" value="<%= refugee.get(0).getPhoneNumber() %>" required><br>

            <label for="birthy-upd" class="lbl">Birth Date</label><br>
            <input type="date" id="birthy-upd" name="birth-date" class="ques-big" value="<%= refugee.get(0).getBirthDate() %>" required><br>
        </div>
        <div>
            <label for="firsty-upd" class="lbl">First Name</label><br>
            <input type="text" id="firsty-upd" name="first-name" class="ques-big" placeholder="Enter your first name" value="<%= refugee.get(0).getFirstName() %>" required><br>

           

            <label for="email-o-upd" class="lbl">Email</label><br>
            <input type="text" id="email-o-upd" name="email" class="ques-big" placeholder="Enter your email" value="<%= refugee.get(0).getEmail() %>" required><br>

            

            <label for="passy-upd" class="lbl">Password</label><br>
            <input type="password" id="passy-upd" name="pass" class="ques-big" placeholder="Enter your password" value="<%= refugee.get(0).getPassword() %>" required><br>
             <input type="hidden" name="action" value="updatesubmit"> 
            <button type="submit">Update</button>
        </div>
            
        </form>

    </body>
</html>