package ifelse;

import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if ( a > 0 && b > 0 && c > 0 && a + b > c && b + c > a && a + c > b){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
