import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i =0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            int target = sc.nextInt();
            Map<Integer, Integer> map = new HashMap<>(); 
            int ok = 0;
            for(int i = 0; i < n; i++){                 
                int k = target - arr[i];
                if(map.containsKey(k)){
                    if(i < map.get(k)){
                        System.out.println(i+ " " + map.get(k));
                    }
                    else {
                        System.out.println(map.get(k)+ " " + i);
                    }
                    ok = 1;
                }
                else {
                    map.put(arr[i], i);
                }
            }
            if(ok == 0) System.out.println("Not found");
        }
    }
}
