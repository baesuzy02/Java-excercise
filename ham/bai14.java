package ham;

import java.util.*;

public class bai14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        if (shh(n)){
              System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
    public static boolean shh (long n){
        long sum = 0;
        for (int i = 1; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                sum += i;
                if (n / i != i){
                    sum += n / i;
                }
            }
        }
        return sum-n == n ;
    }
}
