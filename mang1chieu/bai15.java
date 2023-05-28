package mang1chieu;

import java.util.Scanner;

public class bai15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int max1 = 0 ; int max2 = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] >= max1) {
                max2 = max1;
                max1 = a[i];
            } else if ( a[i] > max2) {
                max2 = a[i];
            }
        }
        System.out.println(max1 + " " + max2);
    }
}
