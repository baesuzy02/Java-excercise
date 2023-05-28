package vonglap;

import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int check = 0;
        for (int i = 1; i <= n ; i++){
            int tmp = scanner.nextInt();
            if (tmp == 2022){
                check = 1;
            }
        }
        if ( check == 1) {
            System.out.println("YES\n");
        }else {
            System.out.println("NO");
        }
    }
}
