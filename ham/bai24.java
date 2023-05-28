package ham;

import java.util.*;

public class bai24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int mod = (int) (1e9+7);
        int f0 = 0 , f1= 1,fn = 0;
        if ( n == 1) {
            fn  = f0;
        } else if ( n == 2){
            fn = f1;
        } else {
            for (int i = 3 ; i <= n ; i++){
                fn = (f0 + f1) % mod;
                f0 = f1;
                f1 = fn;
            }
        }
        System.out.println(fn);
    }
}
