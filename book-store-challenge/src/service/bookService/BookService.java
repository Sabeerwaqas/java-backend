package service.bookService;

import model.BookModel;

import java.time.LocalDate;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

import static utils.BookList.getBooks;

public class BookService {

    private final List<BookModel> books = getBooks();
    LocalDate specifiedDate = LocalDate.of(2000, 1, 1);
    Predicate<BookModel> isDiscounted = (BookModel book) -> book.price < 30;
    Predicate<BookModel> isPublished = book ->
            book.publishedYear.isBefore(specifiedDate);


    public void getAllBooks() {
        books.forEach(System.out::println);
    }


    public void getDiscountedBooks() {
        System.out.println("-----> Discounted Books <-----");
        Stream<BookModel> booksStream = books.stream();
        List<BookModel> booksIntermediateStream = booksStream.filter(isDiscounted).toList();
        booksIntermediateStream.forEach(System.out::println);
    }

    public void getBooksByPublishedYear() {
        System.out.println("-----> Books Before Published Year 2000");
        Stream<BookModel> booksByPublishedYear = books.stream();
        List<BookModel> filteredBooks = booksByPublishedYear.filter(isPublished).toList();
        filteredBooks.forEach(System.out::println);
    }


}
