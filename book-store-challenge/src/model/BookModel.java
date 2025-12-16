package model;

import java.time.LocalDate;
import java.util.Date;

public class BookModel {

    public Number id;
    public String bookName;
    public String bookAuthor;
    public Double price;
    public LocalDate publishedYear;

    public BookModel(Number id, String bookName, String bookAuthor, Double price, LocalDate publishedYear) {
        this.id = id;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.price = price;
        this.publishedYear = publishedYear;
    }

    @Override
    public String toString() {
        return "BookModel{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", price=" + price +
                ", publishedYear=" + publishedYear +
                '}';
    }
}
