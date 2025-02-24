package Homerwork.Practica.Practica19;

public class OSIdentifier {
    public static void main(String[] args) {
        //Получаем имя операционной системы
        String osName = System.getProperty("os.name");
        //Выводим сообщение
        System.out.println("Программа запущена на операционной системе: " + osName);
    }
}
