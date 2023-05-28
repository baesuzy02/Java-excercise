package ham;

import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1 ; i <= n ; i++){
            System.out.println(uoc(i));
        }
    }
    public static boolean nt (int n){
        if (n < 2){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static int uoc (int n){
        for (int i = 2 ; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                return i;
            }
        }
        return n;
    }
    
}
