
public class BookMain {
    
    public static void main(String[] args) {
        
        Book b1 = new Book();
        Book b2 = new Book();

        b1.title = "Harry Potter";
        b1.author = "JK Rowling";
        b1.price = 12.99;

        
        b2.title = "Percy Jackson";
        b2.author = "Rick Riordan";
        b2.price = 8.25;

        b1.displayDetails();
        b2.displayDetails();
    }
}
