public class IntArrayHandler {
    private String numbers;
    private int[] arrayHandler;

    public IntArrayHandler (String numbers) {
        this.numbers = numbers;

        String[] numberInString = numbers.split(";");
        arrayHandler = new int[numberInString.length];
        for (int i = 0; i < arrayHandler.length; i++) {
            arrayHandler[i] = Integer.parseInt(numberInString[i]);
        }
    }



    @Override
    public String toString() {
        /*
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length ; i++) {
            sb.append(array[i]).append(";");
        }
        return sb.toString();
         */

        return numbers;
    }

    public long amountNumbers() {
        long result = 0;
        for (int i = 0; i < arrayHandler.length; i++) {
            result +=arrayHandler[i];
        }
        return result;
    }

    public int[] getarrayHandler() {
        return arrayHandler;
    }
}
