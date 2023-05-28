package ham;

import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        if(soLocPhat(n)){
            System.out.println("1");
        }else {
            System.out.println("0");
        }
    }
    public static boolean soLocPhat (long n){
        while (n != 0){
            long r = n % 10;
            if ( r != 0 && r != 6 && r != 8){
                return false;
            }
            n /= 10;
        }
        return true;
    }
}
