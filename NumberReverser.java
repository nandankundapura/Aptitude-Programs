package AptitudeProgram;

public class NumberReverser {
    public static void main(String[] args) {
        int num = 2468;
        int reverse = 0;

        while (num > 0) {
            reverse = reverse * 10 + (num % 10);
            num = num / 10;
        }

        System.out.println("Reversed number = " + reverse);
    }
}
