import java.util.Scanner;

class Date {
    short day, month, year;
    static int number_of_date = 0;
    public Date(){
        this.day = 1;
        this.month = 1;
        this.year = 2023;
    }
    public Date(short day, short month, short year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public String getDay() {
        return String.format("%02d", day);
    }   
    public String getMonth(){
        return String.format("%02d", month);
    }
    public String getYear() {
        return String.format("%04d", year);
    }
}

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0){
            String[] str = sc.nextLine().trim().replaceAll("\\s+", " ").split(" ");
            if(str[0].equalsIgnoreCase("C")){
                Date date = new Date();
                System.out.println(date.getDay()+ "/" + date.getMonth() + "/" +date.getYear() + " " + Date.number_of_date);
            }
            else {
                short day = Short.valueOf(str[0]);
                if(day == 5 || day == 20){
                    Date.number_of_date++;
                }
                short month = Short.valueOf(str[1]);
                short year = Short.valueOf(str[2]);
                Date date = new Date(day, month, year);
                System.out.println(date.getDay()+ "/" + date.getMonth() + "/" +date.getYear() + " " + Date.number_of_date);
            }
        }
    }
}