package service;

import model.BookModel;
import utils.BookList;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

import static utils.BookList.getBooks;

public class BookService {

  private final List<BookModel> books = getBooks();

  Predicate<BookModel> isDiscounted = (BookModel book) -> book.price < 30;

  public void getAllBooks(){
      books.forEach(System.out::println);
  }

  public void getDiscountedBooks(){
      System.out.println("-----> Discounted Books <-----");
      Stream<BookModel> booksStream = books.stream();
      List<BookModel> booksIntermediateStream = booksStream.filter(isDiscounted).toList();
      booksIntermediateStream.forEach(System.out::println);
  }



}
