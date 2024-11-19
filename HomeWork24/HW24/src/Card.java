public class Card {
    private String number;
    private String ownerName;

    public Card(String number, String ownerName) {
        this.number = number;
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return secureToString();
    }

    public String secureToString(){
        /*
        String firstPartOfNumber = number.substring(0, 4);  // 123456789637 -> 1234
        String stars = "*".repeat(number.length() - 4);
        */
        String firstPartOfNumber = secureNumber(number);
        String[] names = ownerName.split(" ");   //"Jack Smith" - > {"Jack" "Smith"}
        String lastName=names[1].charAt(0) + ".";
        return String.format("%s %s %s",firstPartOfNumber,names[0], lastName);
    }

    public String secureNumber(String number){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < number.length() ; i++) {
            sb.append( i<4 || i>=number.length()-2 ? number.charAt(i) : "*");
        }
        return sb.toString();
    }


}