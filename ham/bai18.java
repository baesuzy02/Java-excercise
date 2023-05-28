package ham;

import java.util.*;

public class bai18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        System.out.println(gcd(a, b) + " " + lcm(a, b));
    }
    public static long gcd (long a, long b){
        while ( b != 0){
            long r = a%b;
            a =b;
            b = r;
        }
        return a;
    }
    public static long lcm (long a , long b){
        return a / gcd(a, b) * b;
    }
    
}
