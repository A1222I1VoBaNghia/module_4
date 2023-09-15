package codegym.vn.borrow_book.service;

import codegym.vn.borrow_book.entiity.Order;

public interface OrderService {
    void create(Order order);
    void returnBook(Order order);
}
