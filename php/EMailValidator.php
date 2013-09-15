// EMailValidator.php

<?php
class EMailValidator {
	
	public function validate($email) {
		$this->email = $email;
		$this->result = true;
		$this->message = "";
		if ($this->email != "cth@octo.com") {
			$this->result = false;
			$this->message = "Hostname field was left blank ! Retry.";
		}
	}

	public function result() {
		return $this->result;
	}

	public function message() {
		return $this->message;
	}
}
?>