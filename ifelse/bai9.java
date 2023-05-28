package ifelse;

import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nam = scanner.nextInt();
        if((nam % 4 == 0 && nam % 100 != 0) || nam % 400 == 0) {
            System.out.printf("YES\n");
        }else {
            System.out.println("NO");
        }
    }
    
}
