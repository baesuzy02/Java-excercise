package setmap;
// sử dụng set
import java.util.*;
public class bai2b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] a = new int[n];
        for (int i = 0 ;  i < n ; i++){
            a[i] = scanner.nextInt();
        }
        HashSet <Integer> set = new HashSet<>();
        for (int i = 0 ; i < n ; i++){
            set.add(a[i]);
        }
        int q = scanner.nextInt();
        for (int i = 0; i < q ;i++){
            int x = scanner.nextInt();
            if (set.contains(x)){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
