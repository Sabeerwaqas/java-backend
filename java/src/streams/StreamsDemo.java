package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsDemo {
    static void main() {
        List<String> items = Arrays.asList("Apple","Mango");
        items.forEach(System.out::println);

        Stream<String> streamNew = items.stream();

        streamNew.filter((item) -> item.startsWith("A")).forEach(System.out::println);

    }
}
