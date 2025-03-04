<details style="padding-top: 18px">
  <summary><b>Homework: Implementing Interfaces in a Smart Device System</b></summary>

## **Task: Creating a Smart Device System Using Interfaces**

🔹 In this assignment, you will **design and implement a smart device system** that supports Wi-Fi connectivity and
remote control.  
🔹 **Step 1:** Define the `Connectable` interface for network-enabled devices.  
🔹 **Step 2:** Implement multiple smart device classes that support this interface.  
🔹 **Step 3:** Use **polymorphism** to manage different devices in a unified way.

---

### **Step 1: Define the `Connectable` Interface**

✔ The `Connectable` interface defines methods for Wi-Fi connectivity.  
✔ It should contain the following methods:

```java
public interface Connectable {
    /**
     * Connects the device to a Wi-Fi network.
     * @param network The name of the Wi-Fi network.
     */
    void connectToWiFi(String network);

    /**
     * Disconnects the device from the Wi-Fi network.
     */
    void disconnectFromWiFi();

    /**
     * Checks the current connection status.
     * @return true if connected, false otherwise.
     */
    boolean checkConnectionStatus();
}
```

---

### **Step 2: Implement Different Smart Devices**

🔹 Implement the `Connectable` interface in different smart device classes.  
🔹 Each device should have its unique functionality.

✔ **Smart Light (`SmartLight`)**

- **Fields:** `brightnessLevel`, `colorTemperature`.
- **Additional methods:**
    - `setBrightness(int level)`: Adjusts the brightness.
    - `setColorTemperature(int temperature)`: Changes the light's color temperature.

✔ **Smart Thermostat (`SmartThermostat`)**

- **Fields:** `currentTemperature`, `targetTemperature`.
- **Additional methods:**
    - `setTemperature(int targetTemp)`: Sets the desired temperature.
    - `getCurrentTemperature()`: Retrieves the current room temperature.

✔ **Smart Speaker (`SmartSpeaker`)**

- **Fields:** `volumeLevel`, `playingTrack`.
- **Additional methods:**
    - `playMusic(String track)`: Starts playing a track.
    - `adjustVolume(int level)`: Adjusts the volume level.

Example implementation:

```java
public class SmartLight implements Connectable {
    private boolean isConnected;

    @Override
    public void connectToWiFi(String network) {
        isConnected = true;
        System.out.println("Smart Light connected to " + network);
    }

    @Override
    public void disconnectFromWiFi() {
        isConnected = false;
        System.out.println("Smart Light disconnected from Wi-Fi");
    }

    @Override
    public boolean checkConnectionStatus() {
        return isConnected;
    }

    public void setBrightness(int level) {
        System.out.println("Brightness set to " + level);
    }
}
```

---

### **Step 3: Using Polymorphism to Control Devices**

✔ Create an **array or list** of `Connectable` objects, including `SmartLight`, `SmartThermostat`, and `SmartSpeaker`.  
✔ Iterate through the list and invoke methods like `connectToWiFi()`, `checkConnectionStatus()`,
and `disconnectFromWiFi()`.  
✔ Demonstrate how **polymorphism** allows managing different devices uniformly.

Example usage:

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
            System.out.println("Connection Status: " + device.checkConnectionStatus());
            device.disconnectFromWiFi();
        }
    }
}
```

---

### **Bonus Tasks**

✔ Implement the method **`scheduleActivation(String time)`**, which automatically turns the device on/off at a specified
time.  
✔ Add an **energy consumption tracker**, calculating the power usage of each device.  
✔ Create an interface **`VoiceControllable`** with the following methods:

- `activateVoiceCommand(String command)`: Executes a voice command.
- `setWakeWord(String word)`: Sets the activation phrase for voice control.

---

### **Expected Learning Outcomes**

✅ Understanding **how interfaces work** and why they are useful.  
✅ Applying **multiple interfaces** in a real-world scenario.  
✅ Using **polymorphism** to handle different smart devices efficiently.  
✅ Enhancing **code maintainability and flexibility** by separating core functionality from additional features.

---

💡 **Think about what other smart devices you could add to your system!** 🚀

</details>

<details style="padding-top: 18px">
  <summary><b>Домашнее задание: Реализация интерфейсов в системе умных устройств</b></summary>

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