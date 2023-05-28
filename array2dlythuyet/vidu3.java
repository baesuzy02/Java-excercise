package array2dlythuyet;

import java.util.Scanner;

public class vidu3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int [][] a = new int[n][m];
        
        nhapMang(a, n, m);
        findOdd(a, n, m);
        System.out.println();
        findEven(a, n, m);
        System.out.println();
        tinhTongSoCot(a, n, m);
        System.out.println();
       tinhTongSohang(a, n, m);
        System.out.println();
        System.out.println();
       for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            if (nt(a, a[i][j])) {
                System.out.print(a[i][j] + " ");
            }
        }
       }
       System.out.println();
        xuatMang(a, n, m);
        // while ( true) {
        //     System.out.println("========= MENU ==========\n"
        //     +"1. Nhap mang:\n " +
        //     "2. Tim số lẻ trong mảng:\n "
        //     +"3. Tim so chan trong mang:\n "
        //     +"4. Tinh tong cac phan tu trong mang:\n "
        //     +"5. Xuat ma tran:\n " 
        //     +"6. Thoat!!\n "
        //     +"========================================");
        //                    int choice = scanner.nextInt();
        //                    switch ( choice) {
        //                     case 1 :
        //                     nhapMang(a, n, m);
        //                     break;
        //                     case 2:
        //                     findOdd(a, n, m);
        //                     break;
        //                     case 3:
        //                     findEven(a, n, m);
        //                     break;
        //                     case 4:
        //                     xuatMang(a, n, m);
        //                     break;
        //                     default:
        //                     System.out.println("Thank you!!!");
        //                    }       
        // }
        
                 
    }
    public static void findOdd ( int[][]a, int n , int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] % 2 == 1) {
                    System.out.print(a[i][j] + " ");
                }
            }
        }
    }
    public static void findEven ( int[][]a, int n , int m ) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if ( a[i][j] % 2 == 0) {
                    System.out.print(a[i][j] + " ");
                }
            }
        }
    }
    public static void xuatMang ( int[][]a, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void nhapMang ( int[][]a, int n, int m ) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = scanner.nextInt();
            }
        }
    }
    public static int tongMaTran ( int[][]a, int n, int m ) {
              int sum = 0;
              for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    sum+=a[i][j];
                }
              }
              return sum;
}
public static void tinhTongSohang ( int[][]a, int n, int m) {
      for (int i = 0; i < n; i++) {
           int sum = 0;
        for (int j = 0; j < m; j++) {
            sum+= a[i][j];
           
        }
        System.out.print(sum+ " ");
      }
}
public static void tinhTongSoCot ( int[][]a, int n, int m) {
    for (int i = 0; i < m; i++) {
        int sum = 0;
        for (int j = 0; j < n; j++) {
            sum+=a[j][i];
        
        }
        System.out.print(sum+ " ");
    }
    
}
public static boolean nt (int [][] a , int n) {
    for (int i = 2; i <= Math.sqrt(n); i++) {
        if ( n % i == 0) 
        return false;
    }
    return n>1;
}
}