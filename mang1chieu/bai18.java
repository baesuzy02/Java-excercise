package mang1chieu;

import java.util.*;

public class bai18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []a = new int[n];
        for (int i = 0 ; i < n; i++){
            a[i] = scanner.nextInt();
        }
        for (int i = 0 ; i < n ; i++){
            if (i==0){
                if ((long) a[0] * a[1] < 0){
                    System.out.print(a[i] + " ");
                }
            }else if(i == n -1){
                if ((long)a[n-1] * a[n-2] < 0){
                    System.out.print(a[n-1] + " ");
                }
            }else {
                if ((long)a[i] * a[i-1] < 0 || (long)a[i] * a[i + 1] < 0){
                    System.out.print(a[i] + " ");
                }
            }
        }

    }
    
}
