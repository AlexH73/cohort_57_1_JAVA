package Lessons.Lesson_47.application.models;

import java.util.Objects;

public class User {
    private static int userCounter = 0;
    private String userName;
    private String number;
    private int systemId;
    private boolean isOnline;

    public User(String userName, String number) {
        this.userName = userName;
        this.number = number;
        userCounter++;
        systemId = userCounter;
        isOnline = true;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setOnline(boolean online) {
        isOnline = online;
    }

    public String getUserName() {
        return userName;
    }

    public String getNumber() {
        return number;
    }

    public int getSystemId() {
        return systemId;
    }

    public boolean isOnline() {
        return isOnline;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", number='" + number + '\'' +
                ", systemId=" + systemId +
                ", isOnline=" + isOnline +
                '}';
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;

        return getSystemId() == user.getSystemId() && isOnline() == user.isOnline() && Objects.equals(getUserName(), user.getUserName()) && Objects.equals(getNumber(), user.getNumber());
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(getUserName());
        result = 31 * result + Objects.hashCode(getNumber());
        result = 31 * result + getSystemId();
        result = 31 * result + Boolean.hashCode(isOnline());
        return result;
    }
}
