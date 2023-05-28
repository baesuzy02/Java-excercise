package ifelse;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        long S = (long) a*(b+c) + (long)b*(a+c);
        System.out.println(S);
    }
    
}
