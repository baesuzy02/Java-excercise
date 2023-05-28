package dequy;

import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println(C(n, k));
    }
    public static int C (int n , int k){
        if ( k == 0 || n==k) {
            return 1;
        }else {
            return C(n-1,k-1) + C(n-1 ,k);
        }
    }
}
