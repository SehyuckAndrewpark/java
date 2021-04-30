package kr.mjc.sehyuckpark.spring.day1.user.xmlconfig;

import kr.mjc.sehyuckpark.java.jdbc.user.User;
import kr.mjc.sehyuckpark.java.jdbc.user.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class ListUsersEx {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext-user.xml");

        UserDao userDao = context.getBean("userDao", UserDao.class);
        List<User> userList = userDao.listUsers(0, 100);
        for (User user : userList) {
            System.out.println(user);
        }
    }
}
