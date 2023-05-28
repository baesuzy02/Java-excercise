package mang2chieu;
import java.util.*;
public class bai6 {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [][] a = new int[n][n];
    for(int i = 0 ; i < n; i++){
        for(int j = 0; j < n;j++){
            a[i][j] = scanner.nextInt();
        }
    }
    for(int i = 0; i < n; i++){
        int tmp = a[i][i];
        a[i][i] = a[i][n - i - 1];
        a[i][n - i - 1] = tmp;
    }
    for(int i = 0; i < n; i++){
        for(int j = 0 ; j < n ; j++){
            System.out.print(a[i][j] + " ");
        }
        System.out.println();
    }
      }    
}
