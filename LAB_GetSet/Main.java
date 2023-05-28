import java.util.Scanner;

class User {
    private int id;
    private String email;

    public User(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return email;
    }

    public String toString(){
        return String.format("%06d", id) + " " + email;
    }
}

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();
        User[] u = new User[t+1];
        int idex = 1;
        for(int i = 0; i < t; i++){
            String[] s = sc.nextLine().trim().replaceAll("\\s+", " ").split(" ");
            if(s[0].equalsIgnoreCase("C")){
                u[idex] = new User(idex);
                System.out.println(u[idex]);
                idex++;
            }
            else if(s[0].equalsIgnoreCase("Set")){
                int idS = Integer.valueOf(s[1]);
                u[idS].setEmail(s[2]);
                System.out.println(u[idS]);
            }
            else {
                int idG = Integer.valueOf(s[0]);
                System.out.println(u[idG]);
            }
        }
        sc.close();
    }
}
