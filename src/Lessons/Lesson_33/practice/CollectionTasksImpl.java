package Lessons.Lesson_33.practice;

import java.util.*;

/**
 * Реализация интерфейса CollectionTasks. Студенты должны реализовать логику методов в соответствии с их описанием.
 */
public class CollectionTasksImpl implements CollectionTasks {
    public static void main(String[] args) {
        CollectionTasks tasks = new CollectionTasksImpl();

        //System.out.println(tasks.countWordFrequency(List.of("one", "two", "three", "two", "three", "four")));
        System.out.println(tasks.reverseWordsInSentence("Переставляет слова в предложении в обратном порядке"));
    }

    /**
     * Переставляет слова в предложении в обратном порядке. Возвращает строку, где порядок слов изменен на обратный, но
     * порядок символов внутри слов сохранен.
     *
     * @param sentence входное предложение.
     * @return строка с переставленными словами.
     */
    @Override
    public String reverseWordsInSentence(String sentence) {
        Stack<String> stack = new Stack<>();

        String[] words = sentence.split(" ");
        for (String word : words) {
            stack.push(word);
        }
        String[] words2 = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            words2[i] = stack.pop();
        }
        return String.join(" ", words2);
    }

    /**
     * Выполняет циклический сдвиг элементов очереди на `k` позиций.
     *
     * @param queue очередь чисел.
     * @param k     количество шагов сдвига.
     * @return очередь после выполнения сдвига.
     * <p>
     * [1 2 3 4 5 6] , 3 -> [4 5 6 1 2 3]
     *
     * [1 2 3 4 5 6] , 1 -> [2 3 4 5 6] element = [1 2 3 4 5 6].poll() -> [2 3 4 5 6].offer(element) -> [2 3 4 5 6 1]
     */
    public Queue<Integer> rotateQueue(Queue<Integer> queue, int k) {
        return null;
    }

    /**
     * Определяет день с максимальными и минимальными расходами. Дана `Map<Integer, List<Double>>`, где ключ — день
     * месяца, а значение — список покупок за этот день. Метод должен вернуть массив `int[2]`, где: - `result[0]` — день
     * с минимальными тратами. - `result[1]` — день с максимальными тратами.
     *
     * @param dailyExpenses мапа, содержащая траты по дням.
     * @return массив из двух значений: [день_с_мин_тратами, день_с_макс_тратами].
     */
    @Override
    public int[] findMinMaxExpenseDays(Map<Integer, List<Double>> dailyExpenses) {
        return null;
    }

    /**
     * Находит второе максимальное число в списке. Если такого нет — вернуть `Integer.MIN_VALUE`.
     *
     * @param numbers список чисел.
     * @return второе наибольшее число или `Integer.MIN_VALUE`, если его нет.
     * <p>
     * [1, 2, 3, 4, 5] -> 4 [4, 4, 4, 4] -> Integer.MIN_VALUE
     */
    @Override
    public int findSecondMax(List<Integer> numbers) {

        return Integer.MIN_VALUE;
    }

    /**
     * Подсчитывает количество повторений каждого слова в списке. Должен вернуть `Map<String, Integer>`, где ключ —
     * слово, а значение — количество его повторений.
     *
     * @param words список слов.
     * @return мапа, содержащая слова и их частоту встречаемости.
     * <p>
     * "Яблоко" и "яблоко" -> разные слова
     */
    @Override
    public Map<String, Integer> countWordFrequency(List<String> words) {
        // Шаг 1. Посмотрел в условия и создал мапу, которую верну.
        Map<String, Integer> map = new HashMap<>();

        // ТК мап позволяет проверить наличие ключа, я просто переберу все слова по очереди
        // и если в мап есть такой ключ, то увеличу значение (val) по этому ключу на 1,
        // если нет - положу в мапу map.put(слово, 1) тк оно встретилось впервые.
        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i);
            if (map.containsKey(word)) {
                int key = map.get(word);
                key++;
                map.put(word, key);
            } else {
                map.put(word, 1);
            }
        }

        return map;
    }

    /**
     * Объединяет два списка в один, удаляя дубликаты. Метод должен возвращать новый список, содержащий только
     * уникальные элементы из обоих списков.
     *
     * @param list1 первый список чисел.
     * @param list2 второй список чисел.
     * @return объединенный список с уникальными значениями.
     * <p>
     * .addAll();
     */
    @Override
    public List<Integer> mergeUniqueLists(List<Integer> list1, List<Integer> list2) {
        return null;
    }

    /**
     * Фильтрует список строк по заданной минимальной длине слова. Оставляет только слова, длина которых больше
     * `minLength`.
     *
     * @param words     список слов.
     * @param minLength минимально допустимая длина слова.
     * @return список слов, удовлетворяющих условию.
     */
    @Override
    public List<String> filterWordsByLength(List<String> words, int minLength) {
        return null;
    }

    /**
     * Группирует строки по их длине. Вернет `Map<Integer, List<String>>`, где ключ — длина слова, а значение — список
     * всех слов данной длины.
     *
     * @param words список слов.
     * @return мапа, содержащая длину слова как ключ и список слов соответствующей длины как значение.
     */
    @Override
    public Map<Integer, List<String>> groupWordsByLength(List<String> words) {
        return null;
    }

    /**
     * Находит пересечение трех списков. Вернет `List<Integer>`, содержащий числа, встречающиеся во всех трех списках.
     *
     * @param list1 первый список чисел.
     * @param list2 второй список чисел.
     * @param list3 третий список чисел.
     * @return список чисел, встречающихся во всех трех списках.
     */
    @Override
    public List<Integer> findCommonElements(List<Integer> list1, List<Integer> list2, List<Integer> list3) {
        return null;
    }

    /**
     * Определяет первый неповторяющийся символ в строке. Вернет ``, содержащий первый уникальный символ.
     *
     * @param input входная строка.
     * @return первый неповторяющийся символ или ``, если такого нет.
     * <p>
     * "aaaaaa" -> '' aaabbbcddd -> c abc -> 'a'
     */
    @Override
    public Character findFirstUniqueCharacter(String input) {
        return null;
    }

    /**
     * Находит уникальные пары чисел, сумма которых равна заданному числу. Вернет `List<List<Integer>>`, содержащий
     * только уникальные пары.
     *
     * @param numbers   список чисел.
     * @param targetSum целевое значение суммы.
     * @return список пар чисел, дающих `targetSum`.
     */
    @Override
    public List<List<Integer>> findUniquePairsWithSum(List<Integer> numbers, int targetSum) {
        return null;
    }
}