package AptitudeProgram;

public class ArmstrongCheck {
    public static void main(String[] args) {
        int num = 153;
        int original = num;
        int temp = num;
        int digits = 0;
        while (temp > 0) {
            digits++;
            temp /= 10;
        }
        int result = 0;
        temp = num;
        while (temp > 0) {
            int digit = temp % 10;

            int power = 1;
            for (int i = 0; i < digits; i++) {
                power *= digit;
            }

            result += power;
            temp /= 10;
        }

        if (result == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is NOT an Armstrong number.");
        }
    }

}
