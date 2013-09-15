<!-- EMailValidation.php -->
<html>
<head>
<title> E-mail validator </title>
</head>
<body>
<?php
  $email = $_POST['email'];                                              
  if (!isset($email)){
    die("Host name value wasn't properly submitted.Retry.");
  }

  if(empty($email)) {
    die("Hostname field was left blank ! Retry."); 
  }
                                                      
  if ( (strlen($email) < 3) || (strlen($email) > 200)) {
    die("Invalid E-mail address, E-mail address too long or too short.");
  } elseif(!ereg("@",$email)) {
    die("Invalid E-mail address, no @ symbol found");
  } else {
    echo "<b>".$email."</b> is correct in format.<br>";
  }
                                                      
  list($username,$hostname) = split("@",$email);
                                                      
  if ( (empty($username)) or (empty($hostname)) ) {
    die("username or host name section is not valid.");
  }
                                                      
  if(checkdnsrr($hostname)) {
      echo "<b>". $email ."</b> hostname has a valid MX record !<br>";
  } else {
      die("<b>". $email ."</b> hostname does not exist");
  }
?>
<br>
</body>
</html>
