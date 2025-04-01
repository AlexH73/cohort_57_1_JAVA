package Lessons.Lesson_36.src.practice.serializable;

import Lessons.Lesson_35.src.practice.serializable.UserProfile;

import java.io.*;
import java.util.Collection;

public class SerializationDemo {
    public static void main(String[] args) {
        Lessons.Lesson_35.src.practice.serializable.UserProfile user = new Lessons.Lesson_35.src.practice.serializable.UserProfile("User123", "secretPassword", 30);

        String fileName = "basic_programming/lesson_33/src/practice/serializable/userProfile.ser";

        System.out.println("Original User Profile: " + user);

        // Сериализация
        //serialize(user, fileName);

        // Десериализация
        Lessons.Lesson_35.src.practice.serializable.UserProfile deserializedUser = deserialize(fileName);

        System.out.println("Deserialized User Profile: " + deserializedUser);

    }

    public static void serialize(Lessons.Lesson_35.src.practice.serializable.UserProfile userProfile, String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(userProfile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Lessons.Lesson_35.src.practice.serializable.UserProfile deserialize(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            return (UserProfile) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}

