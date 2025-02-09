package HomerJavaWork.Homer21work;

public class User1 {
    public static void main(String[] args) {
        User user1 = new User("Max" , 19);
        User user2 = new User("Mary" , 18);
        User user3 = new User("Pasha" , 16);

        user1.displayUserInfo();
        System.out.println();
        user2.displayUserInfo();
        System.out.println();
        user3.displayUserInfo();
        System.out.println();
    }
}
