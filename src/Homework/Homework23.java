package Homework;

public class Homework23 {
}
// Часть 1: Ограничение прямого доступа с помощью private полей
// TODO: Сделать поля приватными и добавить только геттеры (без сеттеров).
class Passport {
    private String passportNumber;
    private String holderName;

    public Passport(String passportNumber, String holderName) {
        this.passportNumber = passportNumber;
        this.holderName = holderName;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public String getHolderName() {
        return holderName;
    }
}

// TODO: Сделать поля приватными и добавить только геттеры (без сеттеров).
class ImmutableConfig {
    private String databaseUrl;
    private int maxConnections;
    private boolean isLoggingEnabled;

    public ImmutableConfig(String databaseUrl, int maxConnections, boolean isLoggingEnabled) {
        this.databaseUrl = databaseUrl;
        this.maxConnections = maxConnections;
        this.isLoggingEnabled = isLoggingEnabled;
    }

    public String getDatabaseUrl() {
        return databaseUrl;
    }

    public int getMaxConnections() {
        return maxConnections;
    }

    public boolean isLoggingEnabled() {
        return isLoggingEnabled;
    }
}

// Часть 2: Реализация контролируемого доступа через геттеры и сеттеры
// TODO: Реализовать геттеры и сеттеры с валидацией.
// 1. `grade` должно быть в диапазоне от 0 до 100.
// 2. `subject` не может быть пустым или null.
class StudentGrade {
    private String subject;
    private int grade;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        if (subject == null || subject.isEmpty()) {
            return;
        }
        this.subject = subject;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade < 0 || grade > 100) {
            return;
        }
        this.grade = grade;
    }
}

// TODO: Реализовать геттеры и сеттеры с валидацией.
// 1. `seatsAvailable` не может быть отрицательным.
// 2. `destination` не может быть пустым.
class TrainTicket {
    private String destination;
    private int seatsAvailable;

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        if (destination == null || destination.isEmpty()) {
            return;
        }
        this.destination = destination;
    }

    public int getSeatsAvailable() {
        return seatsAvailable;
    }

    public void setSeatsAvailable(int seatsAvailable) {
        if (seatsAvailable < 0) {
            return;
        }
        this.seatsAvailable = seatsAvailable;
    }
}

// TODO: Реализовать геттеры и сеттеры с валидацией.
// 1. `temperature` должно быть в диапазоне от -50 до 50 градусов.
// 2. `feelsLike` не может быть выше, чем `temperature`.
class WeatherForecast {
    private double temperature;
    private double feelsLike;

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        if (temperature < -50 || temperature > 50) {
            return;
        }
        this.temperature = temperature;
    }

    public double getFeelsLike() {
        return feelsLike;
    }

    public void setFeelsLike(double feelsLike) {
        if (feelsLike > this.temperature) {
            return;
        }
        this.feelsLike = feelsLike;
    }
}

// Часть 3: Инкапсуляция с приватными методами

// TODO: Реализовать приватные методы для валидации внутри класса.
// 1. `setDiscountPercentage()` должен принимать только значения от 0 до 50%.
// 2. Приватный метод `validateDiscount()` должен использоваться внутри сеттера.
class OnlineStore {
    private String productName;
    private double price;
    private int discountPercentage;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        if (productName == null || productName.isEmpty()) {
            return;
        }
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            return;
        }
        this.price = price;
    }

    public int getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(int discountPercentage) {
        if (validateDiscount(discountPercentage)) {
            this.discountPercentage = discountPercentage;
        }
    }

    private boolean validateDiscount(int discountPercentage) {
        return discountPercentage >= 0 && discountPercentage <= 50;
    }
}
