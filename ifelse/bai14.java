package ifelse;

import java.util.Scanner;

public class bai14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble(); 
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();
        double tb = (a + b + c * 2 + d * 3)/7;
        if (tb >= 8){
            System.out.println("GIOI");
        } else if (tb >= 6.5 && tb < 8){
            System.out.println("KHA");
        } else if (tb >= 5 && tb < 6.5){
            System.out.println("TRUNG BINH");
        } else {
            System.out.println("YEU");
        }
    }
    
}
