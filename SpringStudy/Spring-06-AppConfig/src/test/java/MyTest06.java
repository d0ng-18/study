import com.slayerd06.Config.SlayerdConfig;
import com.slayerd06.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest06 {
    @Test
    public void test(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SlayerdConfig.class);
        User user = context.getBean("nadaoUser", User.class);
//        User user2 = context.getBean("user2", User.class);
        System.out.println(user.getName());
//        System.out.println(user == user2);
    }
}
