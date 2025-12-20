package methodReference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MethodReference {
    public static void main(String[] args){
        List<String> names = Arrays.asList("john", "doe", "charlie");

        for(String name:names){
            System.out.println(name);
        }

        names.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        names.forEach((String s) -> System.out.println(s));

        names.forEach(System.out::println);


    }
}
