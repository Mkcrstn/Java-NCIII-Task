package Tasks;

public class Task8{


    public int sumUp (int num1){           //  getting the sum of nums example 4 1+2+3+4
        return num1 * ( num1 + 1) / 2; // ang logic nito ay 4 * (4 * 1) / 2 the total is 10.   1 + 4 = 5   
                                                                                            // 2 + 3 = 5   
    }

  

    public void SumofAllParameters(int... nums){

        int sum = 0;
       
        for (int num:nums){
            int partialSum = sumUp(num);
            System.out.println("Sum up to "+ num + " = " +partialSum);
            sum += partialSum;
        }

        System.out.println("Total of all: " + sum);


    }
    
    public static void main (String [] args){

        Task8 task = new Task8();
        task.SumofAllParameters (4,5,10);

    }
}