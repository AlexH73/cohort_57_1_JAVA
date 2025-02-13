// // TODO: Реализовать геттеры и сеттеры с валидацией.
/// / 1. `temperature` должно быть в диапазоне от -50 до 50 градусов.
/// / 2. `feelsLike` не может быть выше, чем `temperature`.


package Homework.lesson_23.HomeworkYulia_23;

public class WeatherForecast {
    private double temperature;
    private double feelsLike;

    public double getTemperature() {
        return temperature;
    }

    public double getFeelsLike() {
        return feelsLike;
    }


    public void setTemperature(double temperature) {
        if (temperature <= 50 && temperature >= -50) {
            this.temperature = temperature;
        } else
            System.out.println("Введённое значение должно быть в диапазоне от -50 до 50");
    }

    public void setFeelsLike(double feelsLike) {
        if (feelsLike <= temperature) {
            this.feelsLike = feelsLike;
        } else {
            System.out.println("feelsLike не может быть выше, чем temperature");
        }
    }
}