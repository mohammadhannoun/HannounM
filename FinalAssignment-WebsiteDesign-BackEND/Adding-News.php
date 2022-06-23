<?php
session_start();
if(!isset($_SESSION['code'])){
    header("Location:Verifying-Page.php");
} 
// Prepare list of categroies
$servername = "192.168.0.100";
$username = "mohmmadh_frontend";
$password = "frontend123";
$dbname = "mohmmadh_frontend";
$display = 'none';
$conn = new mysqli($servername, $username, $password, $dbname);

if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

$sql = "SELECT * from categories";
$result = mysqli_query($conn, $sql);



//Handle form submit
if(isset($_POST['submit'])){
    //Recieve the inputs
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
             
            } else {
              echo "Sorry, there was an error uploading your file.";
            }
          }
          $img  = $_FILES["img-upload"]["name"];
    }

    // the file is uploaded if it was there, now save the data to the database.
$sql = "INSERT INTO news (title, description, category_id, image) VALUES ('$title', '$desc', '$cat_id', '$img')";

if (mysqli_query($conn, $sql)) {
    $msg =  "New record created successfully";
    $display = 'block';
} else {
echo "Error: " . $sql . "<br>" . mysqli_error($conn);
}

mysqli_close($conn);
    
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
        <title>Add News</title>
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
             Adding News Has Become Easier
             <div class="special-sugg hid-mob">
                <a href="Delete-News.php"><div class="sugg">Delete an existing news?</div></a>
                <a href="Edit-News-Search.php"><div class="sugg">Edit an existing news?</div></a>
             </div>
         </div>
         <!--Adding News Note Ends-->

         <!--Suggetions Start-->
         <div class="special-sugg hid-bigy">
            <a href="Delete-News.php"><div class="sugg">Delete an existing news?</div></a>
            <a href="Edit-News-Search.php"><div class="sugg">Edit an existing news?</div></a>
         </div>
         <!--Suggetions End-->
         <div style='text-align:center;width: 50%;margin: auto ;display:<?php echo $display?>'>
            <?php echo $msg?>
        </div>
         <!--Adding Content Starts-->
         <form action="" method="POST" enctype="multipart/form-data" class="secret-questions">
            <label for="cat-select" class="lbl">Category</label>

            <select name="category-selected" id="cat-select" class="ques" required>
                            <option value="" disabled selected>Category Name</option>
                            <?php
                                while($row = mysqli_fetch_array($result)) {
                                    echo '<option   value="'.$row['id'].'">'.$row['category_name'].'</option>';
                                }

                            ?>
            </select>
            <label for="headline-insert" class="lbl">Headline</label>
            <input name= "headline-insert" type="text" id="headline-insert" placeholder="The Headline of the news" class="ques" required>

            <label for="img-upload">Upload Image</label>
            <input type="file" id="img-upload" name="img-upload" accept="image/*" class="hidden-up" required>

            <label for="inserted-text" class="lbl">Text</label>
            <div class="cntr">
            <textarea id="inserted-text" name="inserted-text" rows="40" cols="30" required></textarea>
            <h6 class="h6-nto">*Note to separate paragraphs copy and paste the between quotes text "br br" and put < > around each one.</h6>
            </div>
            <button name="submit" type="submit" class="sbt">
                Publish
            </button>
         </form>
         <!--Adding Content Ends-->
    </body>
</html>