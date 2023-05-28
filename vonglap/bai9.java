package vonglap;

import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long sum = 1;
        for (int i = 1 ; i <= n; i++){
            if (n % i == 0){
                sum*=i;
            }
        }
        System.out.println(sum);
    }
    
}
