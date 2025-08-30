package AptitudeProgram;

public class Pattern27 {
    public static void main(String[] args) {
        int n = 4;
        int num = 1;
        int end = n * (n + 1);
        int[][] arr = new int[n][n * 2];
        int left = 0, right = n * 2 - 1;

        for (int i = 0; i < n; i++) {
            for (int j = left; j < left + (n - i); j++) {
                arr[i][j] = num++;
            }
            for (int j = right - (n - i) + 1; j <= right; j++) {
                arr[i][j] = end--;
            }
            left++;
            right--;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n * 2; j++) {
                if (arr[i][j] != 0) {
                    System.out.print(arr[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
