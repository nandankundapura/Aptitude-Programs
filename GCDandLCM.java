package AptitudeProgram;

public class GCDandLCM {
    public static void main(String[] args) {
        int a = 12, b = 18;
        int gcd = 1;

        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }

        int lcm = (a * b) / gcd;

        System.out.println("GCD of " + a + " and " + b + " = " + gcd);
        System.out.println("LCM of " + a + " and " + b + " = " + lcm);
    }
}
