package ham;


import java.util.*;


public class bai13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a =scanner.nextInt();
        int b = scanner.nextInt();
        for (int i = a ; i <= b ; i++){
            if (check(i)){
                System.out.print(i + " ");
            }
        }
    }
    public static boolean check(int n){
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0){
                   int cnt = 0;
                   while (n % i == 0){
                    cnt++;
                    n /= i;
                   }if (cnt == 1){
                    return false;
                   }
            }
        }
        if ( n > 1){
            return false;
        } else {
            return true;
        }
    }
    
}
