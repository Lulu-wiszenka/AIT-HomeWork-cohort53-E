public class EMail implements MailDeliveryService {

    @Override
    public String getName() {
        return "EMail";
    }

    @Override
    public void sendMail() {
        System.out.println("«Отправить письмо через Интернет»");
    }
}
