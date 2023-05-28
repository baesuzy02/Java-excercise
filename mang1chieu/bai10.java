package mang1chieu;

import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 1; i < n - 1; i++) {
            int left = 0 ; int right = 0;
            for (int j = 0; j < i; j++) {
                left += a[j];
            } 
            for (int j = i + 1; j < n; j++) {
                right+=a[j];
            }
            if ( nt(left) && nt(right)) {
                System.out.print(i + " ");
            }
        }

    }
    public static boolean nt ( int n ) {
        if ( n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if ( n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
}
