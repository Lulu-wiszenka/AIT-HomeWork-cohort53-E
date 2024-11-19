import java.util.Arrays;

public class Book {
    private String title;
    private Author[] authors;
    private int year;

    public Book(String title, Author[] authors, int year) {
        this.title = title;
        this.year = year;
        this.authors = authors;
    }
   /* public Book(String title, int year, Author author ) {
        this.title = title;
        this.authors = new Author[1];
        this.authors[0] = author;
        this.year = year;
    }

    public Book(String title, int year, Author... authors) {
        this.title = title;
        this.authors = authors;
        this.year = year;
    } */


    public String AutorsString(){
        StringBuilder autorsString = new StringBuilder();
        for (int i = 0; i < authors.length; i++) {
            if(authors[i]!=null){
                autorsString.append(authors[i]).append(",");
            }
        }
        return autorsString.toString();
    }

    @Override
    public String toString() {
        return String.format("\"%s\" - %s (%d)",gettitle(), AutorsString(), getyear());
    }

    public String gettitle() {
        return title;
    }

    public int getyear() {
        return year;
    }

    public Author[] getAuthors() {
        return authors;
    }
}
