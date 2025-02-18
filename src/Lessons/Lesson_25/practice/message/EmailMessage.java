package Lessons.Lesson_25.practice.message;

public class EmailMessage extends Message{
    public EmailMessage(String sender, String recepient, String text) {
        super(sender, recepient, text);
    }

    private boolean validate (String address) {
        // проверяет, что address - действительный имейл адрес

        return true;
    }
}
