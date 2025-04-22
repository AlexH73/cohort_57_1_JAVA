package main_project.src.classes;
import main_project.src.interfaces.*;

import java.util.ArrayList;
import java.util.List;

// Класс Employee реализует интерфейс IEmployee
public class Employee implements IEmployee {
    private String name; // Имя сотрудника
    private String position; // Должность сотрудника
    private List<ISession> managedSessions; // Список сеансов, за которые отвечает сотрудник
    private static final int MAX_SESSIONS = 5; // Максимальное количество сеансов, которое можно назначить сотруднику

    // Конструктор
    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
        this.managedSessions = new ArrayList<>();
    }

    @Override
    public String getPosition() {
        return position;
    }

    @Override
    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public List<ISession> getManagedSessions() {
        return managedSessions;
    }

    @Override
    public void addManagedSession(ISession session) {
        if (managedSessions.size() >= MAX_SESSIONS) {
            throw new EmployeeSessionLimitException("Сотрудник не может отвечать за более чем " + MAX_SESSIONS + " сеансов.");
        }
        managedSessions.add(session);
        System.out.println("Сеанс добавлен к управляемым: " + session);
    }

    @Override
    public void removeManagedSession(ISession session) {
        if (managedSessions.remove(session)) {
            System.out.println("Сеанс удален из управляемых: " + session);
        } else {
            System.out.println("Сеанс не найден среди управляемых.");
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", managedSessions=" + managedSessions +
                '}';
    }

    @Override
    public String getUsername() {
        return "";
    }

    @Override
    public void setUsername(String username) {

    }

    @Override
    public String getPassword() {
        return "";
    }

    @Override
    public void setPassword(String password) {

    }
}

