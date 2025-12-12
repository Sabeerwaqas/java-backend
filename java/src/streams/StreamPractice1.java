package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPractice1 {

    static Predicate<Integer> condition = (item) -> item % 2 == 0;

    static void main() {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);

        System.out.println("Custom logic to collect even numbers:");
        List<Integer> evenNumbers = new ArrayList<>();
        for(int number:numbers){
            if((number % 2) == 0) evenNumbers.add(number);
        }
        System.out.println(evenNumbers);


        System.out.println("Stream logic to collect even numbers:");

        Stream<Integer> soureEvenStream = numbers.stream();
        Stream<Integer> intermediateEvenStream = soureEvenStream.filter(condition);
        List<Integer> terminalEvenStream = intermediateEvenStream.toList();

        System.out.println(terminalEvenStream);

        System.out.println("Concise stream logic to collect even numbers:");

        List<Integer> evenStream = numbers.stream().filter(condition).toList();

        System.out.println(evenStream);

    }
}
