<?php
$display = 'none';
session_start();
if(isset($_SESSION['code'])){
    header("Location:Adding-News.php");
} 
if (isset($_POST['secret-code']) AND isset($_POST['secret-word'])){
    $code = $_POST['secret-code'];
    $word = $_POST['secret-word'];

    if($code == 'hannoun' AND $word == 'hannoun'){
        
        $_SESSION["code"] = $code;
        header("Location: Adding-News.php");
    }else{
        $msg = 'Invalid username or password';
        $display = 'block';
    }
}

?>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="design.css">
        <link rel="stylesheet" href="https://unpkg.com/swiper@8/swiper-bundle.min.css"/>
        <link rel="Icon" href="Photos/logo.png">
        <title>Verifying Page</title>
    </head>
    <body>
         <!--Header Starts-->
         <header>
            <a href="index.php"><img src="Photos/logo.png" alt="The logo of the website." class="logo"></a>
            <a href="index.php">
                <div class="name">
                    <h2>JoNews</h2>
                    <h5>Legitimate News Only</h5>
                </div>
            </a>
            <form action="search-result.php" method="get">
                    <input type="text" placeholder="Headline" name="search">
                </form>
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
                            <li><a href="Verifying-Page.php" class="add-news-menu"><sup>+</sup>Add News</a></li>
                                <li><a href="News-List.php?category_id=2">Health</a></li>
                                <li><a href="News-List.php?category_id=3">Economy</a></li>
                                <li><a href="News-List.php?category_id=4">Agriculture</a></li>
                                <li><a href="News-List.php?category_id=5">Politics</a></li>
                                <li><a href="News-List.php?category_id=6">Consumables</a></li>
                                <li><a href="News-List.php?category_id=7">Education</a></li>
                                <li><a href="News-List.php?category_id=8">Manufacturing</a></li>
                                <li><a href="News-List.php?category_id=9">Others</a></li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
                <ul class="big-scre">
                <li><a href="News-List.php?category_id=2">Health</a></li>
                    <li><a href="News-List.php?category_id=3">Economy</a></li>
                    <li><a href="News-List.php?category_id=4">Agriculture</a></li>
                    <li><a href="News-List.php?category_id=5">Politics</a></li>
                    <li><a href="News-List.php?category_id=6">Consumables</a></li>
                    <li><a href="News-List.php?category_id=7">Education</a></li>
                    <li><a href="News-List.php?category_id=8">Manufacturing</a></li>
                    <li><a href="News-List.php?category_id=9">Others</a></li>
                </ul>
        </div> 
    <!--End creating the navbar for mobile phone-->
        
        <!--Note Starts-->
        <div class="verif-nt">
            <h2>Important Notes!</h2>
            <p>
                1- This page is sepcifically created for employees to add news.<br><br>
                2- You must answer the following two questions in order to access the adding news page.
            </p>
        </div>
        <!--Note Ends-->

        <!--Questions Start-->
        <div style='text-align:center;width: 50%;margin: auto ;display:<?php echo $display?>'>
            <?php echo $msg?>
        </div>
        <form action="" method="post" class="secret-questions">
            <label for="secret-code" class="lbl">Secret Code</label><br>
            <input type="text" id="secret-code" name="secret-code" class="ques" placeholder="Enter the secret code" required><br>
            <label for="secret-word" class="lbl">Secret Word</label><br>
            <input type="text" id="secret-word" name="secret-word" class="ques" placeholder="Enter the secret word" required><br>
            <button type="submit">Submit</button>
        </form>
        <!--Questions End-->
        <div class="fasel"></div>
        <!--Footer Starts-->
        <footer class="fot-top">
            <img src="Photos/logo.png" class="big-logo">
            <div class="contact-info">
                <h4><b>Contact Us</b></h4>
                <h5>Email : hannounmohmmad6@gmail.com</h5>
                <h5>Phone : 0798981260</h5>
            </div>
            <div class="differ">
                <h4><b>Social Media Accounts</b></h4>
                <div class="accounts">
                    <img src="Photos/insta.png" alt="Instagram Icon, click to visit our instagram page" class="img-small">
                    <h5>Mohammad Hannoun</h5>
                </div>

                <div class="accounts">
                    <img src="Photos/face.png" alt="Instagram Icon, click to visit our instagram page"class="img-small">
                    <h5>Mohammad Hannoun</h5>
                </div>

                <div class="accounts">
                    <img src="Photos/twitter.png" alt="Instagram Icon, click to visit our instagram page" class="img-small">
                    <h5>Mohammad Hannoun</h5>
                </div>
            </div>
            
            <div class="hid-ftt-div">
                <div class="name-fott">
                    <h2>JoNews</h2>
                    <h5>Legitimate News Only</h5>
                </div>
                
                <div class="copy-cont">
                    <span class="copy"><b>C</b></span>
                    <div>All Rights Reserved</div>
                </div>
            </div>

        </footer>
        <!--Footer Ends-->
























    </body>
</html>