package ucu.edu.ua.task2;

import java.time.LocalDate;

import com.mailjet.client.errors.MailjetException;

import ucu.edu.ua.task2.mailcode.HappyBirthdayCode;

public class Main {

    private static int YEAR_BIRTH = 1991;
    private static int MONTH_BIRTH = 3;
    private static int DAY_BIRTH = 14;

    public static void main(String[] args) {

        Client client = new Client("Oles", 
            LocalDate.of(1991, 3, 14), 
            Sex.MALE, 
            "olesdobosevysch.gmail.com"
        );

        MailInfo mailInfo = new MailInfo(client, new HappyBirthdayCode());

        System.out.println(mailInfo.generate());

        MailSender sender = new MailSender();

        try {
            sender.sendMail(mailInfo);
        } catch (MailjetException e) {
            e.printStackTrace();
        }

    }
}
