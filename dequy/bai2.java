package dequy;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(S(n));
    }
    public static int S ( int n ) {
        if ( n== 0) {
            return 0;
        }else {
            return n*n + S( n - 1);
        }
    }
    
}
