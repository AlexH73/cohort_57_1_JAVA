package Homework.lesson_24;
//Класс PremiumStudent наследуется от Student
public class PremiumStudent extends Student {
    private String memberschiplevel;

    //Конструктор
    public PremiumStudent(String username, String email, String studentId, String memberschiplevel) {
        super(username, email, studentId);
        this.memberschiplevel = memberschiplevel;
    }
    //Геттер
    public String getMemberschiplevel() {
        return memberschiplevel;
    }
    //Переопределение метода для отображения информации
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Уровень подписки: " + memberschiplevel);
    }

}
