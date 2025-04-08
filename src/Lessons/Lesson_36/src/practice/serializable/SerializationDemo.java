package Lessons.Lesson_36.src.practice.serializable;

import java.io.*;
import java.util.Collection;

public class SerializationDemo {
    public static void main(String[] args) {
        String fileName = "src/Lessons/Lesson_36/src/practice/serializable/userProfile.ser";

        UserProfile user = new UserProfile("User123", "secretPassword", 30);
        System.out.println("Original User Profile: " + user);

        // Сериализация
        serialize(user, fileName);

        // Десериализация
        UserProfile deserializedUser = deserialize(fileName);
        System.out.println("Deserialized User Profile: " + deserializedUser);

    }

    public static void serialize(UserProfile userProfile, String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(userProfile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static UserProfile deserialize(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            return (UserProfile) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}

