package ham;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        int L = (int)Math.sqrt(a);
        if(!cp(a)){
            L++;
        }
        int R = (int)Math.sqrt(b);
        System.out.println(R - L + 1);
    }
    public static boolean cp (long n){
               long can = (long)Math.sqrt(n);
              return can * can == n;
    }
    
}
