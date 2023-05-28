package vonglap;

import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long sum = 0;
        int cnt= 0;
        for ( int i = 1 ; i <= n; i++){
            if ( n % i == 0){
                cnt++;
            }
        }
        System.out.println(cnt);
        for ( int i = 1 ; i <= n; i++){
            if ( n % i == 0){
                System.out.print(i+ " ");
            }
        }
    }
    
}
