package Abstract;

public class Pies extends Ssak{
    public Pies(String nazwa, int wiek) {
        super(nazwa, wiek);
    }

    @Override
    public void wydajDzwiek(){
        System.out.println("Hau Hau");
    }
}
