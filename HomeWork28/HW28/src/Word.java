public class Word {
    private String value;
    private String translation;

    public Word(String value, String translation) {
        this.value = value;
        this.translation = translation;
    }

    public  String toString(){
        return String.format("Слово: %s Перевод: %s",value, translation);
    }

    public String getValue() {
        return value;
    }

    public String getTranslation() {
        return translation;
    }
}