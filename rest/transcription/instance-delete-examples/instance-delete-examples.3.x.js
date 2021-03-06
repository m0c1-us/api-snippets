// Download the Node helper library from twilio.com/docs/node/install
// These consts are your accountSid and authToken from https://www.twilio.com/console
// To set up environmental variables, see http://twil.io/secure
const accountSid = process.env.TWILIO_ACCOUNT_SID;
const authToken = process.env.TWILIO_AUTH_TOKEN;
const client = require('twilio')(accountSid, authToken);

const transcriptionSid = 'TR8c61027b709ffb038236612dc5af8723';

client
  .transcriptions(transcriptionSid)
  .remove()
  .then(() => console.log(`Sid ${transcriptionSid} deleted successfully.`))
  .catch(err => {
    console.log(err.status);
    throw err;
  });
