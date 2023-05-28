package vidu;
import java.util.*;
public class vidu2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0, sum1 = 0;
        for(int i = 1 ; i <=n ; i++){
            if(i % 2 == 1){
                sum += i;
            }else {
                sum1 += i;
            }
        }
        System.out.println(sum);
        System.out.println(sum1);
    }
    
}
