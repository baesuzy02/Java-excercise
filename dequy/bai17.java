package dequy;

import java.util.*;

public class bai17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
         dq2(n);
         System.out.println();
         dq1(n);
    }
    public static void dq1 (long n){
        if (n < 10){
           System.out.print(n);
        } else {
            System.out.print(n%10 + " ");
            dq1(n/10);
        }
    }
    public static void dq2 (long n){
        if (n < 10){
            System.out.print(n + " ");
        } else {
            dq2(n/10);
            System.out.print(n % 10 + " ");
        }
    }
}
