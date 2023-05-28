package mang1chieutrungbinh;

import java.util.*;

public class bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int []a = new int[n];
        int []b = new int[m];
        for (int i = 0 ; i < n; i++){
            a[i] = scanner.nextInt();
        }
        for (int i = 0 ; i < m ; i++){
            b[i] = scanner.nextInt();
        }
        int i = 0 , j = 0;
        while ( i < n && j < m){
            if (a[i] <= b[j]){
                System.out.print(a[i] + " ");
                i++;
            }else {
                System.out.print(b[j] + " ");
                j++;
            }
        }
        while ( i < n){
            System.out.print(a[i] + " ");
            i++;
        }
        while ( j < m){
            System.out.print(b[j] + " ");
            j++;
        }
    }
}
