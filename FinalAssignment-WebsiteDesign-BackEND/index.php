<?php

$servername = "192.168.0.100";
$username = "mohmmadh_frontend";
$password = "frontend123";
$dbname = "mohmmadh_frontend";

$conn = new mysqli($servername, $username, $password, $dbname);

if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}
$sql = "SELECT * from news order by id desc limit 3";
$result = mysqli_query($conn, $sql);

// Get recent News line1
$sql = "SELECT * from news order by id desc limit 0,4";
$recentLine1 = mysqli_query($conn, $sql);


// Get recent News line2
$sql = "SELECT * from news order by id desc limit 4,4";
$recentLine2 = mysqli_query($conn, $sql);

// Get Politics recent news 
$sql = "SELECT * from news where category_id = 5 order by id desc limit 0,4";
$politics1 = mysqli_query($conn, $sql);

// Get Politics recent news 
$sql = "SELECT * from news where category_id = 5 order by id desc limit 4,4";
$politics2 = mysqli_query($conn, $sql);

// Get Health recent news 
$sql = "SELECT * from news where category_id = 2 order by id desc limit 0,4";
$health1 = mysqli_query($conn, $sql);

// Get Health recent news 
$sql = "SELECT * from news where category_id = 2 order by id desc limit 4,4";
$health2 = mysqli_query($conn, $sql);


// Get Other news 
$sql = "SELECT * from news where category_id = 9 order by id desc limit 4";
$others = mysqli_query($conn, $sql);

// Get Economic news 
$sql = "SELECT * from news where category_id = 3 order by id desc limit 4";
$economic = mysqli_query($conn, $sql);


// Get Consumables news 
$sql = "SELECT * from news where category_id = 6 order by id desc limit 4";
$consumables = mysqli_query($conn, $sql);

// Get Agriculture news 
$sql = "SELECT * from news where category_id = 4 order by id desc limit 4";
$agri = mysqli_query($conn, $sql);

// Get Education news
$sql = "SELECT * from news where category_id = 7 order by id desc limit 4";
$education = mysqli_query($conn, $sql);

