package mang1chieu;

import java.util.Scanner;

public class bai13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        int mod = (int) 1e9 + 7;
        long sum = 0;
        long tich = 1;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            sum %= mod;

            tich *= a[i];
            tich %= mod;
        }
        System.out.println(sum + "\n" + tich);
    }
}
