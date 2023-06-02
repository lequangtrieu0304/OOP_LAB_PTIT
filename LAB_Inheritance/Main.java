import java.util.Scanner;

class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle(){
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public String getColor(){
        return color.toUpperCase();
    }

    public void setColor(String color){
        this.color = color;
    }

    public double getArea(){
        return 3.14*radius*radius;
    }

    public String toString(){
        return "Circle[radius="+ radius +",color="+ color + "]";
    }
}

class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder(){
        super();
    }

    public Cylinder(double height){
        super();
        this.height = height;
    }

    public Cylinder(double radius, double height){
        super(radius);
        this.height = height;
    }
    public Cylinder(double radius, double height, String color){
        super(radius, color);
        this.height = height;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getVolume(){
        return super.getArea() * height;
    }
    public String toString(){
        return 
            "Cylinder: " + "radius=" + String.format("%.1f, ", getRadius()) + "height=" + String.format("%.1f, ", height) + getColor() + ", volume=" + String.format("%.1f", getVolume());
    }
}

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        
        while(t-- > 0){
            int opt = sc.nextInt();
            switch(opt){
                case 0: 
                    Cylinder cy = new Cylinder();
                    System.out.println(cy);
                    break;
                case 1:
                    double height = sc.nextDouble();
                    Cylinder cy1 = new Cylinder(height);
                    System.out.println(cy1);
                    break;
                case 2:
                    double radius2 = sc.nextDouble();
                    double height2 = sc.nextDouble();
                    Cylinder cy2 = new Cylinder(radius2, height2);
                    System.out.println(cy2);
                    break;
                case 3:
                    double radius3 = sc.nextDouble();
                    double height3 = sc.nextDouble();
                    String color = sc.nextLine().replaceFirst(" ", "");
                    Cylinder cy3 = new Cylinder(radius3, height3, color);
                    System.out.println(cy3);
                    break;
            }
        }
    }
}
