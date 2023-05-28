package setmap;
// sử dụng binary search
import java.util.*;
public class bai2a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        int q = scanner.nextInt();
        Arrays.sort(a);
        for (int i = 0; i < q; i++) {
            int x = scanner.nextInt();
            if (Arrays.binarySearch(a, x) >= 0){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
