package Tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task5 {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> num = new ArrayList<>();

        for (int i = 1; i <= 3; i ++){
            System.out.println("Enter number" + i + ": ");
            num.add(in.nextInt());
        }
        Collections.sort(num);

        System.out.println(
            (num.get(0).equals(num.get(1)) && num.get(1).equals(num.get(2)))
            ? "All numbers are equal" : "The Largest number is " + num.get(2)
        );

    }
}
