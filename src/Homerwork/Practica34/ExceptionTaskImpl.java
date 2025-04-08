package Homerwork.Practica34;

import java.util.ArrayList;
import java.util.List;

    public class ExceptionTaskImpl implements ExceptionTasks {
        /**
         * Делит одно число на другое.
         * Если второй аргумент равен нулю — выбросить {@link ArithmeticException} с сообщением:
         * "Деление на ноль недопустимо".
         *
         * @param dividend делимое.
         * @param divisor  делитель.
         * @return результат деления.
         */
        @Override
        public int divide(int dividend, int divisor) {
            if (divisor == 0) {
                throw new ArithmeticException("Деление на ноль недопустимо");
            }
            int result = dividend / divisor;
            return result;
        }


        /**
         * Возвращает элемент из списка по указанному индексу.
         * Если индекс выходит за пределы допустимого диапазона, выбросить {@link IndexOutOfBoundsException}
         * с сообщением: "Индекс <index> вне допустимого диапазона от 0 до <maxIndex>".
         *
         * @param list  список элементов.
         * @param index индекс для доступа к элементу.
         * @return строка из списка по указанному индексу.
         */
        @Override
        public String getElementByIndex(List<String> list, int index) {
            if (index < 0 || index > list.size() - 1) {
                throw new IndexOutOfBoundsException(" Индекс " + index + " вне допустимого диапазона от 0 до " + (list.size() - 1));
            }
            return list.get(index);
        }


        /**
         * Проверяет корректность строки e-mail.
         * Если e-mail некорректный — выбросить {@link IllegalArgumentException} с пояснением причины.
         *
         * <p>Подсказки для проверки:
         * <ul>
         *     <li>Пустая строка или null → выбросить исключение.</li>
         *     <li>Отсутствует символ '@' → выбросить исключение.</li>
         *     <li>Нет точки после '@' → выбросить исключение.</li>
         * </ul>
         *
         * @param email строка e-mail.
         * @return true, если e-mail валидный.
         */
        @Override
        public boolean validateEmail(String email) {
            if (email == null) {
                throw new IllegalArgumentException("email равен null");
            }

            if (email.isBlank()) {
                throw new IllegalArgumentException("email пустой");
            }

            // Отсутствует символ '@' → выбросить исключение.
            if (!email.contains("@")){
                throw new IllegalArgumentException("Отсутствует символ '@'");
            }

            // Нет точки после '@' → выбросить исключение. (сравнить индексы '@' и '.')
            if (email.indexOf("@") > email.indexOf(".")){
                throw new IllegalArgumentException("Нет точки после '@'");
            }

            return true;
        }

        public static void main(String[] args) {
            Lessons.Lesson_34.code.classwork.ExceptionTasksImpl task = new Lessons.Lesson_34.code.classwork.ExceptionTasksImpl();
            System.out.println(task.divide(5, 3));
            //task.divide(5, 0);
            List<String> list = new ArrayList<>();
            list.add("one");
            list.add("two");
            list.add("three");
            //task.getElementByIndex(list, 3);
            System.out.println(task.getElementByIndex(list, 2));
            //task.validateEmail("moj email.tut");
            //task.validateEmail("moj email.tut@");
            //task.validateEmail("moj@email tut");
            System.out.println(task.validateEmail("moj@email.tut"));

        }
    }

