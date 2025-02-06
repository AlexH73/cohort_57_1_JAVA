package Practice.ThirdParty;

public class Phone {
    /**
     * <h1>Класс Phone.</h1>
     * Создайте класс Phone, который содержит переменные number, model и weight.<br>
     * Создайте три экземпляра этого класса.<br>
     * Выведите на консоль значения их переменных. <br>
     * Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего.
     * Выводит на консоль сообщение “Звонит {name}”. Метод getNumber – возвращает номер телефона.
     * Вызвать эти методы для каждого из объектов.<br>
     * Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации
     * переменных класса - number, model и weight.<br>
     * Добавить конструктор, который принимает на вход два параметра для инициализации
     * переменных класса - number, model. <br>
     * Добавить конструктор без параметров.<br>
     * Вызвать из конструктора с тремя параметрами конструктор с двумя. <br>
     * Добавьте перегруженный метод receiveCall, который принимает
     * два параметра - имя звонящего и номер телефона звонящего. Вызвать этот метод.<br>
     * Создать метод sendMessage с аргументами переменной длины.
     * Данный метод принимает на вход номера телефонов, которым будет отправлено сообщение.
     * Метод выводит на консоль номера этих телефонов.<br>
     * Изменить класс Phone в соответствии с концепцией JavaBean.
     */
    private String number;
    private String model;
    private double weight;

    // Конструктор без параметров
    public Phone() {

    }

    // Конструктор с двумя параметрами
    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    // Конструктор с тремя параметрами
    public Phone(String number, String model, double weight) {
        this(number, model); // Вызов конструктора с двумя параметрами
        this.weight = weight;
    }

    // Геттер для поля number
    public String getNumber() {
        return number;
    }

    // Геттер для поля number
    public String getNumber(String number) {
        return number;
    }

    // Сеттер для поля number
    public void setNumber(String number) {
        this.number = number;
    }

    // Геттер для поля model
    public String getModel() {
        return model;
    }

    // Сеттер для поля model
    public void setModel() {
        this.model = model;
    }

    // Геттер для поля weight
    public double getWeight() {
        return weight;
    }

    // Сеттер для поля weight
    public void setWeight(double weight) {
        this.weight = weight;
    }

    // Метод для получения вызова
    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    // Перегруженный метод для получения вызова с номером телефона
    public void receiveCall(String name, String callerNumber) {
        System.out.println("Звонит " + name + " с номера " + callerNumber);
    }

    // Метод для отправки сообщения на несколько номеров
    public void sendMessage(String... numbers) {
        System.out.println("Отправка сообщения на номера:");
        for (String number : numbers) {
            System.out.println(number);
        }
    }

    // Вывод информации о телефоне
    public void printInfo() {
        System.out.println("Номер: " + number + ", Модель: " + model + ", Вес: " + weight);
    }


}
