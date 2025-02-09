// Задание 4: Улучшение класса SmartDevice
//Добавить метод togglePower(), который переключает устройство между включенным и выключенным состоянием.
//Изменить displayStatus(), чтобы он показывал, включено ли устройство или нет.
//Протестировать класс, создав объект SmartDevice и несколько раз переключив его состояние.

package Homework.lesson_22.HomeworkYulia_22;

public class SmartDevice {
    String appliance;
    boolean isOn;

    public SmartDevice(String appliance) {

        this.appliance = appliance;
        this.isOn = false;
    }

    public void togglePower() {
        isOn = !isOn;
        System.out.println(appliance + (isOn ? " включен." : " выключен."));
    }


    public void displayStatus() {
        System.out.println("Устройство: " + appliance + " | Статус: " + (isOn ? "Включено" : "Выключено"));
    }
}

