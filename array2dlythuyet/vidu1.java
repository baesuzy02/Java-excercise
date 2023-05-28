package array2dlythuyet;

import java.util.Scanner;

public class vidu1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int [][] a = new int [n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = scanner.nextInt();
            }
        } 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // if ( nt(a[i][j])) {
                // }
                
            }
            System.out.println();
        } System.out.print(a[0][1]+ " ");
    }
    // public static boolean nt ( int n) {
    //     for (int i = 2; i <= Math.sqrt(n); i++) {
    //         if ( n % i == 0) {
    //             return false;
    //         }
    //     }
    //     return n > 1;
    // }
}
