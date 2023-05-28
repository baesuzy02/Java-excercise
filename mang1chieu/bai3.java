package mang1chieu;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int cnt = 0; int min = (int) 1e9;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] ==  min){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
    
}
