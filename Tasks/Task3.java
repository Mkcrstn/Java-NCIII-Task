package Tasks;

public class Task3 {
    public static void main(String[] args) {
        String b = "Wow";
        String a = b;
        String c = "Wow!";
        String d = c;

        Boolean b1 = a==b;
        Boolean b2 = d.equals(b + "!");
        Boolean b3 = !c.equals(a);

        if (b1 && b2 && b3 ){
            System.out.println("Success!");
        }
    }   
}
