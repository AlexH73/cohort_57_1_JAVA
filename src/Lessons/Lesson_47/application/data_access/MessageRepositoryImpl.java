package Lessons.Lesson_47.application.data_access;

import Lessons.Lesson_47.application.models.Message;
import Lessons.Lesson_47.application.models.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MessageRepositoryImpl implements MessageRepositoryInterface {
    private List<Message> messages;

    public MessageRepositoryImpl() {
        messages = new ArrayList<>();
    }

    @Override
    public boolean addMessage(Message message) {
        return false;
    }

    @Override
    public List<Message> getMessagesByUser(User user) {
        // получить сообщени от пользователя user и отправленные пользователю user сообщения
        return List.of();
    }

    @Override
    public List<Message> getNoReadMessages() {
        return List.of();
    }

    @Override
    public List<Message> getMessageByDate(LocalDate date) {
        List<Message> messagesByDate = messages.stream()
                .filter(
                        message ->
                    message.getSendTime().getDayOfMonth() == date.getDayOfMonth()
                            && message.getSendTime().getMonth() == date.getMonth()
                            && message.getSendTime().getYear() == date.getYear()
                )
                .toList();

        return messagesByDate;
    }

    @Override
    public void updateMessage(Message message) {

    }

    @Override
    public boolean deleteMessage(Message message) {
        return false;
    }
}
