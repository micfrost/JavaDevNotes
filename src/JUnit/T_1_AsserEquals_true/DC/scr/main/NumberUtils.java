package JUnit.T_1_AsserEquals_true.DC.scr.main;

public class NumberUtils {

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int calculateFactorial(int n) {
        if(n<0){
            System.out.println("The number should be non-negative.");
            return -1;
        }


        int factorial = 1;
        for (int i = 1; i <= n; i++) {

            if (Integer.MAX_VALUE/i < factorial) {
                System.out.println("The result of factorial too big.");

                return -2; // Return -2 to indicate that the result is too large
            }
            factorial =  factorial*i;



        }
        return factorial;
    }
}
