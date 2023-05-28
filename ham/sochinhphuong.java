package ham;

import java.util.Scanner;

public class sochinhphuong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
       for (int i = a; i < b; i++) {
        if (cp(i)) {
            System.out.println(i);
        }
        
       }
    }
    public static boolean cp ( int n) {
        long can =(long) Math.sqrt(n);
        return can*can==n;
    }
}
