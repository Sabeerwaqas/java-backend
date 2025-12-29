package errorHandling;

import java.util.Optional;

public class NPEDemo {
    public static void main(String[] args){
        String name = null;
        if(name == null){
            System.out.println("No name value");
        }else{
            System.out.println(name.length());
        }

        Optional<String> optionalString = Optional.of("Java");
        System.out.println(optionalString);

        Optional<String> emtpyOptional = Optional.empty();
        System.out.println(emtpyOptional);

        Optional<String> nullableOptional = Optional.ofNullable(null);
        System.out.println(nullableOptional);

        // Checking values

        System.out.println(optionalString.isPresent());
        System.out.println(emtpyOptional.isEmpty());

    }
}
