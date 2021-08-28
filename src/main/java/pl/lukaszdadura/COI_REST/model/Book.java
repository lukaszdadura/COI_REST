package pl.lukaszdadura.COI_REST.model;

public class Book {

    private Long id;
    private String title;
    private String author;
    private String iban;

    public Book(Long id, String title, String author, String isbn) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.iban = isbn;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIban() {
        return iban;
    }

}
