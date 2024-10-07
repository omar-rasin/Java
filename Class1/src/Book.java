/*Create a class Book with fields title, author, and price. Write a constructor to initialize 
these fields, and create a method displayDetails() to print the book’s details. Create two objects of the 
class Book and print their details. */

    
    public class Book {

        String title;
        String author;
        double price;

        public void displayDetails() {

            System.out.println("Title: " + title + "\nAuthor: " + author + "\nPrice: $" + price + "\n");
        }
    }

