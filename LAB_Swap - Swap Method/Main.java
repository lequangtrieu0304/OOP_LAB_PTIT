import java.util.Scanner;

class Swap {
    public static void swap(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());

            int[] arr = {a, b};
            Swap.swap(arr);
            System.out.println(arr[0] + " " + arr[1]);
        }
        sc.close();
    }
}

