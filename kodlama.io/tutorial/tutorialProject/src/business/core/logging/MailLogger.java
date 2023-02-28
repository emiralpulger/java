package business.core.logging;

public class MailLogger implements BaseLogger{
    public void log(String data){
        System.out.println("Mail gönderildi : " + data);
    }
}
