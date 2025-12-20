package collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    static void main() {
        Map<Integer,String> userMap = new HashMap<>();
        userMap.put(1, "Alice");
        userMap.put(2, "Bob");

        System.out.println("User 2: " + userMap.get(2));
    }
}
