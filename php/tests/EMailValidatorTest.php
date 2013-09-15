// EMailValidatorTest.php
<?php

require_once "./php/EMailValidator.php";

class EMailValidatorTest extends PHPUnit_Framework_TestCase {

	public function test_emptyMailYieldsError() {
		$validator = new EMailValidator();
		$validator->validate("");
		$this->assertEquals(false, $validator->result());
		$this->assertEquals("Hostname field was left blank ! Retry.", $validator->message());
	}
}

?>