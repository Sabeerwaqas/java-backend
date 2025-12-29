package errorHandling;

import java.util.List;

public class ErrorHandlingDemo {
    public static void main(String[] args){
        List<String> books = List.of("Java","Python","C++");
        books.forEach(b -> {
            try{
                if(b.equals("Python")){
                    throw new RuntimeException("Invalid Book");
                }
                System.out.println(b);
            }catch (Exception e){
                e.printStackTrace();
            }
        });
    }
}
