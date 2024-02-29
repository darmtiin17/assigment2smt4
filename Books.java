public class Books {
    private String author;
    private String title;
    private double price;
    private int publisherNumber;

    // Constructor
    public Books(String author, String title, double price, int publisherNumber) {
        this.author = author;
        this.title = title;
        this.price = price;
        this.publisherNumber = publisherNumber;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }
}
