package Pito4082023;

public class Circle extends Shapes{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public String getname() {
        return "Circle";
    }

    public double getRadius() {
        return radius;
    }
    public static void main(String[] args){
        Circle c = new Circle(1);
        System.out.println(c.getname()+"\nArea : "+c.getArea()+"\nRadius : "+c.getRadius());
    }
}
