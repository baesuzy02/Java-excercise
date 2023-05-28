package contest0;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        long b = scanner.nextLong();
        scanner.nextLine();
        char c = scanner.nextLine().charAt(0);
        float d = scanner.nextFloat();
        double e = scanner.nextDouble();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.printf("%.2f\n", d);
        System.out.printf("%.9f\n", e);

    }
    
}
