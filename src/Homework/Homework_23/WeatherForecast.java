package Homework.Homework_23;

//[x] TODO: Реализовать геттеры и сеттеры с валидацией.
// 1. `temperature` должно быть в диапазоне от -50 до 50 градусов.
// 2. `feelsLike` не может быть выше, чем `temperature`.
class WeatherForecast {
    private double temperature;
    private double feelsLike;

    // Геттер для temperature
    public double getTemperature() {
        return temperature;
    }

    // Сеттер для temperature с валидацией
    public void setTemperature(double temperature) {
        if (temperature < -50 || temperature > 50) {
            System.out.println("Температура должна быть в диапазоне от -50 до 50 градусов.");
            return;
        }
        this.temperature = temperature;
    }

    // Геттер для feelsLike
    public double getFeelsLike() {
        return feelsLike;
    }

    // Сеттер для feelsLike с валидацией
    public void setFeelsLike(double feelsLike) {
        if (feelsLike > temperature) {
            System.out.println("Ощутимость не может быть выше, чем температура.");
            return;
        }
        this.feelsLike = feelsLike;
    }
}

