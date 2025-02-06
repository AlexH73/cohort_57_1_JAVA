package Practice.Practice_22;

public class UserTest {
    public static void main(String[] args) {
        // Создание нескольких объектов User
        User user1 = new User("Joe", "joe@domen.com", 45);
        User user2 = new User("Anna", "anna@domen.com", 30);
        User user3 = new User("Mike", "mike@domen.com", 25);
        User user4 = new User("Sara", "sara@domen.com", 35);

        // Вывод информации о пользователях
        System.out.println("user1 = " + user1);
        user1.displayUserInfo();

        System.out.println("\nuser2 = " + user2);
        user2.displayUserInfo();

        System.out.println("\nuser3 = " + user3);
        user3.displayUserInfo();

        System.out.println("\nuser4 = " + user4);
        user4.displayUserInfo();
    }
}
