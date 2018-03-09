package test;

import com.msg.entity.User;
import com.msg.mapper.UserMapper;
import com.msg.service.CustomerService;
import com.msg.service.MessageService;
import com.msg.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wd on 2018/3/9.
 */
public class testLocal {


    private BeanFactory beanFactory;
    @Before
    public void Before() {
        //加载
        beanFactory = new ClassPathXmlApplicationContext("classpath:/spring/applicationContext.xml");
        //获取bean
//        messageService = (MessageService) beanFactory.getBean("messageService");
//        customerService= (CustomerService) beanFactory.getBean("customerService");
//        userService= (UserService) beanFactory.getBean("userService");
        System.out.println(beanFactory);
    }

    @Test
    public void testContection(){
        UserMapper userMapper= (UserMapper) beanFactory.getBean("userMapper");
        System.out.println(userMapper);
        User user = userMapper.selectByPrimaryKey((long) 20000);
        System.out.println(user);
    }
}
