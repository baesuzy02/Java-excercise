package mang1chieu;

import java.util.Scanner;
//JAVA
public class vidu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int cnt = 0;
        int cnt2 = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 1){
                System.out.print(a[i] + " ");
                cnt++;
            }
        }
        System.out.println(cnt);
        for (int i = 0 ; i < n ; i++){
            if (a[i] % 2 == 0){
                System.out.print(a[i] + " ");
                cnt2++;
            }
        }
        System.out.println(cnt2);
        for (int i = 0 ; i < n; i++){
            if(nt(a[i])){
                System.out.print(a[i] + " ");
            }
        }
    }
    public static boolean nt (int n){
        if (n < 2){
            return false;
        }
        for (int i = 2 ; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }

}
