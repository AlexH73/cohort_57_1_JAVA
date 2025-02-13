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

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getFeelsLike() {
        return feelsLike;
    }

    public void setFeelsLike(double feelsLike) {
        this.feelsLike = feelsLike;
    }
}
