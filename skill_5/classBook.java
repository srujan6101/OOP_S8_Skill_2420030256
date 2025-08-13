package skill_5;
public class classBook {
    // Private attributes
    private String title;
    private String author;
    private double price;

    // Setter and Getter methods

    /**
     * Sets the title of the book.
     * @param title The book's title.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Gets the title of the book.
     * @return The book's title.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the author of the book.
     * @param author The book's author.
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Gets the author of the book.
     * @return The book's author.
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the price of the book.
     * @param price The book's price.
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Gets the price of the book.
     * @return The book's price.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Returns a string representation of the Book object.
     */
    @Override
    public String toString() {
        return String.format("Book [Title: %s, Author: %s, Price: $%.2f]", title, author, price);
        }

    /**
     * Main method to test the Book class.
     */
    public static void main(String[] args) {
        // Create a Book object
        classBook myBook = new classBook();

        // Set values using setters
        myBook.setTitle("To Kill a Mockingbird");
        myBook.setAuthor("Harper Lee");
        myBook.setPrice(14.99);

        // Print the Book object (toString() will be called automatically)
        System.out.println(myBook);
    }
}
