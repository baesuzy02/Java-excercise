package mang2chieu;
import java.util.*;
public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int [][] a = new int[n][m];
        for(int i = 0 ; i < n; i++){
            for(int j = 0 ;  j < m; j++){
                a[i][j] = scanner.nextInt();
            }
        }
        for(int i = 0 ; i < n; i++){
            long sum = 0;
            for(int j = 0; j < m ; j++){
                sum+=a[i][j];
            }
            System.out.print(sum +" ");
        }
        System.out.println();
        for (int i = 0 ; i < m ; i++){
            long sum = 0;
            for(int j = 0 ; j < n; j++){
                sum+=a[j][i];
            }
            System.out.print(sum + " ");
        }
    }
    
}
