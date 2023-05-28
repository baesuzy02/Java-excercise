package mang1chieu;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        int le = 0 ; int chan = 0; int tongLe = 0; int tongChan = 0;
        for (int i = 0; i < a.length; i++) {
            if ( a[i] % 2 == 0) {
                chan++;
                tongChan+=a[i];
            } else {
                le++;
                tongLe+=a[i];
            }
        }
        System.out.println(chan);
        System.out.println(le);
        System.out.println(tongChan);
        System.out.println(tongLe);
    }
}
