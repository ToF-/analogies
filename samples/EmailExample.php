<HTML>
<HEAD>
<TITLE> email example </TITLE>
</HEAD>
<BODY>

<?php  

// the code below checks the $subject field from a Web form
// if the $subject is not blank the message is sent
// else (the subject field is blank) an error is sent back to the user

if ($_POST[subject] <> "") {

    mail("jdoe@www.utexas.edu", $_POST[subject], $_POST[message]);

// don't forget to have your php script print something
// if you just send mail the users will see an empty page

    print("Your message has been sent\n");

} else {
     print("The subject field was blank.  You must complete the subject field");
}

?>


</BODY>
</HTML>