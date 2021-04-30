package kr.mjc.sehyuckpark.java.jdbc.user;

public class LoginEx {
    public static void main(String[] args) {
        UserDao userDao = new UserDaoImplUsingDbUtils();
        User user = userDao.login("roflos@naver.com", "b");
        if (user != null) {
            System.out.format("%s Log in.\n", user.getName());
        } else {
            System.out.println("Wrong Email or Password.");
        }
    }
}
