package Lessons.Lesson_44.src.practice.functional_programming;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        Function<String, Integer> function = String::length;
        int length = function.apply("Hello");
        System.out.println(length);  // Output: 5


        Function<String, Boolean> isEmail = (s) ->  {return s.contains("@") && s.contains(".");};

        List<String> listOfEmails = List.of("one@mail.com", "two.mail.com", "three@mail");
        ArrayList<String> validMails = new ArrayList<>();

        for (String mail : listOfEmails) {
            if (isEmail.apply(mail))
                validMails.add(mail);
        }

        listOfEmails.stream()
                .filter(isEmail::apply)
                .forEach(validMails::add);

        System.out.println(validMails);

        Auto auto1 = new Auto(100, 1000, 300);
        Auto auto2 = new Auto(200, 1500, 700);

        Function<Auto, Double> maxSpeed = (a) -> {
            return Double.valueOf((a.getHorsePower() * a.getMoment()) / a.getWeight());
        };
        double speed1 = maxSpeed.apply(auto1);
        System.out.println(speed1);


        //в качестве дженерика тип стринг, он же идет в виде аргумента, далее нам надо написать некую реализацию
        // метода execute, который в качестве аргумента принимает значение из дженерика,и ничего не возвращает
        Action<String> example = s -> System.out.println(s.toUpperCase());
        example.execute("hello");

        // в качестве дженерика принимает лист, проверяет, что его длина больше 10, возвращает true/false,
        // тк в анонимном методе  test четко указан тип возвращаемого значения
        Condition<List> minimalSize = l -> l.size() > 10;
        System.out.println(minimalSize.test(listOfEmails));

        // в качестве дженерика принимает некий тип, этот же тип должен быть возвращен в анонимном методе provide
        // который и надо переопределить
        Provider<int[]> createArray = () -> new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println(createArray.provide());

        Consumer<String> consumer = System.out::println;
        consumer.accept("Hello");  // Output: Hello


        Supplier<String> supplier = () -> "Hello";
        String str = supplier.get();
        System.out.println(str);  // Output: Hello

        Predicate<String> predicate = String::isEmpty;
        boolean result = predicate.test("");
        System.out.println(result);  // Output: true
    }


    private static class Auto {
        int horsePower;
        int weight;
        int moment;

        public Auto(int horsePower, int weight, int moment) {
            this.horsePower = horsePower;
            this.weight = weight;
            this.moment = moment;
        }

        public int getHorsePower() {
            return horsePower;
        }

        public int getWeight() {
            return weight;
        }

        public int getMoment() {
            return moment;
        }
    }
}
