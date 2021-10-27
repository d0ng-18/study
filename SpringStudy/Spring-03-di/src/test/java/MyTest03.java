import com.slayerd03.pojo.Student;
import com.slayerd03.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Properties;
import java.util.Set;

public class MyTest03 {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml" , "beans2.xml");
        Student student = (Student) context.getBean("student");
        User user = context.getBean("user", User.class);
        User user2 = context.getBean("user2", User.class);
        System.out.println(student.getName());
        System.out.println(student.getAddress());
        for (String s : student.getBook()) {
            System.out.println(s);
        }
        System.out.println(student.getCard());
        System.out.println(student.getHobbies());
        for (String hobby : student.getHobbies()) {
            System.out.println(hobby);
        }
        System.out.println(student.getVideoGames());
        Properties info = student.getInfo();
        Set<Object> objects = info.keySet();
        System.out.println(objects);
        System.out.println(info);
        System.out.println(student.getWife());
        System.out.println(user.getId()+user.getName());
        System.out.println(user2.getId()+user2.getName());
    }
}
