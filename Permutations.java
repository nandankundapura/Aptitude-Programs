package AptitudeProgram;

public class Permutations {
    static void permute(char[] str, int l, int r) {
        if (l == r) {
            System.out.println(new String(str));
            return;
        }

        for (int i = l; i <= r; i++) {
            // swap
            char temp = str[l];
            str[l] = str[i];
            str[i] = temp;

            permute(str, l + 1, r);

            temp = str[l];
            str[l] = str[i];
            str[i] = temp;
        }
    }

    public static void main(String[] args) {
        String input = "ABC";
        char[] arr = input.toCharArray();

        System.out.println("All permutations of " + input + " are:");
        permute(arr, 0, arr.length - 1);
    }
}
