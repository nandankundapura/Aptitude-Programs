package AptitudeProgram;

public class DigitSumProgram {
    public static void main(String[] args) {
        int num = 9876;
        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num = num / 10;
        }

        System.out.println("Sum of digits = " + sum);
    }
}