// Get Manifacutaing news
$sql = "SELECT * from news where category_id = 8 order by id desc limit 4";
$manifact = mysqli_query($conn, $sql);
?>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="Online news website in Jordan">
        <meta name="keywords" content="News, Jordan, Amman, Health, Politics">
        <meta name="author" content="mohmmad hannoun">
        <link rel="stylesheet" href="https://unpkg.com/swiper@8/swiper-bundle.min.css"/>
        <link rel="stylesheet" href="design.css">
        <link rel="Icon" href="Photos/logo.png">
        <title>JoNews</title>
    </head>
    <body>
       
        <!--Header code, including logo, base name, and search bar-->
        
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

    <!--Creating the span-->
            <!-- Slider main container -->
            <div class="swiper">
                <!-- Additional required wrapper -->
                <div class="swiper-wrapper">
                <!-- Slides -->
                    <?php
                            // Prepare slider data
                            while($row = mysqli_fetch_array($result)) {
                                $id = $row['id'];
                                $title = $row['title'];
                                $img = 'uploads/'.$row['image'];
                                $teaser=  substr($row['description'],0,124);
                            
                    ?>
                    <div class="swiper-slide">
                        <a href="News-Page.php?id=<?php echo $id ?>" class="slider-a">
                            <div id="slider">
                                <!--52 characters and then break line-->
                            <img src="<?php echo $img ?>">
                            <h3><?php echo $title ?></h3>
                            <p><?php echo $teaser?></p>
                            </div>
                        </a>
                    </div>
                    <?php }?>
                </div>
                <!-- If we need pagination -->
                <div class="swiper-pagination"></div>
            
                <!-- If we need navigation buttons -->
                <div class="swpr-war">
                <div class="swiper-button-prev"></div>
                <div class="swiper-button-next"></div>
                </div>
            </div>
        <script src="https://unpkg.com/swiper@8/swiper-bundle.min.js"></script>
            <script src="script.js"></script>
        <!--End of slider-->

        <!--Recent News Start-->
        <div class="news-box">
            <div class="title">Recent News</div>
            <div class="should-show">
            <?php
            while($row = mysqli_fetch_array($recentLine1)) {

                            
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
            <!--Start Additional 4-->
            <div class="should-hid">
            <?php 
            while($row = mysqli_fetch_array($recentLine2)){
                $id = $row['id'];
                $title = $row['title'];
                $img = 'uploads/'.$row['image'];
                $teaser=  substr($row['description'],0,124);
            ?>
            <a href="News-Page.php?id=<?php echo $id ?>" class="gen">
                    <div class="gen">
                        <div class="news-img">
                            <img src="<?php echo $img?>" alt="A recent news">
                        </div>
                        <div class="news-txt-short">
                            <h4><?php echo $teaser?></h4>
                        </div>
                    </div>
            </a>
            <?php }?>
            </div>
        </div>
        <!--End Of Recent News-->

        <!--Start First Category-->
        <div class="news-box">
            <div class="title">Politics</div>
            <div class="should-show">
            <?php 
            while($row = mysqli_fetch_array($politics1)){
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
                <!--Start Additional 4-->
                <div class="should-hid">
                <?php 
            while($row = mysqli_fetch_array($politics2)){
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
        <!--End First Category-->

        <!--Start Second Category-->
        <div class="news-box">
            <div class="title">Health</div>
            <div class="should-show">
            <?php 
            while($row = mysqli_fetch_array($health1)){
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
                <!--Start Additional 4-->
                <div class="should-hid">
                <?php 
            while($row = mysqli_fetch_array($health2)){
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
        
        <!--End Second Category-->

        <!--Start Third Category-->
        <div class="news-box should-hid-sec">
            <div class="title">Manufacturing</div>
            <div class="should-show">
            <?php 
            while($row = mysqli_fetch_array($manifact)){
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
        
        <!--End Third Category-->

        <!--Start Fourth Category-->
        <div class="news-box should-hid-sec">
            <div class="title">Education</div>
            <div class="should-show">
            <?php 
            while($row = mysqli_fetch_array($education)){
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
                <!--Start Additional 4-->
               
        </div>
        <!--End Fourth Category-->
        <div class="special-beside-big">
            <div class="beside-each">
                <div class="title-beside">Others</div>
                <?php
                            // Prepare slider data
                            while($row = mysqli_fetch_array($others)) {
                                $id = $row['id'];
                                $title = $row['title'];
                                $img = 'uploads/'.$row['image'];
                                $teaser=  substr($row['description'],0,100);
                            
                ?>
                    <div>
                        <a href="News-Page.php?id=<?php echo $id ?>" class="group">
                        <div class="img-beside"> 
                            <img src="<?php echo $img?>" alt="A recent news">
                        </div>
                        <div class="beside-short">
                            <h4><?php echo $teaser?></h4>
                        </div>
                        </a>
                    </div>
                    <?php } ?>
            </div>

            <div class="beside-each no-bord-lft">
                <div class="title-beside">Consumables</div>
                <?php
                            // Prepare slider data
                            while($row = mysqli_fetch_array($consumables)) {
                                $id = $row['id'];
                                $title = $row['title'];
                                $img = 'uploads/'.$row['image'];
                                $teaser=  substr($row['description'],0,100);
                            
                ?>
                    <div>
                        <a href="News-Page.php?id=<?php echo $id ?>" class="group">
                        <div class="img-beside"> 
                            <img src="<?php echo $img?>" alt="A recent news">
                        </div>
                        <div class="beside-short">
                            <h4><?php echo $teaser?></h4>
                        </div>
                        </a>
                    </div>
                    <?php } ?>
                
                   
                
            </div>
            <div class="beside-each no-bord-lft">
                <div class="title-beside">Economy</div>
                <?php
                            // Prepare slider data
                            while($row = mysqli_fetch_array($economic)) {
                                $id = $row['id'];
                                $title = $row['title'];
                                $img = 'uploads/'.$row['image'];
                                $teaser=  substr($row['description'],0,100);
                            
                ?>
                    <div>
                        <a href="News-Page.php?id=<?php echo $id ?>" class="group">
                        <div class="img-beside"> 
                            <img src="<?php echo $img?>" alt="A recent news">
                        </div>
                        <div class="beside-short">
                            <h4><?php echo $teaser?></h4>
                        </div>
                        </a>
                    </div>
                    <?php } ?>
                
                
            </div>
            <div class="beside-each no-bord-lft">
                <div class="title-beside">Agriculture</div>
                <?php
                            // Prepare slider data
                            while($row = mysqli_fetch_array($agri)) {
                                $id = $row['id'];
                                $title = $row['title'];
                                $img = 'uploads/'.$row['image'];
                                $teaser=  substr($row['description'],0,100);
                            
                ?>
                    <div>
                        <a href="News-Page.php?<?php echo $id ?>" class="group">
                        <div class="img-beside"> 
                            <img src="<?php echo $img?>" alt="A recent news">
                        </div>
                        <div class="beside-short">
                            <h4><?php echo $teaser?></h4>
                        </div>
                        </a>
                    </div>
                    <?php } ?>
                

                   
                
            </div>
        </div>    

            

            <div class="fasel"></div>
            
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













