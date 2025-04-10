
## **Задание: Создание системы управления умными устройствами с использованием интерфейсов**

🔹 В этом задании вам предстоит **разработать систему умных устройств**, поддерживающих Wi-Fi подключение и удалённое
управление.  
🔹 **Шаг 1:** Определить интерфейс `Connectable` для устройств с возможностью подключения к сети.  
🔹 **Шаг 2:** Реализовать несколько классов устройств, поддерживающих этот интерфейс.  
🔹 **Шаг 3:** Использовать **полиморфизм** для единообразного взаимодействия с разными умными устройствами.

---

### **Шаг 1: Определение интерфейса `Connectable`**

✔ Интерфейс `Connectable` определяет методы для подключения устройств к сети.  
✔ Опишите в нём следующие методы:

```java
public interface Connectable {
    /**
     * Подключает устройство к Wi-Fi сети.
     * @param network Название сети.
     */
    void connectToWiFi(String network);

    /**
     * Отключает устройство от сети Wi-Fi.
     */
    void disconnectFromWiFi();

    /**
     * Проверяет статус подключения.
     * @return true, если подключено, false – в противном случае.
     */
    boolean checkConnectionStatus();
}
```

---

### **Шаг 2: Реализация различных умных устройств**

🔹 Реализуйте интерфейс `Connectable` в разных классах устройств.  
🔹 Каждое устройство должно иметь свою уникальную функциональность.

✔ **Умная лампа (`SmartLight`)**

- **Поля:** `brightnessLevel`, `colorTemperature`.
- **Дополнительные методы:**
    - `setBrightness(int level)`: Регулирует уровень яркости.
    - `setColorTemperature(int temperature)`: Изменяет цветовую температуру.

✔ **Умный термостат (`SmartThermostat`)**

- **Поля:** `currentTemperature`, `targetTemperature`.
- **Дополнительные методы:**
    - `setTemperature(int targetTemp)`: Устанавливает желаемую температуру.
    - `getCurrentTemperature()`: Получает текущую температуру в помещении.

✔ **Умная колонка (`SmartSpeaker`)**

- **Поля:** `volumeLevel`, `playingTrack`.
- **Дополнительные методы:**
    - `playMusic(String track)`: Запускает воспроизведение трека.
    - `adjustVolume(int level)`: Регулирует громкость.

Пример реализации:

```java
public class SmartLight implements Connectable {
    private boolean isConnected;

    @Override
    public void connectToWiFi(String network) {
        isConnected = true;
        System.out.println("Умная лампа подключена к " + network);
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

    public void setBrightness(int level) {
        System.out.println("Яркость установлена на " + level);
    }
}
```

---

### **Шаг 3: Использование полиморфизма для управления устройствами**

✔ Создайте **массив или список** объектов `Connectable`, включающий `SmartLight`, `SmartThermostat` и `SmartSpeaker`.  
✔ Проитерируйте коллекцию и вызовите методы `connectToWiFi()`, `checkConnectionStatus()`, `disconnectFromWiFi()`.  
✔ Покажите, как **полиморфизм** позволяет работать с разными устройствами одинаковым образом.

Пример использования:

```java
public class SmartHome {
    public static void main(String[] args) {
        Connectable[] devices = {
                new SmartLight(),
                new SmartThermostat(),
                new SmartSpeaker()
        };

        for (Connectable device : devices) {
            device.connectToWiFi("HomeWiFi");
            System.out.println("Статус подключения: " + device.checkConnectionStatus());
            device.disconnectFromWiFi();
        }
    }
}
```

---

### **Дополнительные задания**

✔ Реализовать метод **`scheduleActivation(String time)`**, который автоматически включает/выключает устройство в
указанное время.  
✔ Добавить систему **учёта энергопотребления**, позволяющую подсчитать расход энергии каждым устройством.  
✔ Создать интерфейс **`VoiceControllable`** с методами:

- `activateVoiceCommand(String command)`: Выполняет голосовую команду.
- `setWakeWord(String word)`: Устанавливает ключевую фразу для активации голосового управления.

---

### **Ожидаемые результаты**

✅ Понимание **принципов работы интерфейсов** и их применения.  
✅ Реализация **множественного наследования** через интерфейсы.  
✅ Использование **полиморфизма** для унифицированного управления разными устройствами.  
✅ Улучшение **гибкости и расширяемости кода** за счёт разделения функционала на классы и интерфейсы.

---

💡 **Подумайте, какие ещё умные устройства можно добавить в вашу систему!** 🚀

</details>
