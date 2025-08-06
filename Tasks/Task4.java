package Tasks;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        System.out.print("Enter a String: ");
        String input = in.nextLine();

        StringBuilder sb = new StringBuilder(input);
        sb.reverse();
      
    // if else condition
      /*   if (sb.toString().equals(input))
            System.out.println("The input string " + input +" is a palindrome.");
        
        else System.out.println("The input string " + input +" is not a palindrome.");
        
        */
        

    // ternary condition  
    String message = sb.toString().equals(input) ? "The input string " + input +" is a palindrome." : "The input string " + input +" is not a palindrome.";
        
    System.out.println(message);
         

        in.close();
    }
}
