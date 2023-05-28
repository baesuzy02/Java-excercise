package dequy;

import java.util.*;

public class bai23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []a = new int[n];
        for (int i = 0 ; i < n; i++){
            a[i] = scanner.nextInt();
        }
        if (check(a, n)){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
    public static boolean check (int[]a ,int n){
        if (n==1){
            if (a[0] % 2 == 0){
                return true;
            }else {
                return false;
            }
        }else {
            if (a[n-1] % 2 == 1){
                return false;
            } else {
                return check(a, n-1);
            }
        }
    }
    
}
