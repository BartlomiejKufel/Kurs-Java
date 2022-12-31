package Egzamin;

public class Kolo extends ksztalt2D{

    public Punkt Sr;
    public double r;

    public Kolo(Punkt sr, double r) {
        Sr = sr;
        this.r = r;
    }

    @Override
    public double obwod() {
        return 2 * Math.PI * r;
    }

    @Override
    public void show(){
        System.out.println("Obwód koła: "+ obwod());
    }
}
