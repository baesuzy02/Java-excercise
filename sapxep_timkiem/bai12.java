package sapxep_timkiem;

import java.util.*;

public class bai12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        int ans = 1;
        int max = a[n-1];
        for(int i = n - 2 ; i >= 0; i--){
            if(max >= 1){
                ans++;
                max = Math.min(max - 1, a[i]);
            }
        }
        System.out.println(ans);
    } 
}
