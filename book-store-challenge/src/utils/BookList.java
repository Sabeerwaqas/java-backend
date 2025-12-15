package utils;

import model.BookModel;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class BookList {

    public static List<BookModel> getBooks() {

        return Arrays.asList(
                new BookModel(1, "The Silent Forest", "A. Greenwood", 12.99, new Date(115, 4, 10)),
                new BookModel(2, "Journey to Mars", "L. Thompson", 18.49, new Date(120, 6, 21)),
                new BookModel(3, "Mastering Java", "R. Martin", 29.99, new Date(119, 2, 15)),
                new BookModel(4, "Hidden Truths", "S. Collins", 14.50, new Date(117, 9, 5)),
                new BookModel(5, "The Last Kingdom", "B. Cornwell", 22.75, new Date(121, 3, 18)),
                new BookModel(6, "Healthy Living Guide", "M. Adams", 11.25, new Date(116, 1, 12)),
                new BookModel(7, "Mindset Matters", "C. Dweck", 16.00, new Date(118, 7, 9)),
                new BookModel(8, "Ocean Depths", "J. Verne", 13.40, new Date(114, 5, 30)),
                new BookModel(9, "Economics 101", "P. Samuelson", 19.99, new Date(113, 8, 14)),
                new BookModel(10, "The Art of Coding", "N. Developer", 34.95, new Date(122, 10, 1)),

                new BookModel(11, "Secrets of the Mind", "D. Goleman", 17.80, new Date(116, 6, 22)),
                new BookModel(12, "Future of AI", "A. Turing", 39.99, new Date(121, 11, 5)),
                new BookModel(13, "World History Simplified", "H. Wells", 24.60, new Date(112, 3, 19)),
                new BookModel(14, "Data Structures Explained", "M. Weiss", 28.90, new Date(118, 4, 25)),
                new BookModel(15, "The Lost City", "E. Carter", 15.75, new Date(114, 10, 2)),
                new BookModel(16, "Financial Freedom", "R. Kiyosaki", 21.40, new Date(117, 1, 8)),
                new BookModel(17, "Clean Architecture", "R. Martin", 32.50, new Date(120, 9, 11)),
                new BookModel(18, "Physics for Everyone", "S. Hawking", 26.30, new Date(115, 6, 3)),
                new BookModel(19, "Creative Writing Basics", "J. Rowling", 14.20, new Date(113, 11, 28)),
                new BookModel(20, "Modern Web Development", "A. Cooper", 31.99, new Date(122, 2, 17))
        );
    }
}
