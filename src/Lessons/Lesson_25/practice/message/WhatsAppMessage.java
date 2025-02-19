package Lessons.Lesson_25.practice.message;

import java.util.regex.Pattern;

public class WhatsAppMessage extends Message{

    public WhatsAppMessage(String sender, String recepient, String text) {
        super(sender, recepient, text);
    }

    private boolean validateNumber(String number) {
        // логика проверки того, что номер зарегестрирован в WhatsApp

        return true;
    }
}
