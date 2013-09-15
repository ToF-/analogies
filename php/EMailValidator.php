// EMailValidator.php

<?php
class EMailValidator {
	
	public function validate($email) {
		$this->email = $email;
	}

	public function result() {
		return ($this->email == "cth@octo.com");
	}

	public function message() {
		if ($this->email == "cth@octo.com")
			return "";
		else 
			return "Hostname field was left blank ! Retry.";
	}
}
?>