package collections;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    static void main() {
        Set<String> roles = new HashSet<>();
        roles.add("ADMIN");
        roles.add("MANAGER");
        roles.add("USER");

        for(String role:roles){
         System.out.println("Roles: " + role);
        }
    }
}
