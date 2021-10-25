
import com.slayerd10.dao.UserMapper;
import com.slayerd10.pojo.User;
import com.slayerd10.utils.SqlFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class MyTest {
    @Test
    public void testGetUser(){
        SqlSession sqlSession = SqlFactoryUtil.getSqlSession();
        SqlSession sqlSession2 = SqlFactoryUtil.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUser(1);
        System.out.println(user);
        sqlSession.close();

        UserMapper mapper2 = sqlSession2.getMapper(UserMapper.class);
        User user2 = mapper2.getUser(1);
        System.out.println(user2);
        sqlSession2.close();
    }

    @Test
    public void testGetUser2(){
        SqlSession sqlSession = SqlFactoryUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUser(1);
        System.out.println(user);
        sqlSession.close();
    }
}
