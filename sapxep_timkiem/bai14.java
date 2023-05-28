package sapxep_timkiem;

import java.util.*;
public class bai14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int [] a = new int[n];
        for(int i = 0 ; i < n; i++){
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        int cnt = 0;
        for(int i = 1; i < n; i++){
            if(a[i] - a[i - 1] > k){
                cnt++;
            }
        }
        System.out.println(cnt + 1);
    }
    
}
