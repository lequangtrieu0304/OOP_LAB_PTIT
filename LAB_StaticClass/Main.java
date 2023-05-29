import java.util.Scanner;

public class Main {
    static class Account{
        private String id; 
        private String name;
        private int balance;

        static int count = 0;

        public Account(String name, int balance){
            this.id = String.format("%3d", count++);
            this.name = name;
            this.balance = balance;
        }

        public String getId(){
            return id;
        }
        public void setId(String id){
            this.id = id;
        }
        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name = name;
        }
        public int getBalance(){
            return balance;
        }
        public void setBalance(int balance){
            this.balance = balance;
        }

        public void rutTien(int money){
            this.balance -= money;
        }

        public void napTien(int money){
            this.balance += money;
        }
        public void chuyenTien(Account acc, int money){
            this.balance -= money;
            acc.balance += money;
        }
        public String toString(){
            return "[" + id + ", " + name + ", "+ balance + "]";
        }
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            int n = sc.nextInt();
            Account[] nAcc = new Account[n];
            for(int i = 0; i < n; i++){
                String[] str = sc.nextLine().trim().replaceAll("\\s+", " ").split(" ");
                String name = "";
                int money = 0;
                int len = str.length;
                for(int j = 0; j < len - 1; j++){
                    name = name.concat(str[j]).concat(" ");
                    money = Integer.parseInt(str[len - 1]);
                }
                nAcc[i] = new Account(name, money);
                System.out.println(nAcc[i]);
            }
        }
    }
}
