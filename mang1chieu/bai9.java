package mang1chieu;

import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] a = new int[n];
        boolean flag = true;
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            flag = true;
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                int cnt = 1;
                for (int j = i + 1; j < a.length; j++) {
                    if (a[i] == a[j]) {
                        cnt++;
                    }
                }
                System.out.println(a[i]+ " " + cnt);
            }
        }
    }
    
}
