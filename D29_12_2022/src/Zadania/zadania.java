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

        //zadanie 3
        Samochod sm = new Samochod(270, 1708);
        Audi au = new Audi(260, 3456);
        BMW bmw = new BMW(400, 4512);
        Skoda sk = new Skoda(123,1233);


    }
}
