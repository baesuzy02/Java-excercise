package dequy;

import java.util.*;

public class bai21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] a = new int[n];
        for (int i = 0 ; i < n; i++){
            a[i] = scanner.nextInt();
        }
        if (doiXung(a, 0, n-1)){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
    public static boolean doiXung ( int [] n, int l , int r){
        if (l >= r){
            return true;
        } else {
            if (n[l] != n[r]){
                return false;
            } else {
                return doiXung(n, l+1, r-1);
            }
        }
    }
    
}
