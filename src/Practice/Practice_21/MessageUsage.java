package Practice.Practice_21;

public class MessageUsage {
    public static void main(String[] args) {
         Message message = new Message();
         message.sender = "Alexander";
         message.timestamp = "20:18";
         message.receiver = "Yulianna";
         message.text = "Hello, Yulianna!";

        System.out.println("displayMessage() = " + message.displayMessage());
    }
}
