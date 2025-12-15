package model;

import java.util.Date;

public class BookModel {

    Number id;
    String bookName;
    String bookAuthor;
    Double price;
    Date publishedYear;

    public BookModel(Number id, String bookName, String bookAuthor, Double price, Date publishedYear){
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
