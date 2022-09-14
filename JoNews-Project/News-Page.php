<?php
if(!isset($_GET['id'])){
    
}else{
    $id = $_GET['id'];
    $servername = "192.168.0.100";
    $username = "mohmmadh_frontend";
    $password = "frontend123";
    $dbname = "mohmmadh_frontend";

    $conn = new mysqli($servername, $username, $password, $dbname);

    if ($conn->connect_error) {
        die("Connection failed: " . $conn->connect_error);
    }

    $sql = "SELECT * from news where id = $id";
    $result = mysqli_query($conn, $sql);
    $row = mysqli_fetch_array($result);
    //print_r($data);die;
    $id = $row[0];
    $cat_id = $row[3];
    $title = $row[1];
    $img = 'uploads/'.$row[4];
    $teaser=  $row[2];
    $created = $row[5];


// Get recent News line1
$sql = "SELECT * from news where category_id = $cat_id order by id desc limit 0,4";
$recentLine1 = mysqli_query($conn, $sql);


// Get recent News line2
$sql = "SELECT * from news  where category_id = $cat_id order by id desc limit 4,4";
$recentLine2 = mysqli_query($conn, $sql);
}


?>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="Online news website in Jordan">
        <meta name="keywords" content="News, jordan, categories, news, danger, up-to-date, amman">
        <meta name="author" content="mohmmad hannoun">
        <link rel="stylesheet" href="design.css">
        <link rel="stylesheet" href="https://unpkg.com/swiper@8/swiper-bundle.min.css"/>
        <link rel="Icon" href="Photos/logo.png">
        <title><?php echo $title?></title>
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
        <!--Menu Ends-->

        <!--Div Before News Starts-->
        <div class="bfr-news">
            <h6><?php echo $created?></h6>
            <h1><?php echo $title ?></h1>
        </div>
        <!--Div Before News Ends-->

        <!--Full News Starts-->
        <div class="full-news">
            <div>
                <img src="<?php echo $img?>" alt="An indicator image of the news">
                <p>ID: <?php echo $id; ?></p>
            </div>
            <p class="full-news-txt">
               <?php echo $teaser?>
            </p>
        </div>

        <!--End News-->

        <!--Start Related News-->
        <div class="news-box rel-diff">
            <div class="title">Related News</div>
            <div class="should-show">
            <?php
            
            while($row = mysqli_fetch_array($recentLine1)) {

                            
                            $id = $row['id'];
                            $title = $row['title'];
                            $img = 'uploads/'.$row['image'];
                            $teaser=  substr($row['description'],0,124);
            ?>                      
            <a href="News-Page.php?id=<?php echo $id?>" class="gen">
                <div class="gen">
                    <div class="news-img">
                        <img src="<?php echo $img ?>" alt="A recent news">
                    </div>
                    <div class="news-txt-short">
                        <h4><?php echo $teaser ?></h4>
                    </div>
                </div>
             </a>
            <?php } ?>
        
            
        
             
           
                </div>
            <!--Start Additional 4-->
            <div class="should-hid">
                
            <?php
           
            while($row = mysqli_fetch_array($recentLine2)) {

                            
                            $id = $row['id'];
                            $title = $row['title'];
                            $img = 'uploads/'.$row['image'];
                            $teaser=  substr($row['description'],0,124);
            ?>                      
            <a href="News-Page.php?id=<?php echo $id ?>" class="gen">
                <div class="gen">
                    <div class="news-img">
                        <img src="<?php echo $img ?>" alt="A recent news">
                    </div>
                    <div class="news-txt-short">
                        <h4><?php echo $teaser ?></h4>
                    </div>
                </div>
             </a>
            <?php } ?>
        
                
        
                
            </div>
        </div>

        <!--End Related News-->

        <!--Footer Starts-->
        <footer>
            
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