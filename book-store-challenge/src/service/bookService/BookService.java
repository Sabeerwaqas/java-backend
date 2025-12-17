package service.bookService;

import model.BookModel;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

import static utils.BookList.getBooks;

public class BookService {

    private final List<BookModel> books = getBooks();
    LocalDate specifiedDate = LocalDate.of(2000, 1, 1);
    Predicate<BookModel> isDiscounted = (BookModel book) -> book.getPrice() < 30;
    Predicate<BookModel> isPublished = book ->
            book.publishedYear.isBefore(specifiedDate);
    Predicate<BookModel> isUpcoming = (BookModel book) -> book.bookName.startsWith("Coming");
    Predicate<BookModel> isRare = (BookModel book) -> book.bookName.length() >= 20;

    public void getAllBooks() {
        BookTable.print(books);
    }

    public void getDiscountedBooks() {
        System.out.println("-----> Discounted Books <-----");
        Stream<BookModel> booksStream = books.stream();
        List<BookModel> booksIntermediateStream = booksStream.filter(isDiscounted).toList();
        BookTable.print(booksIntermediateStream);
    }

    public void getBooksByPublishedYear() {
        System.out.println("-----> Books Before Published Year 2000 <-----");
        Stream<BookModel> booksByPublishedYear = books.stream();
        List<BookModel> filteredBooks = booksByPublishedYear.filter(isPublished).toList();
        BookTable.print(filteredBooks);
    }

    public void getUpcomingBooks() {
        System.out.println("-----> Upcoming Books <-----");
        Stream<BookModel> booksStream = books.stream();
        List<BookModel> upcomingBooks = booksStream.filter(isUpcoming).toList();
        BookTable.print(upcomingBooks);
    }

    public void getBooksSortedByPrice() {
        System.out.println("-----> Sorted Books By Price <-----");
        Stream<BookModel> booksStream = books.stream();
        List<BookModel> sortedBooks = booksStream.sorted(Comparator.comparingDouble(BookModel::getPrice)).toList();
        BookTable.print(sortedBooks);
    }

    public void getRareBooks() {
        System.out.println("-----> Rare Books <-----");
        Stream<BookModel> booksStream = books.stream();
        List<BookModel> rareBooks = booksStream.filter(isRare).toList();
        BookTable.print(rareBooks);
    }

}
