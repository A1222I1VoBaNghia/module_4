package codegym.vn.borrow_book.repository;

import codegym.vn.borrow_book.entiity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, String> {
    List<Book> findAllByBookNameContaining(String bookName);
}
