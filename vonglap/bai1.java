package vonglap;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long sum = 0 ;
        for ( int i = 0 ; i <= n; i++){
            sum+=i;
        }
        System.out.println(sum);
        
    }
}
