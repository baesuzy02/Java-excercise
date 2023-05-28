package mang2chieu;
import java.util.*;
public class bai14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [][] a = new int[n][n];
        int h1 = 0;
        int h2 = n-1;
        int c1 = 0;
        int c2 = n-1;
        int cnt = 1;
        while( cnt <= n*n){
            for(int i = c1 ; i <= c2; i++){
                a[h1][i] = cnt++;
            }
            h1++;
            for(int i = h1; i <= h2 ; i++){
                a[i][c2] = cnt++;
            }
            c2--;
            for(int i = c2 ; i >= c1; i--){
                a[h2][i] = cnt++;
            }
            h2--;
            for(int i = h2; i >= h1; i--){
                a[i][c1] = cnt++;
            }
            c1++;
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
