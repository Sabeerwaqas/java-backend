import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[]args){

        List<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(2);

        for(int i = 0; i < arr.size(); i++){
            System.out.println(arr.get(i));
        }

        Map<String, Integer> marks = new HashMap<>();

        marks.put("Rohan",100);
        marks.put("Ali",98);

        for(Map.Entry<String, Integer> entry:marks.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

    } 
}