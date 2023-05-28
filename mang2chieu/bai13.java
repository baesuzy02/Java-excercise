package mang2chieu;
import java.util.*;
public class bai13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int p = scanner.nextInt();
        int [][]a = new int[n][m];
        int [][]b = new int[m][p];
        long [][]c = new long[n][p];
        for(int i = 0 ; i < n; i++){
            for(int j = 0 ; j < m; j++){
                a[i][j] = scanner.nextInt();
            }
        }
        for(int i = 0 ; i < m; i++){
            for(int j = 0; j < p ; j++){
                b[i][j] = scanner.nextInt();
            }
        }
        for(int i = 0 ; i < n; i++){
            for(int j = 0; j < p; j++){
                c[i][j] = 0;
                for(int k = 0; k < m; k++){
                    c[i][j] += (long)a[i][k] * b[k][j];
                }
            }
        }
        for(int i = 0 ; i < n ; i++){
            for(int j = 0; j < p ; j++){
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
