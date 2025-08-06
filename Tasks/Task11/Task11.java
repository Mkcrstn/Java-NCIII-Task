package Tasks.Task11;



public class Task11{
    public static void main(String[] args) {
        Book b1 = new Book("Java Programming", "John Smith", 2021, 39.99);
        System.out.println("Book 1:");
        b1.printDetails();

        Book b2 = new Book("Python Basics", "Jane Doe", 2020, 29.99);
        System.out.println("Book 2:");
        b2.printDetails();

        Book b3 = new Book("C++ Essentials", "Michael Johnson", 2019, 49.99);
        System.out.println("Book 3:");
        b3.printDetails();
    }
}