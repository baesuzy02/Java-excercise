package mang1chieu;

import java.util.Scanner;

public class bai2 {
   public static boolean nt ( int n ) {
    if ( n < 2 ) {
        return false;
    }
    for (int i = 2; i <= Math.sqrt(n); i++) {
        if ( n %  i == 0) {
            return false;
        }
    }
    return true;
   }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        } 
         int cnt = 0 ; int sum = 0;
         for (int i = 0; i < a.length; i++) {
            if (nt(a[i])) {
                cnt++;
                sum+=a[i];
            }
         }
         System.out.printf("%.3f", (double)sum/cnt);
    }
}
