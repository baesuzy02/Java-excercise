package mang1chieu;

import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n = scanner.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
       }
       for (int i = 0; i < n; i++) {
           boolean flag = true;
           for (int j = 0; j < i; j++) {
            if ( a[i] == a[j] ) {
                flag = false;
            }
           }
           if (flag) {
            System.out.print(a[i]+ " ");
           }
       }
       
    }
}
