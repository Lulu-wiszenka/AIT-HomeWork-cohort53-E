public class DHL implements MailDeliveryService{

    @Override
    public String getName() {
        return "DHL";
    }

    @Override
    public void sendMail() {
        System.out.println("«Положи письмо в конверт, поставь марку, отправь»");
    }
}
