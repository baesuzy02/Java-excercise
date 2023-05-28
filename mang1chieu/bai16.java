package mang1chieu;

import java.util.*;

public class bai16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] a = new int[n];
        for (int i = 0 ; i< n ; i++){
            a[i] = scanner.nextInt();
        }
        int cnt1 = 0,cnt2 = 0,cnt3 = 0, cnt4 = 0;
        for (int i = 0 ; i < n; i++){
            if (nt(a[i])){
                cnt1++;
            }
            if (tn(a[i])){
                cnt2++;
            }
            if (cp(a[i])){
                cnt3++;
            }
            if (tongnt(a[i]) == 1){
                cnt4++;
            }
        }
        System.out.print(cnt1 + "\n" + cnt2 + "\n" + cnt3 + "\n" + cnt4);
        
    }
    public static boolean nt (int n){
        if (n < 2){
            return false;
        }for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static boolean tn (int n){
        int lat = 0 ; int tmp = n;
        while (n != 0){
            lat = lat * 10 + n % 10;
            n /= 10;
        }
        return lat == tmp;
    }
    public static boolean cp (int n){
        int can = (int)Math.sqrt(n);
        return can*can==n;
    }
    public static int tongnt(int n){
        int sum = 0;
        while (n != 0){
            sum+=n%10;
            n /= 10;
        }
        if (nt(sum)){
            return 1;
        }else {
            return 0;
        }
    }
}
