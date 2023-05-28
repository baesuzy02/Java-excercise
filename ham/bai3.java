package ham;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        int L = (int)Math.sqrt(a);
        if (!cp(a)){
            L++;
        }
        int R = (int)Math.sqrt(b);
        for (int i = L ; i <= R; i++){
               System.out.println((long)i*i+ " ");
        }
    }
    public static boolean cp (long n){
        long can = (long) Math.sqrt(n);
        return(long) can*can==n;
    }
}
