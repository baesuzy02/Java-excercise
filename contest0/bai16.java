package contest0;

import java.util.Scanner;

public class bai16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long x = scanner.nextInt();
        long y =scanner.nextInt();
        long z = scanner.nextInt();
        long t = scanner.nextInt();
        System.out.println(x + "  " + y + "  " + z + "  " + t);
        System.out.println("");
        System.out.println(y + "--" + z + "--" + x + "--" + t );
        System.out.println("");
        System.out.println(2*x + "," + 3*y + "," + 4*z +"," + 5*t);
        System.out.println("");
        System.out.println("KET THUC !!");
    }
    
}
