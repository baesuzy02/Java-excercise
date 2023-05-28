package vonglap;

import java.util.Scanner;

public class bai19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        int cnt = 0;
        while ( n != 0){
            int r = (int) (n % 10);
            if (r == 2 || r == 3 || r == 5 || r == 7 ){
                cnt++; 
            }
            n/=10;
        }
        System.out.println(cnt);
    }
    
}
