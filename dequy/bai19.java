package dequy;

import java.util.*;

public class bai19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        if (check(n)){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
    }
    public static boolean check (long n){
        if (n==0){
            return true;
        } else {
            if (n % 10 % 2 == 1){
                return false;
            } else {
                return check(n/10);
            }
        }
    }
    
}
