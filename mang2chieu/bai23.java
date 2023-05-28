package mang2chieu;
import java.util.*;
public class bai23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                int tmp = scanner.nextInt();
                if( i == 0 || i == n - 1 || j == 0 || j == n - 1){
                    System.out.print(tmp + " ");
                }
            }
        }
    }
    
}
