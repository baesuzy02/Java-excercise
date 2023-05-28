package array2dlythuyet;

import java.util.Scanner;

// các phép tính cơ bản trong ma trận 2 chiều.
// ma trận nó là một cái bảng 2 chiều.
// cộng trừ 2 ma trận phai có cùng số hàng và số cột.
public class daisotuyentinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int [][] a = new int[n][m];
        int [][]b = new int[n][m];
        int [][]c = new int[n][m];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                b[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                c[i][j] = a[i][j] + b[i][j];
               
                System.out.print(c[i][j]+ " ");
            }
           System.out.println();
        } 
        
    }
}
