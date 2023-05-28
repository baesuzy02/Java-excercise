package setmap;
import java.util.*;

public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap <Integer,Integer> map = new HashMap<>();
        int n = scanner.nextInt();
        int [] a = new int[n];
        for (int i = 0 ; i < n ; i++){
            a[i] = scanner.nextInt();
            if (map.containsKey(a[i])){
                int tanSuat = map.get(a[i]);
                tanSuat++;
                map.put(a[i],tanSuat);
            } else {
                map.put(a[i], 1);
            }
        }
        int q = scanner.nextInt();
        for (int i = 0 ; i < q ; i++){
            int tt = scanner.nextInt(), x= scanner.nextInt();
            if (tt == 1){
                if (map.containsKey(x)){
                    int tanSuat = map.get(x);
                    tanSuat++;
                    map.put(x, tanSuat);
                  }
                   else {
                    map.put(x,1);               
               }
            }else if (tt == 2){
                if (map.containsKey(x)){
                    int tanSuat = map.get(x);
                    tanSuat--;
                    if(tanSuat==0){
                        map.remove(x);
                    }
                }
            } else {
                if (map.containsKey(x)){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }
        } 
    }
}
