package mang1chieu;

import java.util.Scanner;

public class bai7 {
   public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     int n = scanner.nextInt();
     int [] a = new int[n];
     for (int i = 0; i < a.length; i++) {
        a[i] = scanner.nextInt();
     }
     int min = (int) 1e9;
     for (int i = 0; i < n - 1; i++) {
        for (int j = i + 1; j < a.length; j++) {
            if (Math.abs(a[i] - a[j]) <  min){
                min = Math.abs(a[i] - a[j]);
            }
        }
     }
     System.out.println(min);
   }
    
}
