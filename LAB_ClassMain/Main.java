import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String str = sc.nextLine();
            String[] s = str.trim().replaceAll("\\s+", " ").split(" ");
            System.out.println(str.length() + " " + s.length);
        }
    }
}
