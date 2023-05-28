import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];

        for(int i = 0; i < n; i++){
            str[i] = sc.next();
        }

        StringBuffer strb = new StringBuffer();

        for(int i = 0; i < n ; i++){
            char firstWord = str[i].charAt(0);
            if(i != 0 && Character.isUpperCase(firstWord)){
                strb.deleteCharAt(strb.length() - 1);
                strb.append(". ").append(str[i]).append(" ");
            }else if(i == n - 1){
                strb.append(str[i]).append(".");
            }
            else {
                strb.append(str[i]).append(" ");
            }
        }

        String sentence = strb.toString();
        System.out.println(sentence);

        sc.close();
    }
}