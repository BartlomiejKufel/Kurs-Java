package Egzamin;

public class Main {
    public static void main(String[] args) {
        Trojkat tr = new Trojkat();
        System.out.println("Długość a:"+tr.getA());
        System.out.println("Długość b:"+tr.getB());
        System.out.println("Długość c:"+tr.getC());

        tr.setPunkty(new Punkt(-1, 0.3), new Punkt(-1, 2.3), new Punkt(3,1.3));

        System.out.println("\nDługość a:"+tr.getA());
        System.out.println("Długość b:"+tr.getB());
        System.out.println("Długość c:"+tr.getC());
        tr.show();

        System.out.println("");

        Kolo k = new Kolo(new Punkt(0,0), 1);
        k.show();
    }
}
