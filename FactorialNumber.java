package AptitudeProgram;

public class FactorialNumber {
    static long factorialRec(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * factorialRec(n - 1);
    }

    public static void main(String[] args) {
        int num = 5;
        long factLoop = 1;
        for (int i = 1; i <= num; i++) {
            factLoop *= i;
        }
        long factRec = factorialRec(num);

        System.out.println("Factorial of " + num + " using loop = " + factLoop);
        System.out.println("Factorial of " + num + " using recursion = " + factRec);
    }

}
