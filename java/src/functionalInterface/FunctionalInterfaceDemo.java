package functionalInterface;

import java.util.function.Function;

@FunctionalInterface
interface BookAction {
    void perform();
}

public class FunctionalInterfaceDemo {
    public static Function<Integer, Integer> addFunction = (a) -> a+3;

    static void main() {
        BookAction action = () -> System.out.println("Perform");

        System.out.println(addFunction.apply(3));
    }

}
