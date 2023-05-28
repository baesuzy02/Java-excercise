package ham;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextInt();
        if (cp(a)){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
    public static boolean cp (long n){
        long can = (long)Math.sqrt(n);
        return (long) can*can == n;
    }
}
