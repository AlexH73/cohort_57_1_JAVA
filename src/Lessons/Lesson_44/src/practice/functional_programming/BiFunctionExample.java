package Lessons.Lesson_44.src.practice.functional_programming;

public class BiFunctionExample {

    public static void main(String[] args) {
        BiFunction<Integer, Integer, String> biFunction = (a, b) -> "Result:" + (a + b);
        String result = biFunction.apply(5, 3);
        System.out.println(result);  // Вывод: Result:8
    }
}

