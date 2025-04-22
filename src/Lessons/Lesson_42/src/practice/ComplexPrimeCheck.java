package Lessons.Lesson_42.src.practice;

public class ComplexPrimeCheck {

    // данный код не соответствует принципу KISS, тк иизлишне усложнен.
    // В качестве входной точки используется метод checkPrime, в который передается число,
    // происходит базовая проверка и в дальнейшем вызывается метод isPrime,
    // хотя можно было бы обойтись исключительно мтеодом isPrime.

    public boolean checkPrime(int number) {
        if (number < 10) {
            if (number == 2 || number == 3 || number == 5 || number == 7) {
                return true;
            } else {
                return false;
            }
        } else {
            return isPrime(number);
        }
    }

    private boolean isPrime(int number) {
        if (number < 2) return false;
        if (number == 2) return true;
        if (number % 2 == 0) return false;
        int sqrt = (int) Math.sqrt(number) + 1;
        for (int i = 3; i < sqrt; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
