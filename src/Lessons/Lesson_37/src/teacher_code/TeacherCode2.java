package Lessons.Lesson_37.src.teacher_code;

public class TeacherCode2 {
    static int counter = 0;

    public static void main(String[] args) {
        tailRecursiveA();
    }

    // time capacity = O(infinity)
    // space capacity (heap) = O(1)
    // space capacity (stack) = O(infinity)
    static void directRecursive() {
        System.out.print(counter + " ");
        counter++;
        directRecursive();
    }


    // Ситуация, когда метод не вызывает сам себя, но вызывает другой метод, который вызывает изначальный,
    // называется "хвостовой рекурсией". Правила остановки тут точно такие же, как и в "прямой рекурсии", когда метод
    // на прямую вызывает сам себя, но хвостовую рекурсию сложнее отследить.
    static void tailRecursiveA() {
        System.out.print(counter + " A ");
        counter++;
        tailRecursiveB();
    }


    static void tailRecursiveB() {
        System.out.print(counter + " B ");
        counter++;
        tailRecursiveC();
    }

    static void tailRecursiveC() {
        System.out.print(counter + " C ");
        counter++;
        tailRecursiveD();
    }

    static void tailRecursiveD() {
        System.out.print(counter + " D ");
        counter++;
        tailRecursiveE();
    }

    static void tailRecursiveE() {
        System.out.print(counter + " E ");
        counter++;
        tailRecursiveC();
    }
}
