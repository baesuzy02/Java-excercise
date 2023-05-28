package dequy;

import java.util.*;

public class bai24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []a = new int[n];
        for (int i = 0 ; i < n ; i++){
            a[i] = scanner.nextInt();
        }
        if (check(a, n)){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
    public static boolean check (int[]a,int n){
        if (n == 1){
            return true;
        }else {
            if (a[n-1] <= a[n-2]){
                return false;
            } else {
                return check(a, n-1);
            }
        }
    }
}
