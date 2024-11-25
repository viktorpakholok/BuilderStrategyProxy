package ucu.edu.ua.task2;

import java.util.List;

public class MailBox {
    private List<MailInfo> infos;

    public void addMailInfo(MailInfo mailInfo) {
        infos.add(mailInfo);
    }

}
