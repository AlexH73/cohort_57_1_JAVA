package Homework.Homework_21;

class Message {
    String sender;
    String receiver;
    String text;
    String timestamp;

    // Метод для отображения полного сообщения
    public String displayMessage() {
        String messageOutput = "["
                + timestamp + "] " +
                sender + " → " +
                receiver + ": " +
                text;
        return messageOutput;
    }

    // Метод для проверки отправителя
    public boolean isFrom(String username) {
        return sender.equals(username);
    }

    // Метод для получения короткой версии сообщения
    public String shortPreview(int maxLength) {
        if (text.length() > maxLength) {
            return text.substring(0, maxLength) + "...";
        } else {
            return text;
        }
    }

    // Метод для отображения короткой версии сообщения
    public String displayMessage(int maxLength) {
        String messageText = shortPreview(maxLength);
        String messageOutput = "["
                + timestamp + "] " +
                sender + " → " +
                receiver + ": " +
                messageText;
        return messageOutput;
    }

    // Переопределение метода toString()
    @Override
    public String toString() {
        return "Message {" + "From: " + sender +
                " To: " + receiver +
                " Time: " + timestamp +
                "}";
    }
}