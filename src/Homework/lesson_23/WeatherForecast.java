package Homework.lesson_23;

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
