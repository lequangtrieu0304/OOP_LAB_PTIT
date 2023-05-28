class Circle {
    double r = 1.0;
    String color = "red";

    public double getId(){
        return r;
    }

    public String getColor(){
        return color;
    }

    public double getArea(){
        return Math.PI * this.r * this.r;
    }
}

public class Main {
    public static void main(String[] args){
        Circle c = new Circle();
        System.out.println(c.getId()+ " " + c.getColor());
        System.out.println(c.getArea());
    }
}
