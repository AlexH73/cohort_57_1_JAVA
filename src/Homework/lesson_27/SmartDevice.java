package Homework.lesson_27;

import java.time.LocalTime;

//Абстрактный класс все умные устройства наследуются от него
public abstract class SmartDevice implements Connectable,
        PowerControllable, EnergyConsumable, Schedulable, VoiceControllable{
    protected boolean isConnected = false; //показывает, подключено ли устройство к сети, по умолчанию false.
    protected boolean powerState = false; //определяет, включено или выключено устройство, по умолчанию false.
    protected double powerConsumption = 0; //хранит количество потребленной электроэнергии (в ватт-часах, Вт/ч),
                                          // по умолчанию 0.
    protected String activationTime; //время,в которое устройство должно автоматически включится.
    protected String deactivationTime; //время,в которое устройство должно автоматически выключится.
    protected String wakeWord = "Alexa"; //хранит ключевую фразу с которой активируется голосовое управление.

    public abstract String getDeviceName(); //Абстрактный метод для получения имени устройства

    @Override
    public void connectToWiFi(String network) {
        isConnected = true;
        System.out.println(getDeviceName() + " подключено к " + network);
    }

    @Override
    public void disconnectFromWiFi() {
        isConnected = false;
        System.out.println(getDeviceName() + " отключено от Wi-Fi");

    }

    @Override
    public boolean checkConnectionStatus() {
        return isConnected;
    }

    @Override
    public void turnOn() {
        powerState = true;
        System.out.println(getDeviceName() + "включено");

    }

    @Override
    public void turnOff() {
        powerState = false;
        System.out.println(getDeviceName() + "выключено");

    }

    @Override
    public boolean isOn() {
        return powerState;
    }
    //Дополнительные улучшения : 1.Планировщик активации устройства,который автоматически
    // включает/выключает устройство в указанное время
    @Override
    public void scheduleActivation(String time) {
        activationTime = time;
        System.out.println(getDeviceName() + " запланировано включение в " + activationTime);
    }

    @Override
    public void scheduleDeactivation(String time) {
        deactivationTime = time;
        System.out.println(getDeviceName() + " запланировано выключение в " + deactivationTime);
    }

    //Дополнительные улучшения : 2.Система учёта энергопотребления, позволяющую подсчитать
    // расход энергии каждым устройством.
    @Override
    public void updateEnergyConcumption(double amount) { //увеличивает расход энергии только если устройство включено
        if (powerState) {
            powerConsumption += amount;
        }

    }

    @Override
    public double getEnergyConsumption() {  //возвращает текущее потребление энергии
        return powerConsumption;
    }

    //Дополнительные улучшения : 3.Выполняет голосовую команду и изменяет ключевую фразу.
    @Override
    public void activateVoiceCommand(String command) {
        System.out.println(getDeviceName() + " выполняет команду:  " + command);

    }

    @Override
    public void setWakeWord(String word) {
        wakeWord = word;
        System.out.println(getDeviceName() + " теперь активируется по слову:  " + word);
    }



}

