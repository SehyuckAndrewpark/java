package kr.mjc.sehyuckpark.spring.day2.class06;

import kr.mjc.sehyuckpark.java.jdbc.user.User;
import kr.mjc.sehyuckpark.java.jdbc.user.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Scanner;

@Component
public class UserController {

    private UserDao userDao;

    @Autowired
    public UserController(@Qualifier("userDaoImpl") UserDao userDao) {
        this.userDao = userDao;
        System.out.format("in userController %s get bean.\n",
                userDao.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(
                AppConfig.class);
        UserController userController = context.getBean(UserController.class);
        System.out.print(
                "Select method (1:list, 2:get, 3:login, 4:add, 5:updatePassword, 6:updateEmail) : ");
        try (Scanner scanner = new Scanner(System.in)) {
            switch (scanner.nextInt()) {
                case 1 -> userController.list();
                case 2 -> userController.get();
                case 3 -> userController.login();
                case 4 -> userController.add();
                case 5 -> userController.updatePassword();
                case 6 -> userController.updateEmail();
            }
        }
    }

    public void list() {
        List<User> userList = userDao.listUsers(0, 10);
        for (User user : userList) {
            System.out.println(user);
        }
    }

    public void get() {
        int userId = 1;
        try {
            User user = userDao.getUser(userId);
            System.out.println(user);
        } catch (EmptyResultDataAccessException e) {
            // queryForObject() : if no resultSet, EmptyResultDataAccessException
            System.err.format("No Data. userId=%s\n", userId);
        }
    }

    public void login() {
        try {
            User user = userDao.login("byung@daum.net", "b");
            System.out.format("%s is Logined.\n", user.getName());
        } catch (EmptyResultDataAccessException e) {
            System.err.println("Email or Password Error.");
        }
    }

    public void add() {
        User user = new User();
        user.setEmail("david@gmail.net");
        user.setName("David");
        user.setPassword("a");
        try {
            userDao.addUser(user);
            System.out.format("User Added : %s\n", user);
        } catch (DuplicateKeyException e) {
            // update() : same key, throw DuplicateKeyException
            System.err.format("There's same Email. email=%s\n", user.getEmail());
        }
    }

    public void updatePassword() {
        int updatedRows = userDao.updatePassword(3, "1", "xxxx");
        if (updatedRows > 0)
            System.out.println("Password Updated.");
        else
            System.err.println("No User or Wrong Password.");
    }

    public void updateEmail() {
        int userId = 2;
        String email = "iu@daum.net";
        try {
            int updatedRows = userDao.updateEmail(userId, email);
            if (updatedRows > 0)
                System.out.println("Email Updated.");
            else
                System.err.format("No User. userId=%d\n", userId);
        } catch (DataAccessException e) {
            System.err.format("There's same Email. email=%s\n", email);
        }
    }
}