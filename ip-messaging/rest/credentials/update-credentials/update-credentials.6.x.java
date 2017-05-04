import com.twilio.sdk.TwilioIPMessagingClient;
import com.twilio.sdk.resource.instance.ipmessaging.Credential;
import com.twilio.sdk.resource.list.ipmessaging.CredentialList;

public class TwilioTest {
    // Find your Account Sid and Token at twilio.com/user/account
    public static final String ACCOUNT_SID = "ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
    public static final String AUTH_TOKEN = "your_auth_token";
    public static final String SERVICE_SID = "ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
    public static final String CREDENTIAL_SID = "CREDENTIAL_SID";

    public static void main(String args[]) throws TwilioRestException {
        // Initialize the client
        TwilioIPMessagingClient client = new TwilioIPMessagingClient(ACCOUNT_SID, AUTH_TOKEN);

        // Update the credential
        Credential credential = client.getCredential(CREDENTIAL_SID);
        final Map<String, String> credParams = new HashMap<String, String>();
        credParams.put("ApiKey", "NewApiKey");
        credential.update(credParams);
        System.out.println(credential);
    }
}