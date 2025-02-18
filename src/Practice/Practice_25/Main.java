package Practice.Practice_25;

public class Main {
    public static void main(String[] args) {
// Создаём массив сообщений разного типа
        Message[] messages = {
                new SMSMessage("Привет!", "Анна", "Иван"),
                new WhatsAppMessage("Как дела?", "Мария", "Алексей"),
                new EmailMessage("Важное письмо", "Компания", "Клиент")
        };

        // Отправляем все сообщения через общий интерфейс Message
        for (Message message : messages) {
            message.send();
        }
    }
}

