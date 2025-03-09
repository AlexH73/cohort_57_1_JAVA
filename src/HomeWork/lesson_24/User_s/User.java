package HomeWork.lesson_24.User_s;

public class User {
    private String userName;
    private String userMail;

    public User(String userName,String userMail) {
        this.userName = userName;
        this.userMail = userMail;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserMail() {
        return userMail;
    }

    @Override
    public String toString() {
        return "\nuserName: " + userName +
                "\nuserMail: " + userMail ;
    }
}
