import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Word> words = List.of(
                new Word("dog", "собака"),
                new Word("cat", "кот"),
                new Word("book", "книга"),
                new Word("table", "стол")
        );
        Dictionary dictionary = new Dictionary(words);
        for (int i = 0; i < words.size(); i++) {
            System.out.println(words.get(i));
        }

    }
}