package ham;

import java.util.Scanner;

public class bai11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            System.out.println(find(n));
        }
    }
    public static int find (int n){
        int res = 0;
        for (int i = 2 ; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                res = i;
                while ( n % i == 0){
                    n /= i;
                }
            }
        }if (n > 1){
            res = n;
        } return res;
    }
}
