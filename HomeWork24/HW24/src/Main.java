public class Main {
    public static void main(String[] args) {

        IntArrayHandler numbers1 = new IntArrayHandler("32;1;6;5;44;35;87");
        System.out.println(numbers1);
        System.out.println(numbers1.amountNumbers());

        System.out.println("-------------------");

        Card card = new Card("3435678324569893", "Johna Hill");
        System.out.println(card);
    }

}
