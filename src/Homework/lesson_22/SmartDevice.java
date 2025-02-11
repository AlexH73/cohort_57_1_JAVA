package Homework.lesson_22;
/*Задание 4: Улучшение класса SmartDevice
Добавить метод togglePower(), который переключает устройство между включенным и выключенным состоянием.
Изменить displayStatus(), чтобы он показывал, включено ли устройство или нет.
Протестировать класс, создав объект SmartDevice и несколько раз переключив его состояние.*/
public class SmartDevice {
    String name;    //Название устройства
    boolean isOn;   // Состояние устройства (true - включено, false - выключено)
    // Конструктор для инициализации устройства
    public SmartDevice(String name) {
        this.name = name;
        this.isOn = false; //По умолчанию устройство выключено
    }
    //метод togglePower(), который переключает устройство между включенным и выключенным состоянием
    //Метод для переключения состояние устройства
    //Если было включено - выключает, если выключено - включает
    //меняет isOn на противоположное значение: true - fals, false - true
    public void togglePower() {
        isOn = !isOn;
        System.out.println(name + (isOn ? " включен. " : " выключен. "));
    }
    //Метод displayStatus() выводит название устройства и его текущее состояние
    public void displayStatus() {
        System.out.println("Устройство: " + name);
        System.out.println("Состояние: " + (isOn ? "Включено" : "Выключено"));
        System.out.println("---------------------------------");
    }
}
