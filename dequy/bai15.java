package dequy;

import java.util.*;

public class bai15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        System.out.println(S(n));
    }
    public static long S (long n){
        if (n < 10){
            return n;
        } else {
            return S(n/10);
        }
    }
}
