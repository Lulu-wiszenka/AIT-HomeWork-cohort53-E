import java.util.Arrays;

public class MailSender {
    private MailDeliveryService[] services = {
            new DHL(),
            new EMail(),
            new Owl("Перушка")
    };

    public void sendMail(MailDeliveryService services){
        System.out.println("Отправляем письмо с помощью" + services.getName());
        services.sendMail();
        System.out.println("Ваша почта успешно отправлена!");
    }

    public MailDeliveryService[] getServices(){
        return Arrays.copyOf(services, services.length);
    }

}
