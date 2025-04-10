package Lessons.Lesson_39.src.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class LanguageCard39 {
    // Хранилище для слов и их переводов
    private HashMap<String, String> wordMap = new HashMap<>();
    // Map mistakeCountMap = new HashMap<>(); содержит слово и количество неверных ответов



    // Метод для добавления нового слова и его перевода
    public void addWord(String foreignWord, String nativeWord) {
        wordMap.put(foreignWord, nativeWord);
    }

    // Метод для практики слов
    public void practice() {
        if (wordMap.isEmpty()) {
            System.out.println("Словарь пуст. Пожалуйста, добавьте слова для практики.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Преобразование ключей мапы в список для удобного доступа
        ArrayList<String> keys = new ArrayList<>(wordMap.keySet());

        // Случайный выбор слова для проверки
        String randomKey = keys.get(random.nextInt(keys.size()));
        String correctAnswer = wordMap.get(randomKey);

        // Задаем вопрос
        System.out.println("Каков перевод слова " + randomKey + "?");
        String userAnswer = scanner.nextLine();

        // Проверка ответа
        if (correctAnswer.equalsIgnoreCase(userAnswer)) {
            System.out.println("Верно!");
        } else {
            System.out.println("Неверно! Правильный ответ: " + correctAnswer);
        }

        scanner.close();
    }

    public void practiceDifficultWord(){}

    public static void main(String[] args) {
        // Пример использования класса LanguageCard
        LanguageCard myCard = new LanguageCard();

        // Добавление слов
        myCard.addWord("apple", "яблоко");
        myCard.addWord("dog", "собака");
        myCard.addWord("hello", "привет");

        // Запуск практики
        myCard.practice();
    }
}

