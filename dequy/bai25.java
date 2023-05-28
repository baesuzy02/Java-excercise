package dequy;

import java.util.Scanner;

public class bai25 {
    public static int binarySearch(int[] A, int X, int left, int right) {
        if (left > right) {
            return 0;
        }
        int mid = left + (right - left) / 2;
        if (A[mid] == X) {
            return 1;
        } else if (A[mid] > X) {
            return binarySearch(A, X, mid + 1, right);
        } else {
            return binarySearch(A, X, left, mid - 1);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }
        int X = scanner.nextInt();
        int result = binarySearch(A, X, 0, n - 1);
        System.out.println(result);
    }
}

