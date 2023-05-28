package ham;

import java.util.*;

public class bai23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        System.out.println(bac(n, 5));
    }
    public static boolean nt (int n){
        if (n < 2){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++){
            if ( n % i == 0){
                return false;
            }
        }
         return true;
    }
    public static long bac (long n , long p){
        long cnt = 0;
        for (long i = p ;i<=n ; i*=p){
            cnt += n/i;
            cnt  %= (long) (1e9 + 7); 
        }
        return cnt % (long) (1e9 + 7);
    }
    
}
