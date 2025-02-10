package Homework.lesson_21;

public class MessageTest {
    public static void main(String[] args) {
        //Создаем несколько объектов Massage
        Message message1 = new Message("Pasha" , "Короткое сообщение.");
        Message message2 = new Message("Max" , "Это очень длинное сообщение, которое не поместится в краткий превью, так что оно должно быть обрезано.");
        Message message3 = new Message("Masha" , "Привет.Как дела?");
        //Тестируем метод isFrom
        System.out.println("message1 отправлено Pasha? " + message1.isFrom("Pasha"));
        System.out.println("message2 отправлено Pasha? = " + message2.isFrom("Pasha"));


        //Тестируем метод shortPreview с разными лимитами символов
        System.out.println("Preview message1 (макс. 20 символов) = " + message1.shortPreview(20));
        System.out.println("Preview message2 (макс. 30 символов) = " + message2.shortPreview(30));
        System.out.println("Preview message3 (макс. 50 символов) = " + message3.shortPreview(50));


        // Вывод полной информации
        message1.displayMessage();
        message2.displayMessage();
        message3.displayMessage();




    }
}