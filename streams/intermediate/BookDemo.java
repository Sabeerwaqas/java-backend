package streams.intermediate;

public class BookDemo {

    String title;
    Integer publicationDate;
    Double price;
    String category;

    public BookDemo(String title, int publicationDate, double price, String category) {
        this.title = title;
        this.publicationDate = publicationDate;
        this.price = price;
        this.category = category;
    }

    @Override
    public String toString() {
        return "BookDemo { " +
                "title='" + title + '\'' +
                ", year=" + publicationDate +
                ", price=" + price +
                ", category='" + category + '\'' +
                '}';
    }


}
