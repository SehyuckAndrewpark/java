package kr.mjc.sehyuckpark.java.jdbc.user;

import kr.mjc.sehyuckpark.java.jdbc.DataAccessException;

public class UpdateEmailEx {
    public static void main(String[] args) {
        UserDao userDao = new UserDaoImplUsingDbUtils();
        try {
            int updatedRows = userDao.updateEmail(2, "roflos@naver.com");

            if (updatedRows > 0)
                System.out.println("Email Updated.");
            else
                System.out.println("No User.");
        } catch (DataAccessException e) {
            System.err.println(e.getMessage());
        }
    }
}
