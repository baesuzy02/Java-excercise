package mang2chieu;
import java.util.*;
public class bai19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        long [][] a = new long[n+2][m+2];
        for(int i = 1; i <= n ; i++){
            for(int j = 1 ; j <= m ; j++){
                a[i][j] = scanner.nextInt();
            }
        }
        for(int i = 1 ; i <= n;i++){
            for(int j = 1 ; j <= m ; j++){
                a[i][j] += Math.max(a[i-1][j],a[i][j-1]);
            }
        }
        System.out.println(a[n][m]);
    } 
}
