package Lessons.Lesson_25.practice.message;

import java.util.regex.Pattern;

public class SMSmessage extends Message{
    private String senderNumber;
    private String recepientNumber;


    public SMSmessage(String senderNumber, String recepientNumber, String text) {
        super(senderNumber, recepientNumber, text);
        if (!validateNumber(senderNumber)) {
            super.setSender(null);
            System.err.println("Номер отправителя для СМС сообщений должен быть исключительно из цифр! " +
                    "Значнение не корректно: " + senderNumber);
        }

        if (!validateNumber(recepientNumber)) {
            super.setRecepient(null);
            System.err.println("Номер получателя для СМС сообщений должен быть исключительно из цифр! " +
                    "Значнение не корректно: " + recepientNumber);
        }
    }

    private boolean validateNumber(String number) {
        String patternRegex = "^\\d+$";
        boolean containsOnlyDigit = Pattern.matches(patternRegex, number);

        return containsOnlyDigit;
    }
}
