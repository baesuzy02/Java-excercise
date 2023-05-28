package ham;

import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        if (sphenic(n)){
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
    public static boolean sphenic (long n){
        int cnt = 0;
        for (int i = 2 ; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                int mu = 0;
                while ( n % i == 0){
                    mu++;
                    n /= i;
                }if ( mu >= 2){
                    return false;
                }cnt++;

            }
        } if ( n > 1){
            cnt++;
        } if ( cnt == 3){
            return true;
        } else {
            return false;
        }
    }
    
}
