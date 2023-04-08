package Pito4082023;

public class Kuda extends LivingThing{
    @Override
    public void berjalan(){
        System.out.println("Berjalan Kuda");
    }
    public static void main(String[] args){
        Kuda k = new Kuda();
        k.berjalan();
        k.makan();
        k.bernafas();
    }
}
