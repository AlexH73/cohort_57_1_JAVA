package Homerwork.Practica.Practica25.Inheritance2;

//Шаг 4: Тестирование наследования
//Создадим объекты и протестируем, как работают все унаследованные методы.
public class Main {
    public static void main(String[] args) {
        Smartphone phone = new Smartphone("Samsung", "Galaxy S22");
        phone.powerOn();
        phone.playMusic();
        phone.takePhoto();
        phone.makeCall("+123456789");
    }
}
