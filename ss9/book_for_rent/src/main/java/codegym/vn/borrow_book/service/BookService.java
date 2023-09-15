package codegym.vn.borrow_book.service;

import codegym.vn.borrow_book.entiity.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BookService {
    Page<Book> findAll(Pageable pageable);
    List<Book> findAll();
    Book findById(String id);
    void deleteById(String id);
}
