import java.util.Scanner;

class Circle{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return 3.14 * radius * radius;
    }

    public String toString(){
        return "Circle[radius=" + String.format("%.1f", radius)+ ", "+  "area="+ String.format("%.1f", getArea()) + "]";
    }
}

class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height){
        super(radius);
        this.height = height;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        this.height = height;
    }
    @Override
    public double getArea(){
        return super.getArea() * 2 + 2 * 3.14 * getRadius() * height;
    }

    @Override
    public String toString(){
        return  "Cylinder[radius=" + String.format("%.1f", getRadius())+ ", "+ "height=" + String.format("%.1f", height) + ", " + "area="+ String.format("%.1f", this.getArea()) + "]";
    }
}

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();   
        sc.nextLine();

        while(t-- > 0){
            String opt = sc.next();
            double radius = sc.nextDouble();
            switch(opt){
                case "Ci": 
                    Circle ci = new Circle(radius);
                    System.out.println(ci);
                    break;
                case "Cy":
                    double height = sc.nextDouble(); 
                    Cylinder cy = new Cylinder(radius, height);
                    System.out.println(cy);
                    break;
            }
        }
    }
}
