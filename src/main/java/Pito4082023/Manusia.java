package Pito4082023;

public class Manusia extends LivingThing{
    @Override
    public void berjalan(){
        System.out.println("Berjalan Manusia");
    }
    public static void main(String[] args){
        Manusia m = new Manusia();
        m.bernafas();
        m.makan();
        m.berjalan();
    }
}
