package Homerwork.Practica23;
// 1. Поле `temperature` должно быть в диапазоне от -100 до 100 градусов.
// 2. Поле `condition` может быть только "Sunny", "Rainy", "Cloudy" или "Snowy".
public class WeatherReport {
    private double temperature;
    private String condition;

    public double getTemperature() {
        return temperature;
    }

    public String getCondition() {
        return condition;
    }

    public void setTemperature(double temperature) {
        if (temperature >= -100 && temperature <= 100) {
            this.temperature = temperature;
        } else {
            throw new IllegalArgumentException("Температура должна быть в диапазоне от -100 до 100 градусов");//запретить
            // недопустимые значения.
        }
    }

        public void setCondition(String condition) {
            if (condition.equals("Sunny") || condition.equals("Rainy") || condition.equals("Cloudy")
                    || condition.equals("Snowy")) {
                this.condition = condition;
            } else {
                throw new IllegalArgumentException("Invalid weather condition"); //запретить недопустимые значения.
            }
        }
}

