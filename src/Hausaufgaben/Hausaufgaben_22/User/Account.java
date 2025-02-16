package Hausaufgaben.Hausaufgaben_22.User;

/*
Задание 1: Доработка класса User
Добавить метод isAdult(), который возвращает true, если пользователю 18 лет или больше, и false в противном случае.
Изменить метод displayUserInfo(), чтобы он также отображал информацию о совершеннолетии пользователя.
Протестировать класс, создав несколько объектов User и вызвав все методы.
 */
public class Account {
    String userName;
    String password;
    String email;
    String address;
    int yearOfBirth;

    public Account(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public Account(String userName, String password, String email, String address, int yearOfBirth) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.address = address;
        this.yearOfBirth = yearOfBirth;
    }

    public Account(String ilias, String number, String mail) {
    }

    public boolean isAdult() {
        return (2025 - yearOfBirth) >= 18;
    }

    @Override
    public String toString() {
        return "Account{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", adult user=" + isAdult() +
                '}';
    }
}
