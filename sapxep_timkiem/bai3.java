package sapxep_timkiem;
import java.util.*;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] a = new int[n];
        HashSet<Integer> se = new HashSet<Integer>();
        for(int i = 0 ; i < n; i++){
            a[i] = scanner.nextInt();
        }
       for(int i = 0 ; i < n ;i++){
        se.add(a[i]);
       }
       System.out.print(se.size()+ " ");
      // for(int x : se){
      //   System.out.print(x + " ");
      // } (in ra các phần tử khác nhau trong mảng)
        
    }
    
}
