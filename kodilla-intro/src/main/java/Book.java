public class Book {
    private String author;
    private String title;

    public Book(String author, String title){  //Tak czy siak muszę utworzyć konstruktor?
        this.author = author;
        this.title = title;
    }

    public static Book of(String author, String title){ //Teoretycznie mam konstruktor, więc po co metoda? Nie kleje :<
        Book book = new Book(author, title);
        System.out.println(book);
        return book;
    }
}