package Homerwork.Practica;
/*Практическое задание по наследованию
Задача: Реализация цепочки наследования для умных устройств
🔹 В этом задании вам нужно построить иерархию классов, используя наследование.
🔹 Шаг 1: Создать базовый класс SmartDevice и унаследовать от него Smartphone, Tablet и SmartWatch.
🔹 Шаг 2: Реализовать цепочку наследования, сначала расширяя MusicPlayer, затем Camera, а затем SmartDevice.
🔹 Шаг 3: Использовать super для вызова методов и конструкторов родительского класса.

Шаг 1: Создание базового класса SmartDevice
🔹 Базовый класс SmartDevice должен содержать:
✔ Поля brand (бренд) и model (модель).
✔ Метод powerOn(), который выводит "Устройство включается...".

class SmartDevice {
    String brand;
    String model;

    SmartDevice(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    void powerOn() {
        System.out.println(model + " включается...");
    }
}
Copy
Шаг 2: Создание подклассов Smartphone, Tablet, SmartWatch
🔹 Каждый подкласс наследуется от SmartDevice и добавляет уникальный метод:
✔ Smartphone – makeCall(String number).
✔ Tablet – drawOnScreen().
✔ SmartWatch – showTime().

class Smartphone extends SmartDevice {
    Smartphone(String brand, String model) {
        super(brand, model);
    }

    void makeCall(String number) {
        System.out.println("Звоним на " + number);
    }
}

class Tablet extends SmartDevice {
    Tablet(String brand, String model) {
        super(brand, model);
    }

    void drawOnScreen() {
        System.out.println("Рисуем на экране...");
    }
}

class SmartWatch extends SmartDevice {
    SmartWatch(String brand, String model) {
        super(brand, model);
    }

    void showTime() {
        System.out.println("Текущее время: 12:30");
    }
}
Copy
Шаг 3: Реализация цепочки наследования
🔹 Теперь создадим цепочку наследования, начиная с MusicPlayer.

1. Класс MusicPlayer – базовый класс
🔹 Содержит метод playMusic().

class MusicPlayer {
    void playMusic() {
        System.out.println("Воспроизведение музыки...");
    }
}
Copy
2. Класс Camera, наследуется от MusicPlayer
🔹 Добавляет метод takePhoto().

class Camera extends MusicPlayer {
    void takePhoto() {
        System.out.println("Снимок сделан!");
    }
}
Copy
3. Класс SmartDevice, наследуется от Camera
🔹 Теперь SmartDevice получает музыкальный плеер и камеру.

class SmartDevice extends Camera {
    String brand;
    String model;

    SmartDevice(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    void powerOn() {
        System.out.println(model + " включается...");
    }
}
Copy
4. Класс Smartphone, наследуется от SmartDevice
🔹 Теперь Smartphone умеет играть музыку, делать снимки, включаться и звонить.

class Smartphone extends SmartDevice {
    Smartphone(String brand, String model) {
        super(brand, model);
    }

    void makeCall(String number) {
        System.out.println("Звоним на " + number);
    }

    @Override
    void takePhoto() {
        super.takePhoto();
        System.out.println("Фильтр применён к фото!");
    }
}
Copy
Шаг 4: Тестирование наследования
Создадим объекты и протестируем, как работают все унаследованные методы.

public class Main {
    public static void main(String[] args) {
        Smartphone phone = new Smartphone("Samsung", "Galaxy S22");
        phone.powerOn();
        phone.playMusic();
        phone.takePhoto();
        phone.makeCall("+123456789");

        Tablet tablet = new Tablet("Apple", "iPad Pro");
        tablet.powerOn();
        tablet.drawOnScreen();

        SmartWatch watch = new SmartWatch("Garmin", "Forerunner 955");
        watch.powerOn();
        watch.showTime();
    }
}
Copy
Ожидаемый вывод в консоль:

Galaxy S22 включается...
Воспроизведение музыки...
Снимок сделан!
Фильтр применён к фото!
Звоним на +123456789
iPad Pro включается...
Рисуем на экране...
Forerunner 955 включается...
Текущее время: 12:30
Copy
Вывод
✅ Наследование помогает строить логичные иерархии, объединяя связанные классы.
✅ Цепочка классов MusicPlayer → Camera → SmartDevice → Smartphone показывает, как можно последовательно расширять функциональность.
✅ Использование super позволяет вызывать методы родительского класса и добавлять новое поведение.*/
public class Practica_242 {
}
