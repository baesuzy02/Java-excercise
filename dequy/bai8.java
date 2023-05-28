package dequy;

import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         long a = scanner.nextLong();
         long b = scanner.nextLong();
         System.out.print(gcd(a, b) + " " + lcm(a, b));
    }
    public static long gcd (long a , long b){
        if (b == 0){
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
    public static long lcm (long a,long b){
            return a / gcd(a, b) * b;
    }
    
}
