package streams.terminalOperations;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TerminalOperationsDemo {
    public static void main(String[] args) {

        // reduce, collect, find and match

        // 1. reduce

        List<Integer> numList = Arrays.asList(10, 20, 30, 40, 50, 55);
        int numListStream = numList.stream().reduce(0, (acc, next) -> acc + next);
        System.out.println("numListStream" + " " + numListStream);

        // 2. collect
        List<Integer> oddNumList = numList.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
        System.out.println("oddNumList" + " " + oddNumList);

        // 3. find and match
        System.out.println("findAny() " + numList.stream().findAny().get());
        System.out.println("findAny() " + numList.stream().findFirst().get());

        boolean has40 = numList.stream().anyMatch(n->n==40);
        System.out.println("has40 " + has40);

    }
}
