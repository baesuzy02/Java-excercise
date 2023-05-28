package ifelse;

import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int x = a/b*b;
        int y;
        if ( a%b == 0) {
            y=a;
        } else {
            y = (a/b+1)*b;
        } System.out.println(x);
        System.out.println(y);
    }
    
}
