package Lessons.Lesson_22.teachers_code;

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

    @Override
    public String toString() {
        return "Account{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }
}
