package setmap;
import java.util.*;

public class bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet <Integer> set = new HashSet<>();
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        for (int i = 1; i<=n+m ; i++){
            int x = scanner.nextInt();
            set.add(x);
        }   
        ArrayList <Integer> arr = new ArrayList<>();
        for (int x : set){
              arr.add(x);
        }
        Collections.sort (arr, new Comparator<Integer>() {
            @Override
            public int compare (Integer x , Integer y){
                if ( x < y) return 1;
                else return -1;
            }
            
        });
        for (int i = 0 ; i < arr.size() ; i++){
            System.out.print(arr.get(i)+ " ");
        }
    }
}
