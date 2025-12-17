package app;

import service.bookService.BookService;

import java.util.Scanner;

public class Main {
    static void main() {

        Scanner scanner = new Scanner(System.in);
        int selectedNum = scanner.nextInt();

        System.out.println(selectedNum);

        BookService bookService = new BookService();
        bookService.getAllBooks();
        bookService.getDiscountedBooks();
        bookService.getBooksByPublishedYear();
        bookService.getUpcomingBooks();
        bookService.getBooksSortedByPrice();
        bookService.getRareBooks();
    }

}
