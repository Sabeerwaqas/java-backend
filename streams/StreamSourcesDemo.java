package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamSourcesDemo {

    /*
     *   From collections: e.g., collection.stream().
     *   From arrays: e.g. Arrays.stream().
     *   From specific values: e.g. Stream.of("a","b","c").
     *   From functions: e.g. Stream.iterate(0, n -> n + 2)
     *   From files: e.g. Files.lines(path)
     *   Empty Stream: e.g. Stream.empty()
     * */

    static void main() {

        // From collections: e.g., collection.stream().

        List<Integer> numbers = Arrays.asList(1, 2, 3);
        Stream<Integer> numbersStream = numbers.stream();

        // From arrays: e.g. Arrays.stream().

        int nums[] = {1, 2, 3};
        IntStream arrayStream = Arrays.stream(nums);

        // From specific values: e.g. Stream.of("a","b","c").

        Stream<String> stringStream = Stream.of("a", "b", "c");

    }

}
