package Homework.lesson_31.Task_1;

import java.util.HashSet;
import java.util.Set;

public class CollectionOperations implements CollectionOperationsHomework {

    // Создаём Set для хранения уникальных элементов
    private Set<String> uniqueElements = new HashSet<>();

    @Override
    public void addElement(String element) { //Добавляет всего один элемент
        uniqueElements.add(element);

    }

    @Override
    public void addAllElements(String[] elements) { //Добавляет сразу несколько элементов.
        for (String element : elements) {
            uniqueElements.add(element);
        }

    }

    @Override
    public int countUniqueElements() { //Возвращает количество элементов без повторений.
        return uniqueElements.size();
    }

}
