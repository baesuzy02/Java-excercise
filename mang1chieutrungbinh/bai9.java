package mang1chieutrungbinh;

import java.util.*;

public class bai9 {
    public static int[] d = new int[100000005];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[]a = new int[n];
        for (int i = 0 ; i < n; i++){
            a[i] = scanner.nextInt();
            d[a[i]]++;
        }
        for (int val = 0 ; val <= 10000000; val++){
              if (d[val] > 0){
                System.out.println(val + " " + d[val]);
              }
        }
        System.out.println("");
        for (int i = 0 ;i < n; i++){
            if (d[a[i]] > 0 ){
                System.out.println(a[i] + " " + d[a[i]]);
                d[a[i]] = 0;
            }
        }
    }
    
}
