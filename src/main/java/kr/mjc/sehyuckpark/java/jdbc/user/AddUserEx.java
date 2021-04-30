package kr.mjc.sehyuckpark.java.jdbc.user;

import kr.mjc.sehyuckpark.java.jdbc.DataAccessException;

public class AddUserEx {
    public static void main(String[] args) {
        UserDao userDao = new UserDaoImplUsingDbUtils();
        User user = new User();
        user.setEmail("roflos@naver.com");
        user.setPassword("b");
        user.setName("SehyuckPark");
        try {
            userDao.addUser(user);
            System.out.format("User Added : %s\n", user);
        } catch (DataAccessException e) {
            System.err.println(e.getMessage());
        }
    }
}
