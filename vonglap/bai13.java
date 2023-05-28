package vonglap;

import java.util.Scanner;

public class bai13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long sum = 0;
        for ( int i = 1 ; i <= n; i++){
            sum+=2*i-1;
        }
        System.out.println(sum);
    }
    
}
