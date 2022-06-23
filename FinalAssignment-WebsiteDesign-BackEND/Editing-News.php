<?php
session_start();
if(!isset($_SESSION['code'])){
    header("Location:Verifying-Page.php");
}
// 
$display = 'none';
if (!empty($_POST['submit'])){
    $servername = "192.168.0.100";
    $username = "mohmmadh_frontend";
    $password = "frontend123";
    $dbname = "mohmmadh_frontend";
    $conn = new mysqli($servername, $username, $password, $dbname);

    if ($conn->connect_error) {
        die("Connection failed: " . $conn->connect_error);
    }

    $id = $_POST['id'];
    $title = addslashes($_POST['headline-insert']);
    $desc = addslashes($_POST['inserted-text']);
    //$img = $_POST['img-upload'];
    $cat_id = $_POST['category-selected'];
    
    $target_dir = "uploads/";
    $target_file = $target_dir . basename($_FILES["img-upload"]["name"]);
    $uploadOk = 1;
    $imageFileType = strtolower(pathinfo($target_file,PATHINFO_EXTENSION));
    
    if($_FILES["img-upload"]["tmp_name"]){
            if ($uploadOk == 0) {
                echo "Sorry, your file was not uploaded.";
            } else {
            if (move_uploaded_file($_FILES["img-upload"]["tmp_name"], $target_file)) {
              #echo "The file ". htmlspecialchars( basename( $_FILES["img-upload"]["name"])). " has been uploaded.";
            } else {
              echo "Sorry, there was an error uploading your file.";
            }
          }
          $img  = $_FILES["img-upload"]["name"];
    }

    // the file is uploaded if it was there, now save the data to the database.

    $sql = "update news set title='$title', description='$desc', image='$img', category_id= '$cat_id' where id = '$id'";

    if (mysqli_query($conn, $sql)) {
    $msg =  "News updated successfully";
    $display = 'block';
    } else {
    echo mysqli_error($conn);
    }
   
    mysqli_close($conn);
        
        }


if($_GET['id']){
        $id = $_GET['id'];
        $servername = "192.168.0.100";
        $username = "mohmmadh_frontend";
        $password = "frontend123";
        $dbname = "mohmmadh_frontend";
        $conn = new mysqli($servername, $username, $password, $dbname);

        if ($conn->connect_error) {
            die("Connection failed: " . $conn->connect_error);
        }

        $sql = "select * from news where id = '$id'";
        $result = mysqli_query($conn, $sql);
        $row = mysqli_fetch_array($result);
        $count = mysqli_num_rows($result);
        
        if(!$count){
            die("eeror");
        }
        
        $id = $row[0];
        $cat_id = $row[3];
        $title = $row[1];
        $img = 'uploads/'.$row[4];
        $teaser=  $row[2];
        
        $sql = "SELECT * from categories";
       $result = mysqli_query($conn, $sql);
        
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
        <title>Edit News</title>
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
             Editing News Has Become Easier
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
        <div style='text-align:center;width: 50%;margin: auto ;display:<?php echo $display?>'>
            <?php echo $msg?>
        </div>
         <!--Adding Content Starts-->
         <form action="" method="POST" class="secret-questions" enctype="multipart/form-data" class="secret-questions">
            <label for="cat-select" class="lbl">Category</label>
            <select name="category-selected" id="cat-select" class="ques" required>
                            <option value="" disabled selected>Category Name</option>
                            <?php
                                
                                while($row = mysqli_fetch_array($result)) {
                                    $selected='ss';
                                    if($row['id'] == $cat_id){
                                        $selected = "selected";
                                    }
                                    echo '<option  '.$selected.' value="'.$row['id'].'">'.$row['category_name'].'</option>';
                                }

                            ?>
            </select>
            <label for="headline-insert" class="lbl">Headline</label>
            <input name='headline-insert' value="<?php echo $title?>" type="text" id="headline-insert" placeholder="The inserted headline of the news" class="ques" required>

            <img src=<?php echo $img;?> style="width:40%" />

            <label for="img-upload">Upload Image</label>
            <input value="<?php echo $img ?>" type="file" id="img-upload" name="img-upload" accept="image/*" class="hidden-up" required>

            <label for="inserted-text" class="lbl">Text</label>
            <div class="cntr">
            <textarea id="inserted-text" name="inserted-text" rows="40" cols="30" required><?php echo $teaser?></textarea>
            <h6 class="h6-nto">*Note to separate paragraphs copy and paste the between quotes text "br br" and put < > around each one.</h6>
            </div>
                               
            <input type='hidden' name='id' value="<?php echo $id?>" />
            <input name= "submit" value="Update" type="submit" style="margin-top: 26px;
            width: 102px;
            height: 42px;
            font-size: 1.1rem;
            font-weight: 700;
            color: rgba(39, 160, 197, 0.87);
            background: var(--overlay-color);
            padding-top: 2px;
            border-radius: 3px;
            margin-bottom: 30px;"/>
               
           
         </form>
         <!--Adding Content Ends-->
    </body>
</html>