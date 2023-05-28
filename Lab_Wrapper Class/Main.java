import java.util.Scanner;

class MakeString {
    String integerToString(int i) {
        return Integer.toString(i);
    }

    String objIntegerToString(Integer iObj) {
        return iObj.toString();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        MakeString mk = new MakeString();
    
        while(t-- >0){
            int n = sc.nextInt();
            String s1 = mk.integerToString(n);
            String s2 = mk.objIntegerToString(n);
            System.out.printf("int i: %s, object iObj: %s\n", s1, s2);
        }
        sc.close();
    }
}