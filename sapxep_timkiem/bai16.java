package sapxep_timkiem;


import java.util.*;
public class bai16 {
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
            int pos = lastPos(a, i + 1, n - 1, k - a[i]);
            if(pos != -1){
                ans += pos - i;
            }
        }
           System.out.println(ans);
    }
    public static int lastPos(int a[], int l, int r, int x){
        int res = -1;
        while(l <= r){
            int mid = (l + r) / 2;
            if(a[mid] < x){
                res = mid;
                l = mid + 1;
            }else {
                r = mid - 1;
            }
        }
        return res;
    }
    
}
