package sapxep_timkiem;

import java.util.*;

public class bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] a = new int[n];
        for(int i = 0 ; i < n;i++){
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        int ans = (int)1e9;
        for(int i = 1; i < n;i++){
            ans = Math.min(ans, a[i] - a[i -1]);
        }
        if(n == 1){
            System.out.println(0);
        }else {
            System.out.print(ans + " ");
        }
    }
}
