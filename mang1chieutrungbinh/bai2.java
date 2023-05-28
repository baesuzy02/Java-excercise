package mang1chieutrungbinh;

import java.util.*;

public class bai2 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int n = scanner.nextInt();
         int []a = new int[n];
         for (int i = 0 ; i < n ; i++){
            a[i] = scanner.nextInt();
         }
         for (int i = 1 ; i  < n ; i++){
            if (a[i] <= a[i+1]){
                System.out.println("YES");
                return;
            }
         }
        System.out.println("NO");
    }
    
}
