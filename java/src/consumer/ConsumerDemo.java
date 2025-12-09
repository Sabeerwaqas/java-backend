package consumer;

import java.util.function.Consumer;

public class ConsumerDemo {
    static void main() {
        Consumer<String> consumer = (str) -> System.out.println(str);

        consumer.accept("Hello World");
    }
}
