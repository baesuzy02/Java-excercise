package array2dlythuyet;

import java.util.Scanner;
/* bài tâp : Viết chương trình Java (có sử dụng hàm):
1. Nhập ma trận vuông kích thước n x n gồm các phần tử kiểu số nguyên
2. Tìm phần tử có giá trị lớn nhất trên đường chéo chính.
3. Tìm phần tử nhỏ nhất trên đường chéo phụ.
4. Xác định cột thứ k chứa phần tử nhỏ nhất của ma trân
5 Xuất ma trận */
public class baitapthuchanh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
            a[i][j] = scanner.nextInt();
        }
    } 
    for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a.length; j++) {
            System.out.print(a[i][j] + " ");
        }
        System.out.println();
    }
    System.out.println(timCotChuaMin(a, n));
    System.out.println(findMax(a, n));
    System.out.println(findMin(a, n));
    
}
public static int findMax (int[][] a , int n) {
    int max = a[0][0];
    for (int i = 1; i < n; i++) {
        if ( a[i][i] > max) {
            max = a[i][i];
        }
    }
    return max;
}
public static int findMin (int [][]a, int n ){
    int min = a[0][n-1];
    for (int i = 0; i < n; i++) {
        if (a[i][n-i-1] < min) {
            min = a[i][n-i-1];
        }
    }
    return min;
}
public static int timCotChuaMin (int [][]a, int n ){
    int min = a[0][0];
    int cot = 0;
    for (int j = 1; j < a.length; j++) {
        if (a[j][0] < min) { 
            min = a[j][0];
            cot = j;
    }
    for (int i = 1; i < a.length; i++) {
        if( a[i][cot] > a[i][cot+1]){
            cot++;
        }
    }
} 
return cot;
}
}
