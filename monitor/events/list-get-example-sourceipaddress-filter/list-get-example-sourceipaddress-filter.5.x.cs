// Download the twilio-csharp library from twilio.com/docs/libraries/csharp
using System;
using Twilio;
using Twilio.Rest.Monitor.V1;

public class Example
{
    public static void Main(string[] args)
    {
        // Find your Account SID and Auth Token at twilio.com/console
        const string accountSid = "ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
        const string authToken = "your_auth_token";

        TwilioClient.Init(accountSid, authToken);

        var events = EventResource.Read(
            sourceIpAddress: "104.14.155.29",
            startDate: new DateTime(2015, 4, 25),
            endDate: new DateTime(2015, 4, 25, 23, 59, 59));

        foreach (var e in events)
        {
            Console.WriteLine(e.Description);
        }
    }
}
