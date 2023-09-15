package codegym.vn.borrow_book.repository;

import codegym.vn.borrow_book.entiity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
