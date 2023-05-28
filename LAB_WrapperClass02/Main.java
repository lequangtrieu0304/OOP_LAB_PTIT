import java.util.Scanner;

class NumList {
    String so;
    public NumList(String so){
        this.so = so;
    }

    public String checkF(String str){
        StringBuilder sb = new StringBuilder(str);
        if(sb.charAt(str.length() - 1) == 'f'){
            sb.deleteCharAt(str.length()-1);
        }
        return sb.toString();
    }

    public String check(){
        String[] a = this.so.split(" ");
        if(a.length % 2 != 0){
            return checkF(a[(a.length - 1) / 2]);
        }
        else {
            return checkF(a[(a.length/2) - 1]) + " " + checkF(a[(a.length/2)]);
        }
    }
}

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine().trim().replaceAll("\\s+", " ");
            NumList nl = new NumList(s);
            System.out.println(nl.check());
        }
        sc.close();
    }
}
