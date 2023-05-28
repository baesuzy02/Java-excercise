package sapxep_timkiem;

import java.util.*;

public class bai11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), m = scanner.nextInt();
        int []a = new int [n];
        int []b = new int [m];
        for(int i = 0 ; i < n; i++ ){
            a[i] = scanner.nextInt();
        }
        for(int i = 0 ; i < m;i++){
            b[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        int ans = 0, j = 0, i = 0;
        while(i < n && j < m){
            if(a[i] > b[j]){
                ans++; j++; i++;
            }else {
                i++;
            }
        }
        System.out.println(ans);
    }   
}
