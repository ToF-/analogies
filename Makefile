email: samples/EmailExample.php
	sudo cp samples/EmailExample.php /Library/WebServer/Documents/.

ev: samples/EMailValidator.html samples/EMailValidation.php
	sudo cp samples/EMailValidator.html /Library/WebServer/Documents/.
	sudo cp samples/EMailValidation.php /Library/WebServer/Documents/.



phpSample: samples/PhpSample.*
	sudo cp samples/PhpSample.php /Library/WebServer/Documents/.

samples: samples/*
	sudo rm -Rf /Library/WebServer/Documents/samples
	sudo cp -r samples /Library/WebServer/Documents/.

