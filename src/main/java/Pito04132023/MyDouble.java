package Pito04132023;

public class MyDouble implements Relation{
    public boolean isGreater( Object a, Object b){
        return ((double) a > (double) b);
    }
    public boolean isLess( Object a, Object b){
        return ((double) a < (double) b);
    }
    public boolean isEqual( Object a, Object b){
        return ((double) a == (double) b);
    }
}
