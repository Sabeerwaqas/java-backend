package biFunction;

import java.util.function.BiFunction;

public class BiFunctionDemo {

    public static BiFunction<Integer, Integer, Integer> addFunction = (a,b)-> a+b;

    public static BiFunction<Integer,Integer,Integer> subtractFunction = (a,b) -> a-b;

    static void main() {
        System.out.println(addFunction.apply(10,10));
        System.out.println(subtractFunction.apply(10,5));
    }
}
