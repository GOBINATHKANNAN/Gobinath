public class Book {
    String title;
    String author;
    String isbn;
    double price;
    public Book(String title, String author, String isbn, double price) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
    }
    public void displayDetails(){
        System.out.println("Author : "+author+"\n"+"tittle : "+title+"\n"+"isbn : "+isbn+"\n"+"price : "+price+"\n");
    }
}
//class   EBook extends Book
//{
//    public void displayDetails() {
//
//    }
//}
//class PrintedBook extends Book{
//    public void displayDetails() {
//
//    }
//}