package app;

import service.BookService;

public class Main {
    static void main() {

   BookService bookService = new BookService();
   bookService.getAllBooks();

   bookService.getDiscountedBooks();

    }

}
