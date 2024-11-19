public class Main {
    public static void main(String[] args) {
        Author pieterCru = new Author("Pieter", "Cruel", 31);
        System.out.println(pieterCru);

        Author[] autors1 =  new Author[]{
                new Author ("Борис", "Стругацкий", 1933),
                new Author ("Аркадий", "Стругацкий", 1925)
        };
        Book book1 = new Book("Понедельник начинается в субботу", autors1,1965);
        System.out.println(book1);

        Book book2 = new Book("Трудно быть богом", autors1, 1965);

        BookList bookList = new BookList();
        bookList.add(book1);
        bookList.add(book2);
        System.out.println(bookList);
        System.out.println(bookList.getMyBooks(3));

        System.out.println(bookList.findBookByAuthorLastName("Стругацкий"));
    }
}