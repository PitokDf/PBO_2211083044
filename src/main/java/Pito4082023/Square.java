package Pito4082023;

public class Square extends Shapes{
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    public String getname() {
        return "Square";
    }

    public double getSide() {
        return side;
    }
    public static void main(String[] args) {
        Square s =new Square(0);
        System.out.println(s.getname()+"\nArea : "+s.getArea()+"\nSisi : "+s.getSide());
    }
}
