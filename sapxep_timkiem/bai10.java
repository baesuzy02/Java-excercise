package sapxep_timkiem;

import java.util.*;

public class bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] a = new int[n];
        for(int i = 0 ;i < n; i++){
            a[i] = scanner.nextInt();
        }
        int q = scanner.nextInt();
        for(int i = 0 ; i < q ; i++){
            int tmp = scanner.nextInt();
            if(check(a, n, tmp)){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
    public static boolean check( int a[], int n, int x){
        int l = 0, r = n - 1;
        while(l <= r){
            int mid = (l + r) / 2;
            if(a[mid] == x){
                return true;
            }else if(a[mid] > x){
                l = mid + 1;
            }else {
                r = mid - 1;
            }
        }
        return false;
    }
}

