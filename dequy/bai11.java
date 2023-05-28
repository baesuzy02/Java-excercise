package dequy;

import java.util.*;

public class bai11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        deQuy(n);
    }
    public static void deQuy (long n ){
               if (n < 2){
                System.out.print(n +"");
               } else {
                deQuy( n / 2);
                System.out.print(n % 2 + "");
               }
    }
}
