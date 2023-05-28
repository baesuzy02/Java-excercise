package dequy;

import java.util.*;

public class bai13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        System.out.println(deQuy(n));
    }
    public static long deQuy (long n){
        if (n < 10){
            return n;
        } else {
            return n % 10 + deQuy(n / 10);
        }
    }
}
