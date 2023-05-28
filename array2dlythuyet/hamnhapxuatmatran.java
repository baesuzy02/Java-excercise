package array2dlythuyet;

import java.util.Scanner;
// hàm xuất nhập mảng 2 chiều
public class hamnhapxuatmatran {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int  n = scanner.nextInt();
        int m = scanner.nextInt();
        int [][] a = new int[n][m];
        nhapMang(a, n, m);
        xuatMang(a, n, m);
    }
    public static void nhapMang (int [][] a , int n , int m) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = scanner.nextInt();
            }
        }

    }
    public static void xuatMang (int [][] a, int n , int m) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }
}
}
