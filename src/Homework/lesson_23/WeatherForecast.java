package Homework.lesson_23;

public class WeatherForecast {
    private double temperature;
    private double feelsLike;

    //Конструктор
    public WeatherForecast(double temperature, double feelsLike) {
        this.temperature = temperature;
        this.feelsLike = feelsLike;
    }
    //Геттеры
    public double getTemperature() {
        return temperature;
    }

    public double getFeelsLike() {
        return feelsLike;
    }
    //Сеттеры с валидацией
    public void setTemperature(double temperature) {
        if (temperature < -50 || temperature > 50) {
            throw new IllegalArgumentException("Температура должна быть в диапазоне" +
                    " от -50 до 50 градусов.");
        }
        this.temperature = temperature;
    }

    public void setFeelsLike(double feelsLike) {
        if (feelsLike > this.temperature) {
            throw new IllegalArgumentException("Ощущаемая температура не может быть выше" +
                    " фактической температуры");
        }
        this.feelsLike = feelsLike;
    }
}
