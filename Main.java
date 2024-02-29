public class Main {
    public static void main(String[] args) {
        // Example usage of Square class
        Square square = new Square(5.0, 5.0);
        System.out.println("Luas: " + square.getLuas());
        System.out.println("Perimeter: " + square.getPerimeter());

        // Example usage of Books class
        Books book1 = new Books("Author1", "Title1", 25.99, 12345);
        Books book2 = new Books("Author2", "Title2", 19.99, 67890);

        // Calculate the total price for all books
        double totalPrice = book1.getPrice() + book2.getPrice();
        System.out.println("Total Price for all books: $" + totalPrice);
    }
}
