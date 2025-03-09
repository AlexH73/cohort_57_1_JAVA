package Homework.lesson_27.HomeworkYulia_27;

public class SmartLight implements Connectable {
    private int brightnessLevel;
    private int colorTemperature;
    private boolean isConnected;

    @Override
    public void connectToWiFi(String network) {
        isConnected = true;
        System.out.println("Умная лампа подключена к сети " + network);
    }


    @Override
    public void disconnectFromWiFi() {
        isConnected = false;
        System.out.println("Умная лампа отключена от Wi-Fi");
    }


    @Override
    public boolean checkConnectionStatus() {
        return isConnected;
    }

    // непонятно хачем нам сеттер, если мы не изменяем никоим образом значение brightnessLevel.
    // Метод лишь информирует нас о текущем уровне освещенности, что вводит в заблуждение -
    // мы передали желаемый уровень освещенности, но лишь узнали текущий. Какой смысл?
    public void setBrightness(int level) {

        System.out.println("Яркость установлена на " + brightnessLevel);
    }

    // аналогичное замечание что и для яркости
    public void setColorTemperature(int temperature) {
        System.out.println("Цветовая температура установлена на " + colorTemperature);
    }
}

