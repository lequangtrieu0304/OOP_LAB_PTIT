import java.util.Scanner;

class Circle {
    double r;
    String color;

    public Circle(){
        this.r = 1.0;
        this.color = "red";
    }

    public Circle(double radius){
        this.r = radius;
        this.color = "red";
    }

    public Circle(double radius, String color){
        this.r = radius;
        this.color = color;
    }

    public double getR(){
        return r;
    }

    public String getColor(){
        return color;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            double r = sc.nextDouble();
            String color = sc.nextLine().trim();
            
            if(r == -1){
                Circle circle = new Circle();
                System.out.println(circle.getR()+ " " + circle.getColor());
            }else if(color.isEmpty()) {
                Circle circle = new Circle(r);
                System.out.println(circle.getR() + " " + circle.getColor());
            }else {
                Circle circle = new Circle(r, color);
                System.out.println(circle.getR() + " " + circle.getColor());
            }
        }
        sc.close();
    }
}