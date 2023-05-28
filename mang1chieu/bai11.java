package mang1chieu;

import java.util.Scanner;

public class bai11 {
    public static boolean find (long[] fibo, long a){
        for (int i = 1; i <= 93; i++) {
           if (fibo[i] == a){
            return true;
           } 
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long [] a = new long[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextLong();
        }
        long [] fibo = new long[100];
        fibo[0] = 0; fibo[1] = 1;
        for (int i = 2; i <= 93; i++) {
            fibo[i] = fibo[i-1] + fibo[i-2];
        }
        boolean ok = false;
        for (int i = 0; i < n; i++) {
            if (find(fibo, a[i])){
                System.out.print(a[i] + " ");
                ok = true;
            }
        }
        if ( !ok ) {
            System.out.println("NONE");
        }
    }
}
