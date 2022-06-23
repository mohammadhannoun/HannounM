<?php
session_start();
if(!isset($_SESSION['code'])){
    header("Location:Verifying-Page.php");
}
// 
$display='none';
if($_GET['id'] && $_GET['confirm']){
    if($_GET['confirm']!='delete'){
        $msg = 'Please enter delete in the text below';
        #deleted= true;
        $display = 'inline';
        #return;
    }else{
        $servername = "192.168.0.100";
        $username = "mohmmadh_frontend";
        $password = "frontend123";
        $dbname = "mohmmadh_frontend";
    $id = $_GET['id'];

    $conn = new mysqli($servername, $username, $password, $dbname);

    if ($conn->connect_error) {
        die("Connection failed: " . $conn->connect_error);
    }

    $sql = "delete from news where id = '$id'";
   # print($sql);die;
    $cat = mysqli_query($conn, $sql);
    #print_r($cat);die;
    #print(mysqli_affected_rows());die;
    $num = mysqli_affected_rows($conn);
    if($num==1){
        $msg = 'Record has been deleted successfully';
        $deleted= true;
        $display = 'block';
    }else{
        $msg = 'Failed to delete this record';
        $deleted = false;
        $display = 'block';
    }
    }
    
}

?>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equ]iv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="design.css">
        <link rel="stylesheet" href="https://unpkg.com/swiper@8/swiper-bundle.min.css"/>
        <link rel="Icon" href="Photos/logo.png">
        <title>Delete News</title>
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
             Deleting News Has Become Easier
             <div class="special-sugg hid-mob">
                <a href="Adding-News.php"><div class="sugg">Add new news?</div></a>
                <a href="Edit-News-Search.php"><div class="sugg">Edit an existing news?</div></a>
             </div>
         </div>
         <!--Adding News Note Ends-->

         <!--Suggetions Start-->
         <div class="special-sugg hid-bigy">
            <a href="Adding-News.php"><div class="sugg">Add new news?</div></a>
            <a href="Edit-News-Search.php"><div class="sugg">Edit an existing news?</div></a>
         </div>
         <!--Suggetions End-->
        <div style='display:<?php echo $display?> width:100%; text-align:center'>
            <h5><?php echo $msg?></h5>
        </div>
         <!--Removing Content Starts-->
         <form action="" method="GET" class="secret-questions">
            <label for="idel-insert" class="lbl">ID</label>
            <input name="id" type="text" id="idel-insert" placeholder="The ID of the news" class="ques" required>

            <label for="confirmation" class="lbl">Text</label>
            <input type="text" id="confirmation" name="confirm" class="ques" placeholder="Write delete to confirm" required>

            <button name="submit" type="submit" class="sbt">
                Delete
            </button>
         </form>
         <!--Removing Content Ends-->
    </body>
</html>