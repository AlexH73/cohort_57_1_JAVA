package Homework.lesson_22;

public class UserTest {
    public static void main(String[] args) {
        // Создание нескольких объектов User, включая несовершеннолетних
        User user1 = new User("Joe", "joe@domen.com", 45);
        User user2 = new User("Anna", "anna@domen.com", 30);
        User user3 = new User("Mike", "mike@domen.com", 25);
        User user4 = new User("Sara", "sara@domen.com", 35);
        User user5 = new User("Tom", "tom@domen.com", 17); // несовершеннолетний
        User user6 = new User("Lucy", "lucy@domen.com", 16); // несовершеннолетний
        User user7 = new User("Sam", "sam@domen.com", 14); // несовершеннолетний
        User user8 = new User("Emma", "emma@domen.com", 12); // несовершеннолетний

        // Вывод информации о пользователях
        System.out.println("user1 = " + user1);
        user1.displayUserInfo();

        System.out.println("\nuser2 = " + user2);
        user2.displayUserInfo();

        System.out.println("\nuser3 = " + user3);
        user3.displayUserInfo();

        System.out.println("\nuser4 = " + user4);
        user4.displayUserInfo();

        System.out.println("\nuser5 = " + user5);
        user5.displayUserInfo();

        System.out.println("\nuser6 = " + user6);
        user6.displayUserInfo();

        System.out.println("\nuser7 = " + user7);
        user7.displayUserInfo();

        System.out.println("\nuser8 = " + user8);
        user8.displayUserInfo();
    }
}
