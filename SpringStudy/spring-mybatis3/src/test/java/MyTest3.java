
import com.slayerd3.pojo.User;
import com.slayerd3.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest3 {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        UserServiceImpl userServiceImpl = context.getBean("userServiceImpl", UserServiceImpl.class);
        List<User> users = userServiceImpl.getUsers();
        for (User user : users) {
            System.out.println(user);
        }
    }
}
