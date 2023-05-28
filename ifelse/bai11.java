package ifelse;

import java.util.Scanner;

public class bai11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a > 0 && b > 0 && c > 0 && a+b>c && a+c>b && b+c>a) {
            if ( a == b && b == c){
                System.out.println("1");
            }else if (a == b || b == c || a == c){
                System.out.println("2");
            }else if (a*a==b*b+c*c || b*b==a*a+c*c || c*c == b*b + a*a){
                System.out.println("3");
            }else {
                System.out.println("4");
            }
        } else {
            System.out.printf("INVALID\n");
        }
    }
    
}
