import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while(test-- > 0){
            String line = sc.nextLine();
            String[] tokens = line.split("\\s+");
            BigInteger a = new BigInteger(tokens[0]);
            BigInteger b = new BigInteger(tokens[2]);
            BigInteger c = BigInteger.ZERO;
            switch(tokens[1]){
                case "+": 
                    c = a.add(b);
                    break;
                case "-":
                    c = a.subtract(b);
                    break;
                case "*":
                    c = a.multiply(b);
                    break;
            }
            System.out.println(c);
        }
        sc.close();
    }
}

