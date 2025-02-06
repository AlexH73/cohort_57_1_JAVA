package Lessons.Lesson_22.teachers_code;

// некое приложение, которое служит для отображения погоды
public class WeatherBot {
    // локация где надо узнать погоду
    String location;

    // значения температуры и влажности
    double temperature = Math.random() * 20;
    double humidity = Math.random() * 100;

    public WeatherBot(String location) {
        this.location = location;
    }



}
