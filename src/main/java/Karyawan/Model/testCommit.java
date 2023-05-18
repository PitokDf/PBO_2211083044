package Karyawan.Model;

public class testCommit {
    public static void main(String[] args) {
        System.out.println("hello dunia, apa kabar");
        System.out.println("test ke-2 Commit");
        int a = 10;
        System.out.println();
        rekur(a);

    }

    public static void rekur(int a) {
        if (a < 1) {
            System.out.println();
        } else {
            rekur(a - 1);
            System.out.print(a + " ");
        }

    }
}
