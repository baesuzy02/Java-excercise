package ifelse;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int C = scanner.nextInt();
        double F = ((double)C*9/5) + 32;
        System.out.printf("%.2f",F);
    }
    
}
