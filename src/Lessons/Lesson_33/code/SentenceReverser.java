package Lessons.Lesson_33.code;

import java.util.List;

/**
 * Интерфейс для обработки строк с использованием стека.
 * Основная задача — реверсировать порядок слов в предложении, сохраняя порядок символов в каждом слове.
 */
public interface SentenceReverser {

    /**
     * Принимает строку с предложением и возвращает новую строку,
     * в которой порядок слов изменён на обратный, но порядок букв в словах остается неизменным.
     *
     * Например:
     * Вход: "Hello world this is Java"
     * Выход: "Java is this world Hello"
     *
     * @param sentence строка, содержащая несколько слов, разделённых пробелами
     * @return строка с реверсированным порядком слов
     */
    String reverseWords(String sentence);

    /**
     * Разбивает строку на слова и сохраняет их в стек.
     *
     * @param sentence строка, которую нужно обработать
     * @return стек, содержащий слова из строки
     */
    List<String> pushWordsToStack(String sentence);

    /**
     * Извлекает слова из стека и собирает их в строку в обратном порядке.
     *
     * @param wordsStack стек со словами
     * @return строка с перевернутым порядком слов
     */
    String buildReversedSentence(List<String> wordsStack);
}