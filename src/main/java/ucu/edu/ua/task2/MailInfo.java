package ucu.edu.ua.task2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import ucu.edu.ua.task2.mailcode.MailCode;

@AllArgsConstructor
public class MailInfo {
    @Getter
    private Client client;
    private MailCode mailcode;

    public String generate() {
        return mailcode.generate(client);
    }
}
