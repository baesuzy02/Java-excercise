package dequy;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(S(n));
    }
    public static long S (long n) {
        if (n == 0) {
            return 0;
        } else {
            return n*n*n + S(n-1);
        }
    }
    
}
