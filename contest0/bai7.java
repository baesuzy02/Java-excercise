package contest0;

import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       long n = scanner.nextInt();
        long lastDitgit = n%10;
        long lastTwoDitgit = n%100;
        System.out.println((lastDitgit));
        System.out.println(lastTwoDitgit);
    }
    
}
