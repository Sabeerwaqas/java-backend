package collections;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    static void main() {
        List<String> users = new ArrayList<>();
        users.add("Alex");
        users.add("Bob");
        users.add("Charlie");

        System.out.println("All Users");

        for(Object user:users){
            System.out.println(user);
        }
    }
}
