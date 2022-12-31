package Egzamin;

public class Trojkat extends ksztalt2D{

    public Punkt A;
    public Punkt B;
    public Punkt C;

    private double a;
    private double b;
    private double c;

    public Trojkat() {
        A = new Punkt(0,0);
        B = new Punkt(2, -2);
        C = new Punkt(2,2);

        boki();
    }

    public Trojkat(Punkt a, Punkt b, Punkt c) {
        A = a;
        B = b;
        C = c;

        boki();
    }

    public Trojkat(double Ax, double Ay, double Bx, double By, double Cx, double Cy){
        A = new Punkt(Ax, Ay);
        B = new Punkt(Bx, By);
        C = new Punkt(Cx, Cy);

        boki();
    }

    private void boki(){
        a=Math.sqrt(Math.pow(C.x- B.x,2 )+Math.pow(C.y-B.y,2));
        b=Math.sqrt(Math.pow(A.x- C.x,2 )+Math.pow(A.y-C.y,2));
        c=Math.sqrt(Math.pow(A.x- B.x,2 )+Math.pow(A.y-B.y,2));
    }


    @Override
    public double obwod() {
        return a+b+c;
    }

    @Override
    public void show(){
        System.out.println("Obwód trójkąta: "+ obwod());
    }

    public double getA() {
        return a;
    }

    public double getC() {
        return c;
    }

    public double getB() {
        return b;
    }

    public void setPunkty(Punkt A, Punkt B, Punkt C){
        this.A = A;
        this.B = B;
        this.C = C;
        boki();
    }
}
