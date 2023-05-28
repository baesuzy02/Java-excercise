package mang1chieu;

import java.util.*;

public class bai17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []a = new int[n];
        for (int i = 0 ; i < n;i++){
            a[i] = scanner.nextInt();
        }
        if(check(a, 0, n-1)){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

    }
    public static boolean check (int[]a , int l ,int r){
        if (l >= r){
            return true;
        }else {
               if (a[l] != a[r]){
                return false;
               }else {
                return check(a, l+1, r-1);
               }
        }
    }    
}
