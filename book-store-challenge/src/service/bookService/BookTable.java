package service.bookService;

import model.BookModel;

import java.util.List;

public class BookTable {

    public static void print(List<BookModel> books) {

        if (books.isEmpty()) {
            System.out.println("No books found.");
            return;
        }

        System.out.println("--------------------------------------------------------------------------------");
        System.out.printf("| %-3s | %-25s | %-20s | %-8s | %-4s |%n",
                "ID", "Title", "Author", "Price", "Year");
        System.out.println("--------------------------------------------------------------------------------");

        for (BookModel book : books) {
            System.out.printf("| %-3d | %-25s | %-20s | %-8.2f | %-10s |%n",
                    book.getId(),
                    book.getBookName(),
                    book.getBookAuthor(),
                    book.getPrice(),
                    book.getPublishedYear()
            );
        }

        System.out.println("--------------------------------------------------------------------------------");
    }
}
