package pl.lukaszdadura.COI_REST.service;

import pl.lukaszdadura.COI_REST.model.Book;

import java.util.List;

public interface BookService {

    List<Book> getAllBooks();

    Book getByIban(String iban);

    Book getByTitleFragment(String titleFragment);
}
