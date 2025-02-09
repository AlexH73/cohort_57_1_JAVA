package Hausaufgaben.Hausaufgaben_22.User;
/*
Задание 1: Доработка класса User
Добавить метод isAdult(), который возвращает true, если пользователю 18 лет или больше, и false в противном случае.
Изменить метод displayUserInfo(), чтобы он также отображал информацию о совершеннолетии пользователя.
Протестировать класс, создав несколько объектов User и вызвав все методы.
 */
public class Lesson22_1 {
    public static void main(String[] args) {
        //Протестировать класс, создав несколько объектов User и вызвав все методы.
        Account ilias_account = new Account("ilias", "1234");

        System.out.println("ilias_account = " + ilias_account);

        Account ilias_2 = new Account("ilias", "1234", "adas@dcfad.we", "5322, Sdf str 12", 1990);

        Account ilias_3 = new Account("ilias", "1234", "adas@dcfad.we");


       // Account ilias_4 = new Account();


        System.out.println("ilias_2 = " + ilias_2);

    }
    /*
    isAdult(){
       //Добавить метод isAdult(), который возвращает true, если пользователю 18 лет или больше, и false в противном случае.
    }
    displayUserInfo(){
        //Изменить метод displayUserInfo(), чтобы он также отображал информацию о совершеннолетии пользователя.
    }
     */
}
