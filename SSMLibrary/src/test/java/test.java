import com.datealive.pojo.Books;
import com.datealive.service.BookService;
import com.datealive.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @ClassName: test
 * @Description: TODO
 * @author: datealive
 * @date: 2021/1/27  15:46
 */
public class test {

    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = (BookService) context.getBean("BookServiceImpl");
        List<Books> books = bookService.queryAllBooks();
        for (Books book : books) {
            System.out.println(book);
        }
    }
    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) context.getBean("UserServiceImpl");
        boolean queryUser = userService.queryUser("admin", "357159.");
        System.out.println(queryUser);
    }
}
