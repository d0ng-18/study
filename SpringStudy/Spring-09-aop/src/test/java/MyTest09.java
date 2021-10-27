import com.slayerd09.service.TestService;
import com.slayerd09.service.impl.TestServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest09 {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        //动态代理代理的是接口，而不是接口的实现实现类
        TestService testService = context.getBean("testServiceImpl", TestService.class);
        testService.add();
    }
}
