package mang2chieu;
import java.util.*;
public class bai11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [][] a = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0 ; j < n; j++){
                a[i][j] = scanner.nextInt();
            }
        }
        for(int i = 0; i < n; i++){
            selectionSort(a[i], n);
        }
        for(int i = 0;i < n; i++){
            for(int j = 0; j < n ; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void selectionSort (int []a , int n){
        for(int i = 0; i < n - 1; i++){
            int pos = i;
            for(int j = i + 1; j < n; j++){
                if(a[pos] > a[j]){
                    pos = j;
                }
            }
            int tmp = a[pos];
            a[pos] = a[i];
            a[i] = tmp;
        }
    }
    
}
