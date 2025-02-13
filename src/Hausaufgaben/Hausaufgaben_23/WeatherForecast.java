package Hausaufgaben.Hausaufgaben_23;

public class WeatherForecast {
    private double temperature;
    private double feelsLike;

    public WeatherForecast(double temperature, double feelsLike) {
        this.temperature = temperature;
        this.feelsLike = feelsLike;
    }

    public double getTemperature() {
        return temperature;
    }
    // 1. `temperature` должно быть в диапазоне от -50 до 50 градусов.
    public void setTemperature(double temperature) {
        if (-50 <=temperature || temperature <= 50)
            this.temperature = temperature;
    }

    public double getFeelsLike() {
        return feelsLike;
    }
    // 2. `feelsLike` не может быть выше, чем `temperature`.
    public void setFeelsLike(double feelsLike) {
        if (feelsLike <= temperature) {
            this.feelsLike = feelsLike;
        }
    }
}
