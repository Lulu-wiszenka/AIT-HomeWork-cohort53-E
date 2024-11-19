import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        MailSender senderPost = new MailSender();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите способ доставки почты:");
        MailDeliveryService[] sender = senderPost.getServices();
        for (int i = 0; i < sender.length; i++) {
            System.out.println(i +" "+ sender[i].getName());
        }
        int userChose = scanner.nextInt();
        if (userChose<0 || userChose>sender.length){
            System.out.println("Способ отсутствует");
        } else {
            senderPost.sendMail(sender[userChose]);
        }


    }
}
