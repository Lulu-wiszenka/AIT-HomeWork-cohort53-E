public class Book {
    private String title;
    private Author[] authors;
    private int year;

    public Book() {
        this.title = title;
        this.authors = authors;
        this.year = year;
    }

    public Book(String title, int year, Author... authors) {
        this.title = title;
        this.authors = authors;
        this.year = year;
    }


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