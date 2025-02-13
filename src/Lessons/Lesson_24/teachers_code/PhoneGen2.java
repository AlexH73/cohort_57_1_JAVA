package Lessons.Lesson_24.teachers_code;

public class PhoneGen2 extends PhoneGen1 {
    public PhoneGen2(String phoneNumber) {
        super(phoneNumber);
    }

    public void sendMessage(String phoneNumber, String message) {
        System.out.println("Отправляю сообщение:" + message +
                        "\nна номер: " + phoneNumber);
    }
}
