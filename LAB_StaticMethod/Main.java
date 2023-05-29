import java.util.Scanner;

class FlightBooking {
    String filghtId;
    int userId;

    static int seatAvailable;

    public FlightBooking(int userId){
        filghtId = "OOP";
        this.userId = userId;
    }

    public static int getSeatAvailable(){
        return seatAvailable;
    }

    public static void setSeatAvailable(int seatAvailable){
        FlightBooking.seatAvailable = seatAvailable;
    }
}

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while(t-- > 0){
            FlightBooking.setSeatAvailable(180);
            FlightBooking[] arrF = new FlightBooking[4];

            String[] strI = sc.nextLine().trim().replaceAll("\\s+", " ").split(" ");
            int len = strI.length;
            for(int i = 0; i < len; i+=2){
                int idU = Integer.valueOf(strI[0]);
                arrF[idU] = new FlightBooking(idU);

                String opt = strI[i+1];
                if(opt.equalsIgnoreCase("Booking")){
                    FlightBooking.setSeatAvailable(FlightBooking.getSeatAvailable() - 1);
                    System.out.printf("[Seat Available: %d]", FlightBooking.getSeatAvailable());
                }
                else if(opt.equalsIgnoreCase("Confirmed")) {
                    System.out.printf("--User %d Confirmed--[Seat Available: %d]", idU, FlightBooking.getSeatAvailable());
                }
                else {
                    FlightBooking.setSeatAvailable(FlightBooking.getSeatAvailable() + 1);
                    System.out.printf("[Seat Available: %d]", FlightBooking.getSeatAvailable());
                }
            }
            System.out.println();
        }
    }
}