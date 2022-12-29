package Zadania;

public class zadania {
    public static void main(String[] args) {

        //zadanie 1
        Motocykle mt = new Motocykle(200);
        System.out.println(mt);

        SportMotocykle smt = new SportMotocykle();
        System.out.println(smt);

        //zadanie 2
        Building bd = new Building("Jasło", 12,"Duży" );
        System.out.println(bd);

        House hm = new House("Krosno", 27, "Mały", "Kacper Wolski");
        System.out.println(hm);

        Warehouse wr = new Warehouse("Kraków", 36, "Średni", true);
        System.out.println(wr);

    }
}
