package Tasks;

import java.util.*;

public class Task7 {

    public static int add(int a, int b){
        return a + b;
    }

    public static int subtract(int a, int b){
        return a - b;
    }

    public static int multiply(int a, int b){
        return a * b;
    }

    public static String division(int a, int b){
        return (b == 0)
            ? "Cannot divide by zero!"
            : "Division: " + ((double) a / b);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int num1 = input.nextInt();

        System.out.print("Enter 2nd number: ");
        int num2 = input.nextInt();

        System.out.println("Addition: " + add(num1, num2));
        System.out.println("Subtraction: " + subtract(num1, num2));
        System.out.println("Multiplication: " + multiply(num1, num2));
        System.out.println(division(num1, num2));  

        input.close();
    }
}
