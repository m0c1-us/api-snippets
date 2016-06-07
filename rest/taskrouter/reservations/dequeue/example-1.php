<?php
// Get the PHP helper library from twilio.com/docs/php/install
require_once('/path/to/twilio-php/Services/Twilio.php'); // Loads the library

// Your Account Sid and Auth Token from twilio.com/user/account
$accountSid = "ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
$authToken = "{{ auth_token }}";
$workspaceSid = "{{ workspace_sid }}";
$taskSid = "{{ task_sid }}";
$reservationSid = "{{ reservation_sid }}";

$client = new TaskRouter_Services_Twilio($accountSid, $authToken, $workspaceSid);

// dequeue a reservation
$reservation = $client->workspace->tasks->get($taskSid)->reservations($reservationSid);
$reservation->update(
	array(
		'Instruction' => 'dequeue',
		'DequeueFrom' => '+18001231234'
	)
);