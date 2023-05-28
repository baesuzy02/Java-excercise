package contest0;

import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       double n = scanner.nextDouble();
        int ceil = (int)Math.ceil(n);
        int floor = (int)Math.floor(n);
        int round = (int)Math.round(n);
        System.out.println(floor);
        System.out.println(ceil);
        System.out.println(round);
    }
    
}
