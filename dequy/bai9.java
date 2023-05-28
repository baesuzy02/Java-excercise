package dequy;

import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b= scanner.nextInt();
        System.out.println(binPow(a, b));
    }
    static long mod = 1000000007;
    public static long binPow (long a , long b){
        if ( b == 0){
            return 1;
        }long tmp = binPow(a, b/2);
        if ( b % 2 == 1){
            return ((tmp % mod)* ( tmp % mod)) % mod * ( a%mod) %mod;
        } else {
            return (tmp %mod) * (tmp % mod)%mod;
        }
    }
    
}
