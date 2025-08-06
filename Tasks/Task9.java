package Tasks;

import  static java.lang.Math.*;

public class Task9{

    public static int add(int a, int b){
        
        return addExact(a, b);

    }

    public static int subtract(int a, int b){
        
      return subtractExact(a, b);
    }

    public static int multiply(int a, int b){
        
        return multiplyExact(a, b);
    }

    public static int divide(int a, int b){
       return divideExact(a, b);
    }


    public static void main(String[] args) {
        System.out.println(addExact(1, 6));
        System.out.println(subtract(10, 2));
        System.out.println(multiply(100,1));
        System.out.println(divide(2000, 200));
    }





}