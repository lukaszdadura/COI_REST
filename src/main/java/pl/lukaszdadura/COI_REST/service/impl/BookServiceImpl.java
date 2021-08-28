package pl.lukaszdadura.COI_REST.service.impl;

import org.springframework.stereotype.Component;
import pl.lukaszdadura.COI_REST.model.Book;
import pl.lukaszdadura.COI_REST.service.BookService;

import java.util.ArrayList;
import java.util.List;

@Component
public class BookServiceImpl implements BookService {

    private List<Book> bookList;

    public BookServiceImpl() {
        bookList = new ArrayList<>();
        bookList.add(new Book(1L, "Title1", "Author1", "1111"));
        bookList.add(new Book(2L, "Title2", "Author2", "2222"));
        bookList.add(new Book(3L, "Title3", "Author3", "3333"));
        bookList.add(new Book(4L, "Title4", "Author4", "4444"));
    }

    @Override
    public List<Book> getAllBooks() {
        return bookList;
    }

    @Override
    public Book getByIban(String iban) {
        Book bookToFind = bookList.stream()
                .filter(x -> x.getIban().equalsIgnoreCase(iban))
                .findAny()
                .get();
        return bookToFind;
    }

    @Override
    public Book getByTitleFragment(String titleFragment) {
        Book bookToFind = bookList.stream()
                .filter(x -> x.getTitle().contains(titleFragment))
                .findAny()
                .get();
        return bookToFind;
    }
}
