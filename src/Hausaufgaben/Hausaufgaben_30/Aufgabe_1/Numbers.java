package Hausaufgaben.Hausaufgaben_30.Aufgabe_1;

import java.util.Objects;

public class Numbers {
    private int numbers;

    public Numbers(int numbers) {
        this.numbers = numbers;
    }

    public int getNumbers() {
        return numbers;
    }

    public void setNumbers(int numbers) {
        this.numbers = numbers;
    }

    @Override
    public String toString() {
        return "Numbers{" +
                "numbers=" + numbers +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Numbers numbers1 = (Numbers) o;
        return Double.compare(numbers, numbers1.numbers) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(numbers);
    }
}
