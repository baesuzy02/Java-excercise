package vonglap;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long sum = 0;
        for (int i = 1 ; i<= n ; i++){
            if ( i % 3 == 0)
           sum+=i;
        }System.out.println(sum);
}
}