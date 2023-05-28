package sapxep_timkiem;

import java.util.*;
public class bai17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int []a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        long ans = 0;
        for(int i = 0; i < n; i++){
            int pos = firstPos(a, i + 1, n - k, k - a[i]);
            if(pos != -1){
                ans += n - pos;
            }
        }
        System.out.println(ans);

    }
    public static int firstPos(int a[], int l , int r, int x){
        int res = -1;
        while(l <= r){
            int mid = (l + r) / 2;
            if(a[mid] > x){
                res = mid;
                r = mid - 1;
            }else {
                l = mid + 1;
            }
        }
        return res;
    }
    
}
