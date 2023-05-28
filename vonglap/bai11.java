package vonglap;

import java.util.Scanner;

public class bai11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long sum = 0;
        for (int i = 1 ; i <= n ; i++){
            if ( i % 2 == 0){
                sum+=i;
            }else {
                sum-=i;
            }
        }
        System.out.println(sum);
    }
    
}
