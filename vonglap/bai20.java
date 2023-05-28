package vonglap;

import java.util.Scanner;

public class bai20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = n / 28;
        int vo = sum;
        while ( vo > 3 ) {
          int bia = vo / 3;
          sum+=bia;
          vo = vo % 3  + bia;
        }
        System.out.println(sum);
    }
    
}
