package array2dlythuyet;

import java.util.Scanner;
// in ra số nt trong mảng 1 chiều
public class vidu5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            if ( nt(a[i])) {
                System.out.print(a[i] + " ");
            }
        }
    }
    public static boolean nt (int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if ( n % i == 0) {
                return false;
            }
        }
        return n>1;
    }
}
