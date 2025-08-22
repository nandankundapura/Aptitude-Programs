package AptitudeProgram;

public class PalindromeNumberCheck {
    public static void main(String[] args) {
        int num = 1331;
        int original = num;
        int reverse = 0;

        while (num > 0) {
            reverse = reverse * 10 + (num % 10);
            num = num / 10;
        }

        if (original == reverse) {
            System.out.println(original + " is a Palindrome");
        } else {
            System.out.println(original + " is NOT a Palindrome");
        }
    }
}
