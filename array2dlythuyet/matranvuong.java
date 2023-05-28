package array2dlythuyet;

import java.util.Scanner;

// ma trận vuông là ma trận có số lượng hàng bằng số lượng cột
public class matranvuong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [][] a = new int [n][n];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = scanner.nextInt();
            }
        } for (int i = 0; i < n; i++) {
            // for (int j = 0; j <= i; j++) {
                // System.out.print(a[i][n-i-1] + " ");
            // } 
            // a[i][i] = đường chéo chính
            // a[i][n-i-1] = đường chéo phụ
            // System.out.println();
            if (nt(a[i][n-i-1])) {
                System.out.print(a[i][n-i-1] + " "); //số nguyên tố trên đường chéo phụ
            }
        }
    }
    public static boolean nt ( int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if ( n % i == 0) {
                return false;
            }
        }
        return n>1;
    }
  
}
