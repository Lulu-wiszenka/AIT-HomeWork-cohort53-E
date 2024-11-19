public class BookList {
    Book[] myBooks;
    private int size;

    public BookList(){
        myBooks = new Book[6];
        this.size = 0;
    }

    public void add(Book book){
        if (size>= myBooks.length){
            enlarge();
        }
        myBooks[size++] = book;
    }

    private void enlarge(){
        Book[] newArray = new Book[myBooks.length * 2];

        for (int i = 0; i < myBooks.length ; i++) {
            newArray[i] = myBooks[i];
        }

        myBooks = newArray;
    }

    public String toString() {
        StringBuilder list = new StringBuilder();
        for (int i = 0; i < size; i++) {
            list.append(myBooks[i]).append(System.lineSeparator());
        }
        return list.toString();
    }


    public Book getMyBooks(int index) {
        if (index<0 || index>size){
            return null;
        } else {return myBooks[index];}
    }

    public BookList findBookByAuthorLastName(String nameString){
        BookList result = new BookList();

        for (int i = 0; i < size ; i++) {
            Author[] authors = myBooks[i].getAuthors();

            for (int j = 0; j < authors.length; j++) {
                if (authors[j].getlName().equals(nameString)) {
                    result.add(myBooks[i]);
                    break;
                }
            }

        }

        return result;
    }


}