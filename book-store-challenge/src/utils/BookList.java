package utils;

import model.BookModel;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class BookList {

    public static List<BookModel> getBooks() {

        return Arrays.asList(
                new BookModel(1, "The Silent Forest", "A. Greenwood", 12.99, LocalDate.of(2015, 5, 10)),
                new BookModel(2, "Journey to Mars", "L. Thompson", 18.49, LocalDate.of(2020, 7, 21)),
                new BookModel(3, "Mastering Java", "R. Martin", 29.99, LocalDate.of(2019, 3, 15)),
                new BookModel(4, "Hidden Truths", "S. Collins", 14.50, LocalDate.of(2017, 10, 5)),
                new BookModel(5, "The Last Kingdom", "B. Cornwell", 22.75, LocalDate.of(2021, 4, 18)),
                new BookModel(6, "Healthy Living Guide", "M. Adams", 11.25, LocalDate.of(2016, 2, 12)),
                new BookModel(7, "Mindset Matters", "C. Dweck", 16.00, LocalDate.of(2018, 8, 9)),
                new BookModel(8, "Ocean Depths", "J. Verne", 13.40, LocalDate.of(2014, 6, 30)),
                new BookModel(9, "Economics 101", "P. Samuelson", 19.99, LocalDate.of(2013, 9, 14)),
                new BookModel(10, "The Art of Coding", "N. Developer", 34.95, LocalDate.of(2022, 11, 1)),

                new BookModel(11, "Secrets of the Mind", "D. Goleman", 17.80, LocalDate.of(2016, 7, 22)),
                new BookModel(12, "Future of AI", "A. Turing", 39.99, LocalDate.of(2021, 12, 5)),
                new BookModel(13, "World History Simplified", "H. Wells", 24.60, LocalDate.of(2012, 4, 19)),
                new BookModel(14, "Data Structures Explained", "M. Weiss", 28.90, LocalDate.of(2018, 5, 25)),
                new BookModel(15, "The Lost City", "E. Carter", 15.75, LocalDate.of(2014, 11, 2)),
                new BookModel(16, "Financial Freedom", "R. Kiyosaki", 21.40, LocalDate.of(2017, 2, 8)),
                new BookModel(17, "Clean Architecture", "R. Martin", 32.50, LocalDate.of(2020, 10, 11)),
                new BookModel(18, "Physics for Everyone", "S. Hawking", 26.30, LocalDate.of(2015, 7, 3)),
                new BookModel(19, "Creative Writing Basics", "J. Rowling", 14.20, LocalDate.of(2013, 12, 28)),
                new BookModel(20, "Modern Web Development", "A. Cooper", 31.99, LocalDate.of(2022, 3, 17)),
                new BookModel(21, "Random book 1", "J. Rowling", 14.20, LocalDate.of(1999, 1, 1)),
                new BookModel(22, "Random book 2", "A. Cooper", 31.99, LocalDate.of(1999, 1, 1)),
                new BookModel(23, "Quantum Computing (Coming Soon)", "A. Einstein", 0.0, LocalDate.of(2025, 6, 1)),
                new BookModel(24, "The Mars Colony (Coming Soon)", "L. Thompson", 0.0, LocalDate.of(2025, 9, 15)),
                new BookModel(25, "AI Revolution (Coming Soon)" , "A. Turing", 0.0, LocalDate.of(2026, 1, 10)),
                new BookModel(26, "Secrets of the Universe (Coming Soon)", "S. Hawking", 0.0, LocalDate.of(2026, 5, 5))

        );
    }
}
