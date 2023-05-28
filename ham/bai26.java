package ham;

import java.util.*;
public class bai26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        System.out.println(check(n));
    }
    public static long check (long n){
        long f0 = 0 , f1 = 1 , fn = 1;
        while ( fn < n){
            fn = f0 + f1;
            f0 = f1;
            f1 = fn;
        }
        return fn;
    }
}
