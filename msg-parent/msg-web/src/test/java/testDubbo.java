import com.msg.entity.User;
import com.msg.service.CustomerService;
import com.msg.service.MessageService;
import com.msg.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wd on 2018/3/9.
 */
public class testDubbo {

    private CustomerService customerService;
    private UserService userService;
    private MessageService messageService;

    @Before
    public void Before() {
        //加载
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("classpath:/spring/applicationContext.xml");
        //获取bean
//        messageService = (MessageService) beanFactory.getBean("messageService");
//        customerService= (CustomerService) beanFactory.getBean("customerService");
        userService= (UserService) beanFactory.getBean("userService");

    }

    @Test
    public void testContection(){
        User user = userService.selectUserByid((long) 20000);
        System.out.println(user);
    }


}
