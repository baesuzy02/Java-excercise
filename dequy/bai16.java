package dequy;

import java.util.*;

public class bai16 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       long n = scanner.nextLong();
       System.out.print(max(n) + " " + min(n));
    }
    public static long min (long n){
        if (n < 10){
            return n;
        } else {
            return Math.min(n%10, min(n/10));
        }
    }
    public static long max (long n){
        if (n < 10){
            return n;
        } else {
            return Math.max(n%10, max(n/10));
        }
    }
}
