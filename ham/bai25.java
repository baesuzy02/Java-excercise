package ham;


import java.util.*;

public class bai25 {
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        if (check(n)){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
       }
       public static boolean check (long n){
         if (n == 0){
            return true;
         }
         long f0 = 0 , f1 = 1, fn = 1;
         while ( fn < n){
            fn = f0 + f1;
            f0 = f1;
            f1 = fn;
         }
         return fn == n;

       }    
}
