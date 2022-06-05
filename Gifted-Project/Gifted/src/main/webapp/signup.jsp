<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="design.css">
        <link rel="Icon" href="Photos/logo.JPG">
        <title>Sign Up</title>
    </head>
    <body>

        <header class="spec-hdr-up">
            <a href="<%= request.getContextPath()%>/PagesController?page=index" class="hdr-spec bb" style="border: none;"><h1>Gifted</h1></a>
            <div id="logo">
                <a href="<%= request.getContextPath()%>/PagesController?page=index">
                    <img src="Photos/logo.JPG" alt="The logo of the website" class="uppy-img">
                </a>
            </div>
        </header>

        <div class="note-logn">
            <div class="texty">Note: Logging in is ONLY allowed to Refugees so if you are not a refugee you can go back, and watch the videos that were created by talented refugees.</div>
            <a href="<%= request.getContextPath()%>/PagesController?page=index"><div class="watch-vids">Watch Videos</div></a>
        </div>

        <div class="before-content">
            <div class="specy-logn"><h1>Sign Up</h1></div>
        </div>

        <form action="<%=request.getContextPath()%>/MembersController" method="post" class="secret-questions hid-big">

            <label for="secret-id" class="lbl">ID</label><br>
            <input type="text" id="secret-id" name="refug-id" class="ques" placeholder="Enter your ID" required><br>

            <label for="firsty" class="lbl">First Name</label><br>
            <input type="text" id="firsty" name="first-name" class="ques" placeholder="Enter your first name" required><br>

            <label for="lasty" class="lbl">Last Name</label><br>
            <input type="text" id="lasty" name="last-name" class="ques" placeholder="Enter your first name" required><br>

            <label for="email-o" class="lbl">Email</label><br>
            <input type="text" id="email-o" name="email" class="ques" placeholder="Enter your email" required><br>

            <label for="phonee" class="lbl">Phone Number</label><br>
            <input type="text" id="phonee" name="phone-number" class="ques" placeholder="Enter your phone number" required><br>

            <label for="passy" class="lbl">Password</label><br>
            <input type="password" id="passy" name="pass" class="ques" placeholder="Enter your password" required><br>

            <label for="birthy" class="lbl">Birth Date</label><br>
            <input type="date" id="birthy" name="birth-date" class="ques" required><br>
            <input type="hidden" name="action" value="signupsubmit"> 
            <button type="submit">Sign Up</button>
        </form>

        <form action="<%=request.getContextPath()%>/MembersController" method="post" class="hid-mob">
        <div>
            <label for="secret-code" class="lbl">ID</label><br>
            <input type="text" id="secret-id" name="refug-id" class="ques-big" placeholder="Enter your ID" maxlength="100" required><br>


            <label for="lasty" class="lbl">Last Name</label><br>
            <input type="text" id="lasty" name="last-name" class="ques-big" placeholder="Enter your first name" maxlength="100" required><br>


            <label for="phonee" class="lbl">Phone Number</label><br>
            <input type="text" id="phonee" name="phone-number" class="ques-big" placeholder="Enter your phone number" maxlength="10" required><br>

            <label for="birthy" class="lbl">Birth Date</label><br>
            <input type="date" id="birthy" name="birth-date" class="ques-big" required><br>
        </div>
        <div>
            <label for="firsty" class="lbl">First Name</label><br>
            <input type="text" id="firsty" name="first-name" class="ques-big" placeholder="Enter your first name" maxlength="100" required><br>

           

            <label for="email-o" class="lbl">Email</label><br>
            <input type="text" id="email-o" name="email" class="ques-big" placeholder="Enter your email" maxlength="254" required><br>

            

            <label for="passy" class="lbl">Password</label><br>
            <input type="password" id="passy" name="pass" class="ques-big" placeholder="Enter your password" maxlength="254" required><br>
            <input type="hidden" name="action" value="signupsubmit"> 
            <button type="submit">Sign Up</button>
        </div>
        </form>
        <div style="color: red;  margin: auto; margin-top: -15px; margin-left: 2px; text-align: center">
            	${message}
            	<% session.removeAttribute("message"); %>
            </div>

    </body>
</html>