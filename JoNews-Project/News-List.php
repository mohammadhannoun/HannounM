<?php
if(!isset($_GET['category_id'])){
    
}else{
    $category_id = $_GET['category_id'];
    $servername = "192.168.0.100";
    $username = "mohmmadh_frontend";
    $password = "frontend123";
    $dbname = "mohmmadh_frontend";

    $conn = new mysqli($servername, $username, $password, $dbname);

    if ($conn->connect_error) {
        die("Connection failed: " . $conn->connect_error);
    }

    $sql = "SELECT * from categories where id = $category_id";
    $cat = mysqli_query($conn, $sql);
    $data = mysqli_fetch_array($cat);
    $cat_name = $data['category_name'];

    $sql = "SELECT * from news where category_id = $category_id order by id desc";
    $result = mysqli_query($conn, $sql);
    $allCount = mysqli_num_rows($result);
}


?>

<!DOCTYPE html>
<html lang="en">
    <head>

        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="Online news website in Jordan">
        <meta name="keywords" content="News, jordan, categories, news, up-to-date">
        <meta name="author" content="mohmmad hannoun">
        <link rel="stylesheet" href="design.css">
        <link rel="stylesheet" href="https://unpkg.com/swiper@8/swiper-bundle.min.css"/>
        <link rel="Icon" href="Photos/logo.png">
        <title>News List</title>
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
        <div class="continr">
            <a href="Verifying-Page.php" class="add-news-menu"><sup>+</sup>Add News</a>
            <form action="search-result.php" method="get">
                    <input type="text" placeholder="Headline" name="search">
                </form>
        </div>
    </header>
    
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

    <!--Category Name Starts-->
    <div class="cat-name-list">
        <?php echo $cat_name; ?>
    </div>
    <!--Category Name Ends-->

    <!--News Listing Starts-->
    <div class="news-list-container">
    <div class='col-cont'>
        <?php 
        $colsCounter = 1;
        $newsPerRowCounter = 1;
        while($row = mysqli_fetch_array($result)){
            
            $id = $row['id'];
            $title = $row['title'];
            $img = 'uploads/'.$row['image'];
            $teaser=  substr($row['description'],0,124);
            $newsClass= 'news-listing';
            if($newsPerRowCounter == 2 && $colsCounter != $allCount){
                $newsClass= 'news-listing top-down';
            } 
            
                     
        
        ?>
       
        <div class="<?php echo $newsClass?>">
            <a href="News-Page.php?id=<?php echo $id ?>">
                <img src="<?php echo $img; ?>" alt="A news photo and text">
                <div class="text-container">
                    <!--38 MAX-->
                    <h1><?php echo $title; ?></h1>
                    <!--145 MAX-->
                    <p><?php echo $teaser; ?></p>
                </div>
            </a>
        </div>
        <?php 
        $newsPerRowCounter++; 

        if($colsCounter % 3 ==0) {
                echo "</div>";
               
                echo " <div class='col-cont'>";
                $newsPerRowCounter = 1;
        }
        $colsCounter++;
          
        }?>
        
       
        
        
    </div>

  
        <!--End News Listing-->
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
                        <h5><a href="https://www.instagram.com/mohmmad_hannoun/" target="_blank"> Mohammad Hannoun </a></h5>
                    </div>

                    <div class="accounts">
                        <img src="Photos/face.png" alt="Instagram Icon, click to visit our instagram page"class="img-small">
                        <h5><a href="https://www.facebook.com/mohmmadhannoun007" target="_blank"> Mohammad Hannoun </a></h5>
                    </div>

                    <div class="accounts">
                        <img src="Photos/twitter.png" alt="Instagram Icon, click to visit our instagram page" class="img-small">
                        <h5><a href="https://twitter.com/mohmmad_hannoun" target="_blank"> Mohammad Hannoun </a></h5>
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
    


    </body>
</html>