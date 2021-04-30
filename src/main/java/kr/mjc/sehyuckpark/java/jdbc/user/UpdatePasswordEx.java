package kr.mjc.sehyuckpark.java.jdbc.user;

public class UpdatePasswordEx {
    public static void main(String[] args) {
        UserDao userDao = new UserDaoImplUsingDbUtils();
        int updatedRows = userDao.updatePassword(3, "1", "xxxx");

        if (updatedRows > 0)
            System.out.println("Password Updated.");
        else
            System.out.println("No User or Wrong Password.");
    }
}