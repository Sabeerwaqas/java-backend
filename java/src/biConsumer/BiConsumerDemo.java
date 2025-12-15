package biConsumer;

import java.util.function.BiConsumer;

public class BiConsumerDemo {

    static void main() {
        BiConsumer<Integer,Integer> addConsumer = (a,b) -> System.out.println(a+b);
        addConsumer.accept(10,10);
    }

}
