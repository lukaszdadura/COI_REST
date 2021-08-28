package pl.lukaszdadura.COI_REST.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.lukaszdadura.COI_REST.model.Book;
import pl.lukaszdadura.COI_REST.service.BookService;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping("")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @RequestMapping("/byiban/{iban}")
    public Book getByIban(@PathVariable String iban) {
        return bookService.getByIban(iban);
    }

    @RequestMapping("/bytitle/{title}")
    public Book getByTitleFragment(@PathVariable String title) {
        return bookService.getByTitleFragment(title);
    }
}
