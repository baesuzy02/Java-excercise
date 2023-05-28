package mang1chieu;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        int x = scanner.nextInt();
        int lon = 0 ; int nho = 0;
        for (int i = 0; i < a.length; i++) {
            if ( a[i] > x ) {
                lon++;
            } else if ( a[i] < x){
                nho++;
            }
            
            }
            System.out.println(nho);
        System.out.println(lon);
        }
    }
    

