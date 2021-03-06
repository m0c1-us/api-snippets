// Install the Java helper library from twilio.com/docs/java/install
import org.joda.time.LocalDate;

import com.twilio.Twilio;
import com.twilio.base.ResourceSet;
import com.twilio.rest.api.v2010.account.Conference;

public class Example {
  // Get your Account SID and Auth Token from https://twilio.com/console
  // To set up environment variables, see http://twil.io/secure
  public static final String ACCOUNT_SID = System.getenv("TWILIO_ACCOUNT_SID");
  public static final String AUTH_TOKEN = System.getenv("TWILIO_AUTH_TOKEN");

  public static void main(String[] args) {
    Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

    ResourceSet<Conference> conferences = Conference.reader().setStatus(Conference.Status.COMPLETED)
        .setDateCreated(LocalDate.parse("2009-07-06")).read();

    // Loop over conferences and print out a property for each one.
    for (Conference conference : conferences) {
      System.out.println(conference.getStatus());
    }
  }
}
