package app;

import service.bookService.BookService;

public class Main {
    static void main() {

   BookService bookService = new BookService();
   bookService.getAllBooks();

   bookService.getDiscountedBooks();
   bookService.getBooksByPublishedYear();
   bookService.getUpcomingBooks();
   bookService.getBooksSortedByPrice();

    }

}
