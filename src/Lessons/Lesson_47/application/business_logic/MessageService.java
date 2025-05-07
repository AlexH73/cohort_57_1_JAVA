package Lessons.Lesson_47.application.business_logic;

import Lessons.Lesson_47.application.data_access.MessageRepositoryImpl;
import Lessons.Lesson_47.application.data_access.MessageRepositoryInterface;

public class MessageService {
    private MessageRepositoryInterface messageRepo = new MessageRepositoryImpl();

    public boolean addMessage(String message) {
        return false;
    }


}
