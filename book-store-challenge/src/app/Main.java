package app;

import service.bookService.BookService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BookService bookService = new BookService();

        int option;

        do {
            System.out.println("\n===== Book Management Menu =====");
            System.out.println("1. View all books");
            System.out.println("2. View discounted books");
            System.out.println("3. View books by published year");
            System.out.println("4. View upcoming books");
            System.out.println("5. View books sorted by price");
            System.out.println("6. View rare books");
            System.out.println("0. Exit");
            System.out.print("Select an option: ");

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    bookService.getAllBooks();
                    break;

                case 2:
                    bookService.getDiscountedBooks();
                    break;

                case 3:
                    bookService.getBooksByPublishedYear();
                    break;

                case 4:
                    bookService.getUpcomingBooks();
                    break;

                case 5:
                    bookService.getBooksSortedByPrice();
                    break;

                case 6:
                    bookService.getRareBooks();
                    break;

                case 0:
                    System.out.println("Exiting application. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }

        } while (option != 0);

        scanner.close();
    }
}
