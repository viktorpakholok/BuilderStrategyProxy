package ucu.edu.ua.task2;

import org.json.JSONArray;
import org.json.JSONObject;

import com.mailjet.client.ClientOptions;
import com.mailjet.client.MailjetClient;
import com.mailjet.client.MailjetRequest;
import com.mailjet.client.MailjetResponse;
import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.resource.Emailv31;

import io.github.cdimascio.dotenv.Dotenv;

public class MailSender {
    public void sendMail(MailInfo mailInfo) throws MailjetException {
        
        MailjetRequest request;
        MailjetResponse response;
        Dotenv dotenv = Dotenv.load();
        String apiKey = dotenv.get("API_KEY");
        String apiSecret = dotenv.get("API_SECRET");
        
        ClientOptions options = ClientOptions.builder()
                .apiKey(apiKey)
                .apiSecretKey(apiSecret)
                .build();

        MailjetClient client = new MailjetClient(options);

        request = new MailjetRequest(Emailv31.resource)
                .property(Emailv31.MESSAGES, new JSONArray()
                        .put(new JSONObject()
                                .put(Emailv31.Message.FROM, new JSONObject()
                                        .put("Email", "olesdobosevych@ucu.edu.ua")
                                        .put("Name", "Oles"))
                                .put(Emailv31.Message.TO, new JSONArray()
                                        .put(new JSONObject()
                                                .put("Email", mailInfo.getClient().getEmail())
                                                .put("Name", mailInfo.getClient().getName())))
                                .put(Emailv31.Message.SUBJECT, "How can you?")
                                .put(Emailv31.Message.HTMLPART, "<h3>Dear student<h3><br>You are being kicked out of Mailjet due to wrong behaviour. May the delivery force be with you!")));
        response = client.post(request);
        // System.out.println(response.getStatus());
        // System.out.println(response.getData());
    }
}