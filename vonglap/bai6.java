package vonglap;

import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long sum = 0;
        for (int i = 1; i <= Math.sqrt(n); i++){
            if (n % i == 0 ){
                sum+=i;
                if ( i != n/i){
                    sum+=n/i;
                }
            } 
        }
        System.out.println(sum);
    }
    
}
