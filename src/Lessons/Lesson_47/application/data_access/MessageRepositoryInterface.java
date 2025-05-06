package Lessons.Lesson_47.application.data_access;

import Lessons.Lesson_47.application.models.Message;
import Lessons.Lesson_47.application.models.User;

import java.time.LocalDate;
import java.util.List;

public interface MessageRepositoryInterface {
    boolean addMessage(Message message);
    List<Message> getMessagesByUser(User user);
    List<Message> getNoReadMessages();
    List<Message> getMessageByDate(LocalDate date);
    void updateMessage(Message message);
    boolean deleteMessage(Message message);
}
