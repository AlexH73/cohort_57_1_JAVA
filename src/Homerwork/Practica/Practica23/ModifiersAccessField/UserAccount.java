package Homerwork.Practica.Practica23.ModifiersAccessField;
/*Задание: Выбрать правильные модификаторы доступа
 Ниже представлены несколько классов с полями, у которых пока нет модификаторов доступа.
 Ваша задача — назначить правильные модификаторы (public, private, protected), следуя принципам
  инкапсуляции.
 */

 /*// TODO: Назначить модификаторы доступа для полей в соответствии с принципами инкапсуляции.

 class UserAccount {
 String username;
 String password;
 String email;
 int age;
 }
 Copy
*/
//Исправленный код с правильными модификаторами доступа в соответствии с принципами инкапсуляции
public class UserAccount {
     private String username;    //Доступен только внутри класса
     private  String password;
     private String email;
     private int age;             //Поле класса
    //Конструктор
     public UserAccount(String username, String password, String email, int age) {
         this.username = username;
         this.password = password;
         this.email = email;
         this.age = age;
     }

     //Геттеры
     public String getUsername() {
         return username;
     }
     public String getPassword() {
         return password;
     }
     public String getEmail() {
         return email;
     }
     public String getAge() {
         return email;
     }
     //Сеттер с валидацией
     public void setAge(int age) {
         if (age > 0) {
             this.age = age;    //Если имя параметра в конструкторе или методе
                                //совпадает с именем поля класса, this помагает различать их
                                // this.age - поле класса, age - параметр конструктора
         }
     }
}
