/*Create a class Book with the attributes title and author.
Write a constructor that takes these two values as parameters.
Write a method to print the details of the book.

 */
class Book {
    
    String title;

    String author;

    Book(String title, String author) {

        this.title = title;
        this.author = author;

    }

    void displayinfo() {

        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}
