package dequy;

import java.util.*;

public class bai18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n= scanner.nextLong();
        System.out.print(chan(n) + "\n" + le(n));
    }
    public static long chan (long n){
        if (n < 10){
            if (n % 2 == 0){
                return n;
            } else {
                return 0;
            }
        } else {
            if (n % 10 % 2 == 0){
                return n % 10 + chan(n/10);
            }else {
                return chan(n/10);
            }
        }
    }
    public static long le (long n){
        if (n < 10){
            if (n % 2 == 0){
                return 0;
            } else {
                return n;
            }
        } else {
            if (n % 10 % 2 == 1){
                return n % 10 + le(n/10);
            } else {
                return le(n/10);
            }
        }
    }
    
}
