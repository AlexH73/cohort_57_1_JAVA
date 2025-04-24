package Practice.Practice_43;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Test {
    public static void main(String[] args) {
        F f = () -> System.out.println("Done");
        f.run();

        Consumer<String> c = String::length;
        c.accept("abc");

        F h = A::hello;
        h.run();

        F g = A::new;
        g.run();

        Function<String, Integer> fn = String::length;
        System.out.println(fn.apply("abcde"));

        Function<Integer, Integer> x = n -> 10 / n;
        System.out.println(x.apply(3));

        Predicate<Integer> isEven = n -> n % 2 == 0;
        Function<Integer, Integer> sq = n -> n * n;
        Consumer<Integer> pr = System.out::println;
        List<Integer> nums = List.of(1, 2, 3);

        for (Integer n : nums) {
            if (isEven.test(n)) {
                pr.accept(sq.apply(n));
            }
        }

        Supplier<String> sup = () -> "null";
        System.out.println(sup.get().length());
    }
}
