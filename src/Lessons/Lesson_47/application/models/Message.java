package Lessons.Lesson_47.application.models;

import java.time.LocalDateTime;
import java.util.Objects;

public class Message {
    private User sender;
    private User recepient;
    private String messageText;
    private LocalDateTime sendTime;
    private boolean isDelivered;
    private boolean isRead;

    public Message(String messageText, User sender, User recepient) {
        this.messageText = messageText;
        this.sender = sender;
        this.recepient = recepient;
        isDelivered = false;
        isRead = false;
        sendTime = LocalDateTime.now();
    }

    public void setDelivered(boolean delivered) {
        if (isDelivered) {
            return;
        }
        isDelivered = delivered;
    }

    public void setRead(boolean read) {
        isRead = read;
    }

    public User getSender() {
        return sender;
    }

    public User getRecepient() {
        return recepient;
    }

    public String getMessageText() {
        return messageText;
    }

    public LocalDateTime getSendTime() {
        return sendTime;
    }

    public boolean isDelivered() {
        return isDelivered;
    }

    public boolean isRead() {
        return isRead;
    }

    @Override
    public String toString() {
        return "Message{" +
                "sender=" + sender +
                ",\n recepient=" + recepient +
                ",\n messageText=   [" + messageText + ']' +
                ",\n sendTime=" + sendTime +
                ",\n isDelivered=" + isDelivered +
                ",\n isRead=" + isRead +
                '}';
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Message message)) return false;

        return isDelivered() == message.isDelivered() && isRead() == message.isRead() && Objects.equals(getSender(), message.getSender()) && Objects.equals(getRecepient(), message.getRecepient()) && Objects.equals(getMessageText(), message.getMessageText()) && Objects.equals(getSendTime(), message.getSendTime());
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(getSender());
        result = 31 * result + Objects.hashCode(getRecepient());
        result = 31 * result + Objects.hashCode(getMessageText());
        result = 31 * result + Objects.hashCode(getSendTime());
        result = 31 * result + Boolean.hashCode(isDelivered());
        result = 31 * result + Boolean.hashCode(isRead());
        return result;
    }
}
