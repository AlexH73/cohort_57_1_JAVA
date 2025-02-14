package Homework.lesson_23;

public class WeatherForecastTest {
    public static void main(String[] args) {
        //Тестируем WeatherForecast
        WeatherForecast weather = new WeatherForecast(25, 22);
        System.out.println("\nТемпература: " + weather.getTemperature());
        System.out.println("Ощущается как: " + weather.getFeelsLike());
    }
}
