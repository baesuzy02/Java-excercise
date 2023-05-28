package dequy;

import java.util.*;

public class bai12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
         deQuy(n);
    }
    public static void deQuy (long n){
        if (n == 0){
            return;
        } else {
            deQuy(n / 16);
            long r = n % 16;
            if (r <= 9){
                System.out.print(r);
            } else {
                System.out.print((char) + (r + 55));
            }
        }
    }
}
