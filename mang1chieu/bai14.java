package mang1chieu;

import java.util.Scanner;

public class bai14 {
    public static int gcd ( int a , int b){
        while ( b != 0) {
            int t = a % b ; a = b ; b = t;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        int res = a[0];
        for (int i = 0; i < n; i++) {
           res = gcd(res, a[i]);
        }
        System.out.println(res);
    }
}
