package streams.intermediate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateDemo {

    static Predicate<BookDemo> hasLessPrice = (book) -> book.price < 20;

    public static void main() {
        List<BookDemo> booksList = Arrays.asList(
                new BookDemo("The Silent Forest", 2015, 12.99, "Fiction"),
                new BookDemo("Journey to Mars", 2020, 18.49, "Science Fiction"),
                new BookDemo("Mastering Java", 2019, 29.99, "Programming"),
                new BookDemo("Hidden Truths", 2017, 14.50, "Mystery"),
                new BookDemo("The Last Kingdom", 2021, 22.75, "Historical"),
                new BookDemo("Healthy Living Guide", 2016, 11.25, "Health"),
                new BookDemo("Mindset Matters", 2018, 16.00, "Self-Help"),
                new BookDemo("Ocean Depths", 2014, 13.40, "Adventure"),
                new BookDemo("Economics 101", 2013, 19.99, "Education"),
                new BookDemo("The Art of Coding", 2022, 34.95, "Technology")
        );

        // Filtering books less than $20

        Stream<BookDemo> lessPricedBooks = booksList.stream().filter(hasLessPrice);
        List<BookDemo> affordableBooks = lessPricedBooks.toList();
        affordableBooks.forEach(System.out::println);

        // Convert book titles to uppercase

        List<String> makeTitlesUppercase = booksList.stream().map(book -> book.title.toUpperCase()).toList();
        System.out.println(makeTitlesUppercase);


    }
}

