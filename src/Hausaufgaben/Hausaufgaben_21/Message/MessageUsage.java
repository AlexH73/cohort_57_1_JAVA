package Hausaufgaben.Hausaufgaben_21.Message;
/*
Задание 2: Улучшение класса Message.
Добавить новый метод isFrom(String username), который проверяет, отправлено ли сообщение указанным пользователем.
Добавить метод shortPreview(int maxLength), который возвращает первые maxLength символов сообщения + "...", если оно длиннее указанного лимита.
Создать несколько объектов Message и протестировать новый функционал.
 */
public class MessageUsage {
    public static void main(String[] args) {


        Message to_Alex = new Message();

        to_Alex.sender = "Max Musterman";
        to_Alex.receiver = "Alex";
        to_Alex.text = "Hallo";
        to_Alex.timestampt = "Heute Abend";

        Message to_Alex2 = new Message();

        to_Alex2.sender = "Max Musterman";
        to_Alex2.receiver = "Alex";
        to_Alex2.text = "Hallo was machst du Heute abend ?";
        to_Alex2.timestampt = "Heute Abend";

        Message to_Alex3 = new Message();

        to_Alex3.sender = "Max Musterman";
        to_Alex3.receiver = "Alex";
        to_Alex3.text = "Ich wolte ins Kino gehen!";
        to_Alex3.timestampt = "Heute Abend";


        //Создать несколько объектов Message и протестировать новый функционал.
    }
}
    /*
    public String isFrom(String username) {
        //Добавить новый метод isFrom(String username), который проверяет, отправлено ли сообщение указанным пользователем.
        if (username(sender) = username(text)) {
            System.out.println("%s");
        } else{
            System.out.println("Falsch zugesendet!");
        }
        return username;
    }

    static int shortPreview(int maxLength) {
       int i = 10; i < this.text.length;
        //Добавить метод shortPreview(int maxLength), который возвращает первые maxLength символов сообщения + "...", если оно длиннее указанного лимита.
}

     */


