package ham;

import java.util.*;
public class bai15{
    public static boolean tn(long n){
       int lat = 0 ; int tmp = (int)n;
       while ( n != 0){
        lat = (int) (lat * 10 + n % 10);
        n /= 10;
       }
       return lat == tmp;
    }
    public static boolean pt(long n){
        int cnt = 0;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                cnt++;
                while(n%i==0)
                    n/=i;
            }
        }
        if(n!=1) cnt++;
        return cnt>=3;
    }
    public static void main(String[] args) {
        long l,r;
        Scanner sc = new Scanner(System.in);
        l = sc.nextLong();
        r = sc.nextLong();
        boolean check = false;
        for(long i=l;i<=r;i++){
            if(tn(i)){
                if(pt(i)){
                    check = true;
                    System.out.print(i+" ");
                }
            }
        }
        if(check==false)
            System.out.println("-1");
    }
}

