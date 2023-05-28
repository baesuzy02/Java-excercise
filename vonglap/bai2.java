package vonglap;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt();
        long sum = 0;
        for (int i = 1 ; i <= n ; i++){
             sum +=1l*i*i;
        }
        System.out.println(sum);
    }
    
}
