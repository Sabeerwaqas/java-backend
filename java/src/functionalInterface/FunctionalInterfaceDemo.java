package functionalInterface;

import java.lang.classfile.Interfaces;
import java.util.function.Function;

@FunctionalInterface
interface BookAction {
    void perform();
}

public class FunctionalInterfaceDemo {
    public static Function<Integer, Integer> addFunction = (a) -> a+3;
    public static Function<Integer, Integer> subtractFunction = (a) -> a - 3;
    public static Function<Integer, Integer> combinedFunction = addFunction.andThen(subtractFunction);

    static void main() {
        BookAction action = () -> System.out.println("Perform");

        System.out.println(addFunction.apply(3));
        System.out.println(subtractFunction.apply(3));
        System.out.print(combinedFunction.apply(3));
    }

}
