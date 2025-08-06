package Tasks.Task11;

public class Book {
    private String title;
    private String author;
    private int yearPublished;
    private double price;

    public Book (String title, String author, int yearPublished, double price){
        this.title=title;
        this.author=author;
        this.yearPublished=yearPublished;
        this.price=price;
    }

    public void printDetails(){
       
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year Published: " + yearPublished);
        System.out.println("Price: $"+ price);
    }
}

