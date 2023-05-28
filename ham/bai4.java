package ham;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int cnt =0;
        for (int i = a; i <= b; i++){
                if (check(i)&&nt(i)){
                    cnt++;
                }
        }
        System.out.println(cnt);
    }
    public static boolean nt (int n){
        if (n < 2){
            return false;
        }for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static boolean check (int n){
        int tong = 0;
        while (n != 0){
            int r = n % 10;
            if (r != 2 && r != 3 && r != 5 && r != 7){
                return false;
            }
            tong += r;
            n /= 10;
        }
        return nt(tong);
    }
}
