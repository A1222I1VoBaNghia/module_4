package codegym.vn.borrow_book.service;

import codegym.vn.borrow_book.entiity.Book;
import codegym.vn.borrow_book.entiity.Order;
import codegym.vn.borrow_book.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{
    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void create(Order order) {
        List<Book> book1 =order.getBooks();
        for (Book b:book1) {
            b.setNumberOfBook(b.getNumberOfBook()-1);
        }
        orderRepository.save(order);
    }

    @Override
    public void returnBook(Order order) {
        List<Book> book1 =order.getBooks();
        for (Book b:book1) {
            b.setNumberOfBook(b.getNumberOfBook()+1);
        }
        orderRepository.delete(order);
    }

}
