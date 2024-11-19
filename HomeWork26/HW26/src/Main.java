public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Жизнь насекомых", 1993,
                new Author("Виктор", "Пелевин", 1962)
        );

        Book book2 = new Book("Чапаев и пустота", 1996,
                new Author("Виктор", "Пелевин", 1962)
        );

        Book book3 = new Book("Мастер и Маргарита", 1929,
                new Author("Михаил", "Булгаков", 1891)
        );

        BookList bookList = new BookList(book1, book2, book3);
        System.out.println(bookList);


    }
}