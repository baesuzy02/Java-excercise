package ifelse;

import java.util.Scanner;

public class bai13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int year = n/ 365;
        n = n % 365;
        int week = n / 7;
        n = n % 7;
        System.out.printf("%d %d %d", year,week,n);
    }
    
}
