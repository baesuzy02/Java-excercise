package dequy;

import java.util.*;

public class bai22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] a = new int[n];
        for (int i = 0 ; i < n; i++){
            a[i] = scanner.nextInt();
        }
        in2(a, n);
        System.out.println();
        in1(a, n);

    }
    public static void in1 (int [] a , int n){
        if (n!= 0){
            System.out.print(a[n-1]+ " ");
            in1(a, n-1);
        }
    }
    public static void in2 (int[]a , int n){
        if (n != 0){
            in2(a, n-1);
            System.out.print(a[n-1] + " ");
        }
    }
}
