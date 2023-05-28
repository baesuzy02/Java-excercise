package mang1chieu;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] a = new int[n];
        boolean chan = false;
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            if ( i % 2 == 0 && a[i] % 2 == 0) {
                System.out.print(a[i] + " ");
                chan = true;
            }
        }
        if ( !chan ) {
            System.out.println("NONE");
        }
    }
}
