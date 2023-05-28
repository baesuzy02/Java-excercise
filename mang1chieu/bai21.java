package mang1chieu;

import java.util.*;

public class bai21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int k = scanner.nextInt();
        int[]a = new int[n+1];
        for (int i = 0 ; i < n; i++){
            a[i] = scanner.nextInt();
        }k--;
        for (int i = n ; i > k ;i--){
            a[i] = a[i-1];
        }
        a[k] = x;
        n++;
        for (int i = 0 ; i < n; i++){
            System.out.print(a[i] + " ");
        }

    }
    
}
