package mang2chieu;

import java.util.*;
public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), m = scanner.nextInt();
        int [][] a = new int[n][m];
        int max = (int) -1e9, min = (int) 1e9;
        for(int i = 0 ; i < n; i++){
            for(int j = 0 ; j < m;j++){
                a[i][j] = scanner.nextInt();
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(a[i][j] < min){
                    min = a[i][j];
                }
            }
        }
        System.out.println(min);
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m ; j++){
                if(a[i][j] == min){
                    System.out.printf("%d %d\n" , i + 1, j + 1);
                }
            }
        }
        for(int i = 0 ; i < n; i++){
            for(int j = 0; j < m; j++){
                if(a[i][j] > max){
                    max = a[i][j];
                }
            }
        }
        System.out.println(max);
        for(int i = 0 ; i < n; i++){
            for(int j = 0; j < m; j++){
                if(a[i][j] == max){
                    System.out.printf("%d %d\n" , i + 1, j + 1);
                }
            }
        }
    }
    
}
