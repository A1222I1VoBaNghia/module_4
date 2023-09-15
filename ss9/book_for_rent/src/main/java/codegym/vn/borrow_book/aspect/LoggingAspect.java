package codegym.vn.borrow_book.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class LoggingAspect {
    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());
    @Pointcut("execution (* codegym.vn.borrow_book.service.BookServiceImpl.*(..))")
    public void bookService(){};

}
