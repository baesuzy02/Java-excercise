package sapxep_timkiem;

import java.util.*;

public class bai15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int [] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        long ans = 0;
        for(int i = 0; i < n; i++){
            int p1 = firstPos(a, i + 1, n - 1, k - a[i]);
            int p2 = rightPos(a, i + 1, n - 1, k - a[i]);
            if(p1 != -1){
                ans += p2 - p1 + 1;
            }
        }
        System.out.println(ans);
    }
    public static int firstPos(int a[], int l , int r, int x){
        int res = -1;
        while(l <= r){
            int mid = (l + r) / 2;
            if(a[mid] == x){
                res = mid;
                r = mid - 1;
            }else if ( a[mid] < x){
                l = mid + 1;
            }else {
                r = mid - 1;
            }
        }
        return res;
    }
    public static int rightPos(int a[], int l , int r, int x){
        int res = -1;
        while(l <= r){
            int mid = (l + r) / 2;
            if(a[mid] == x){
                res = mid;
                l = mid + 1;
            }else if (a[mid] < x){
                l = mid + 1;
            }else {
                r = mid - 1;
            }
        }
        return res;
    }
}
