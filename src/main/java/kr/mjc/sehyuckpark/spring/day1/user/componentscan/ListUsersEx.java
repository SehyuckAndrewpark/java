package kr.mjc.sehyuckpark.spring.day1.user.componentscan;

import kr.mjc.sehyuckpark.java.jdbc.user.User;
import kr.mjc.sehyuckpark.java.jdbc.user.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class ListUsersEx {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(
                AppConfig.class);
        // new ClassPathXmlApplicationContext("applicationContext-user-cs.xml");

        UserDao userDao = context.getBean("userDao", UserDao.class);
        List<User> userList = userDao.listUsers(0, 100);
        for (User user : userList) {
            System.out.println(user);
        }
    }
}