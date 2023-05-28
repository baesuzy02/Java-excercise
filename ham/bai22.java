package ham;
import java.util.*;

public class bai22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long p = scanner.nextLong();
        System.out.println(count(n, p));
    }
    public static long count (long n , long p ){
        long cnt = 0;
        for (long i = p ; i<= n; i*=p){
            cnt += n/i;
        }
        return cnt;
    }   
}
