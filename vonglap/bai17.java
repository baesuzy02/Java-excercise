package vonglap;

import java.util.Scanner;

public class bai17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt();
        if ( n == 1) {
            System.out.println("1\n");
        }
        int cnt = 0;
        while (n != 0){
            cnt++;
           n /= 10;
        }
        System.out.println(cnt);
    }
    
}
