import com.slayerd2.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTestIoc2 {
    @Test
    public void test(){
        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User) classPathXmlApplicationContext.getBean("user");
        user.show();
    }
}
