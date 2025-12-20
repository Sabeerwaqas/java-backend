package predicate;

import java.util.function.Predicate;

public class PredicateDemo {
    static void main() {
        Predicate<Integer> isEven = n -> n % 2 == 0;

        System.out.println(isEven.test(10));
    }
}
