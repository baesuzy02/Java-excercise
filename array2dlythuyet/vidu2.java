package array2dlythuyet;

import java.util.Scanner;

public class vidu2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
       
        int [][] a = new int[n][m];
        int max = (int) -1e9; 
        int min = (int) 1e9;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = scanner.nextInt();
            }
        } // tính tổng từng cột
        for (int i = 0; i < m; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum+= a[j][i];
                // if (a[i][j] > max) {
                //     max = a[i][j];
                // } if ( a[i][j] < min){
                //     min = a[i][j];
                // }
            }   System.out.print(sum+ " ");
        } 
        // System.out.println(max);
        // System.out.println(min);
      

    }
    
}

