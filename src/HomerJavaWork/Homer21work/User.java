package HomerJavaWork.Homer21work;
/*Задание 1: Доработка класса User
Добавить метод isAdult(), который возвращает true, если пользователю 18 лет или больше, и false в противном случае.
Изменить метод displayUserInfo(), чтобы он также отображал информацию о совершеннолетии пользователя.
Протестировать класс, создав несколько объектов User и вызвав все методы.

 */
public class User {
   private String name;
   private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public boolean isAdult() {
        return age >= 18;
    }
   public void displayUserInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Совершеннолетний: " + (isAdult() ? "Да" : "Нет"));
   }








}
