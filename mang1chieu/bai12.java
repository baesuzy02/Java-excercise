package mang1chieu;

import java.util.Scanner;

public class bai12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        int min = (int) 1e9; int posMax = 0; int posMin = 0; int max = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
                posMax = i;
            }
            if (a[i] <= min) {
                min = a[i];
                posMin = i;
            }
        }
        System.out.print(posMin + " " + posMax);
    }
}
