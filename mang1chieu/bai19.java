package mang1chieu;

import java.util.*;

public class bai19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] a = new int[n];
        for (int i = 0 ; i < n; i++){
            a[i] = scanner.nextInt();
        }
        int l = 0,r= n - 1;
        while ( l <= r){
            int tmp = a[l];
            a[l] = a[r];
            a[r] = tmp;
            l++;r--;
        }
          for (int i = 0 ; i < n; i++){
            System.out.print(a[i] + " ");
          }

    }
    
}
