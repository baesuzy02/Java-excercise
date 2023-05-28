package sapxep_timkiem;

import java.util.*;
public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[]a = new int[n];
        for(int i = 0 ; i < n ;i++){
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        for(int i = 0 ; i < n; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
        Arrays.sort(a);
        for(int i = n - 1; i >= 0; i--){
            System.out.print(a[i] + " ");
        }
    }
    
}
