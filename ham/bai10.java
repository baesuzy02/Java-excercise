package ham;

import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
       if (smith(n)){
        System.out.println("YES");
       } else {
        System.out.println("No");
       }
    }
    public static int tong (int n){
        int sum = 0;
        while ( n != 0){
            sum += n%10;
            n /= 10;
        }
        return sum;
    }
    public static boolean smith (int n){
        int tmp = n;
        int sum1 = tong(n);
        int sum2 = 0;
        for (int i =2 ; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                int d = tong(i);
                while ( n % i == 0 ){
                    sum2 += d;
                    n /= i;
                }
            }
        }
        if (tmp == n){
            return false;
        }if (n > 1){
            sum2 += tong(n);
        }if (sum1 == sum2){
            return true;
        } else {
            return false;
        }
    }
    
}
