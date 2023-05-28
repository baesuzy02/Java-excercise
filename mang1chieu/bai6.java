package mang1chieu;

import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        int cnt = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if ( a[i] + a[j] == k ) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
