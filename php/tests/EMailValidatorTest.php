// EMailValidatorTest.php
<?php

require_once "./php/EMailValidator.php";

class EMailValidatorTest extends PHPUnit_Framework_TestCase {

	public function test_emptyEMailYieldsError() {
		$validator = new EMailValidator();
		$validator->validate("");
		$this->assertEquals(false, $validator->result());
		$this->assertEquals("Hostname field was left blank ! Retry.", $validator->message());
	}

	public function test_standardEMailYieldsNoError() {
		$validator = new EMailValidator();
		$validator->validate("cth@octo.com");
		$this->assertEquals(true, $validator->result());
		$this->assertEquals("", $validator->message());

	}
}

?>