var accountSid = 'ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX';
var authToken = 'your_auth_token';
var Twilio = require('twilio').Twilio;

var client = new Twilio(accountSid, authToken);

client.chat.credentials('CRXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX').delete().then(function(response) {
    console.log(response);
}).catch(function(error) {
    console.log(error);
});
