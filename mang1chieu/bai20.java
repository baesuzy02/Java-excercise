package mang1chieu;

import java.util.*;

public class bai20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []a = new int[n];
        for (int i = 0 ; i < n; i++){
            a[i] = scanner.nextInt();
        }
        for (int i = 1; i < n-1; i++){
            if (a[i] > a[i+1] && a[i] > a[i-1]){
                System.out.print(a[i] + " ");
            }
        }
    }
}
