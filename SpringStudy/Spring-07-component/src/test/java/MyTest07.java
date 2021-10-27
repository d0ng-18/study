import com.slayerd07.pojo.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest07 {
    @Test
    public void test(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("beans.xml");
        User user = classPathXmlApplicationContext.getBean("user", User.class);
        System.out.println(user.getName());
    }
}
