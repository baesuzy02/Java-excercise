package mang2chieu;
import java.util.*;
public class bai24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [][]a = new int[n][n];
        TreeMap<Integer,Integer>map = new TreeMap<>();
        for(int i = 0 ;i < n; i++){
            for(int j = 0; j < n; j++){
                a[i][j] = scanner.nextInt();
                if(i == 0){
                    map.put(a[i][j],1);
                }
            }
        }
        for(int i = 1; i < n ; i++){
            for(int j = 0; j < n; j++){
                if(map.containsKey(a[i][j])){
                    if(map.get(a[i][j]) == i){
                       map.put(a[i][j], i+1);
                    }
                }
            }
        }
        Set<Map.Entry<Integer,Integer>>entrySet = map.entrySet();
        boolean check = false;
        for(Map.Entry<Integer,Integer>entry:entrySet){
            if(entry.getValue() == n){
                check = true;
                System.out.print(entry.getKey() + " ");
            }
        }
        if(check == false){
            System.out.println("NOT FOUND");
        }
    }
    
}
