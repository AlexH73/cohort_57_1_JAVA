package Homework.lesson_22;

public class UserTest {
    public static void main(String[] args) {
        HomerJavaWork.Homer21work.User user1 = new HomerJavaWork.Homer21work.User("Max" , 19);
        HomerJavaWork.Homer21work.User user2 = new HomerJavaWork.Homer21work.User("Mary" , 18);
        HomerJavaWork.Homer21work.User user3 = new User("Pasha" , 16);

        user1.displayUserInfo();
        System.out.println();
        user2.displayUserInfo();
        System.out.println();
        user3.displayUserInfo();
        System.out.println();
    }
}
