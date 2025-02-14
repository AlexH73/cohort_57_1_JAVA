package Homework.lesson_23;

public class PassportTest {
    public static void main(String[] args) {
        //Создаем объект Passport
        Passport passport = new Passport("12345", "Иван Иванов");

        //Выводим данные паспорта
        System.out.println("Паспорт: ");
        System.out.println("Номер: " + passport.getPassportNumber());
        System.out.println("Владелец: " + passport.getHolderName());

    }
}
