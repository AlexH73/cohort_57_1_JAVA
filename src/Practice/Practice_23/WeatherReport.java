package Practice.Practice_23;

//[х] TODO: Реализовать геттеры и сеттеры с валидацией.
// 1. Поле `temperature` должно быть в диапазоне от -100 до 100 градусов.
// 2. Поле `condition` может быть только "Sunny", "Rainy", "Cloudy" или "Snowy".
public class WeatherReport {
    private double temperature;
    private String condition;

    // Геттер для temperature
    public double getTemperature() {
        return temperature;
    }

    // Сеттер для temperature с валидацией
    public void setTemperature(double temperature) {
        if (temperature < -100 || temperature > 100) {
            System.out.println("Температура должна быть в диапазоне от -100 до 100 градусов.");
        }
        this.temperature = temperature;
    }

    // Геттер для condition
    public String getCondition() {
        return condition;
    }

    // Сеттер для condition с валидацией
    public void setCondition(String condition) {
        if (condition != "Солнечно" ||
                condition != "Дождливо" || condition != "Облачно" ||
                condition != "Снежно" || condition == null) {
            System.out.println("Тут может быть только \"Солнечно\", \"Дождливо\", \"Облачно\" или \"Снежно\"");
        }
        this.condition = condition;
    }
}
