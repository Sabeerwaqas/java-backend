package streams.intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
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
        System.out.println("=== Books priced less than $20 ===");
        Stream<BookDemo> lessPricedBooks = booksList.stream().filter(hasLessPrice);
        List<BookDemo> affordableBooks = lessPricedBooks.toList();
        affordableBooks.forEach(System.out::println);

        // Convert book titles to uppercase
        System.out.println("\n=== Book titles in UPPERCASE ===");
        List<String> uppercaseTitles = booksList.stream().map(book -> book.title.toUpperCase()).toList();
        uppercaseTitles.forEach(System.out::println);

        // Books by publicationDate
        System.out.println("\n=== Books published in 2020 or later ===");
        List<BookDemo> dateWiseBooks = booksList.stream().filter(book -> book.publicationDate >= 2020).toList();
        dateWiseBooks.forEach(System.out::println);

        // Books by sorted order
        System.out.println("\n=== Books sorted by publication year ===");
        Stream<BookDemo> sortedBooks = booksList.stream().sorted(Comparator.comparing(bookDemo -> bookDemo.publicationDate));
        sortedBooks.forEach(System.out::println);

    }
}

