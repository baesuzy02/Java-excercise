package dequy;


import java.util.*;

public class bai20 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    System.out.println(dq(n));

  } 
  public static int dq (int n){
    if (n==1){
        return 0;
    } else {
        int res = (int) 1e9,res2 = (int) 1e9,res3 = (int) 1e9;
        if (n %2 == 0) res = dq(n/2) +1;
        if (n % 3 == 0) res2 = dq(n/3) + 1;
        if (n > 1) res3 = dq(n-1) + 1;
        return Math.min(res,Math.min(res2,res3));
    }
  } 
}
