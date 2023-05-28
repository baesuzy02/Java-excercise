package dequy;

import java.util.Scanner;

public class bai10 {
    // cach 1:
    // public static void main(String[] args) {
    //         Scanner scanner = new Scanner(System.in);
    //         int n = scanner.nextInt();
    //         double sum = 0;
    //         for ( int i = 1 ; i <= n ; i++){
    //             sum+= 1.0/i;
    //         }
    //         System.out.printf("%.3f",sum);
    // }
    //cach 2:

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.printf("%.3f",S(n));
    }
    public static double S ( int n) {
        if ( n == 1){
            return 1;
        }else {
            return 1.0/n + S(n-1);
        }
    }
    
}
