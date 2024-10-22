import java.util.List;

public class Dictionary {
    List <Word> words;

    public Dictionary(List <Word> words) {
        this.words = words;
    }

    public String translation(String value){
        for (int i = 0; i<words.size(); i++){
            if (words.get(i).getValue().equalsIgnoreCase(value)){
                return words.get(i).getTranslation();
            }
        }
        return "";
    }

    public String getWordByTranslation(String translation){
        for (int i = 0; i<words.size(); i++){
            if (words.get(i).getTranslation().equalsIgnoreCase(translation)){
                return words.get(i).getValue();
            }
        }
        return "";
    }

    public String toString(){
        String result="";
        for (int i = 0; i < words.size(); i++) {
            result+= words.get(i)+ System.lineSeparator();  // \n
        }
        return result;
    }

}
