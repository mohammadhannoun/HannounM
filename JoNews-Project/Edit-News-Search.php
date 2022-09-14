<?php
session_start();
if(!isset($_SESSION['code'])){
    header("Location:Verifying-Page.php");
}
// 
if($_GET['id']){
    $id = $_GET['id'];
    
        $servername = "192.168.0.100";
        $username = "mohmmadh_frontend";
        $password = "frontend123";
        $dbname = "mohmmadh_frontend";
        $conn = new mysqli($servername, $username, $password, $dbname);
		$msg = '';
        if ($conn->connect_error) {
            die("Connection failed: " . $conn->connect_error);
        }
        $sql = "select * from news where id = '$id'";
        $result = mysqli_query($conn, $sql);
        $count = mysqli_num_rows($result);
        if($count){
            header("Location: Editing-News.php?id=$id");
        } else{
        	$msg="Sorry, this news does not exist!";
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
        <title>Edit Search</title>
    </head>
    <body>
        <!--Special Header Starts-->
        <header class="special-header">
            <a href="index.php"><img src="Photos/logo.png" alt="The logo of the website." class="logo"></a>
            <a href="index.php">
                <div class="name">
                    <h2>JoNews</h2>
                    <h5>Legitimate News Only</h5>
                </div>
             </a>
        </header>
         <!--Special Header Ends-->

         <!--Adding News Note Starts-->
         <div class="special-h1">
             Editing Has Become Easier
             <div class="special-sugg hid-mob">
                <a href="Delete-News.php"><div class="sugg">Delete an existing news?</div></a>
                <a href="Adding-News.php"><div class="sugg">Add new news?</div></a>
             </div>
         </div>
         <!--Adding News Note Ends-->

         <!--Suggetions Start-->
         <div class="special-sugg hid-bigy">
            <a href="Delete-News.php"><div class="sugg">Delete an existing news?</div></a>
            <a href="Adding-News.php"><div class="sugg">Add new news?</div></a>
         </div>
         <!--Suggetions End-->
      <div style="width:100% display:block; text-align: center;"><?php echo $msg; ?></div>
         <form action="" method="get" class="secret-questions edit">
            <label for="search-box" class="lbl">News ID</label>
            <input name="id"type="text" id="search-box" placeholder="Enter the ID of the news" class="ques" required>

            <button type="submit" class="sbt">
                Search
            </button>
         </form>
    </body>
</html>

