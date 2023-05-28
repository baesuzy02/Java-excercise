package vidu;
import java.util.*;
public class vidu3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Dien tich hinh vuong la " + square(n));
    }
    public static int square (int a){
        return a * a;
    }
    
}
