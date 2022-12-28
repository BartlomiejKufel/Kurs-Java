import NewPackage.Test;

public class Main {
    public static void main(String[] args) {
        int[] tab = {12, 3, 1, 2, 312, 3, -12};
        int[][] tab2 ={{3,4,2},{4,2,8}, {3,9,7}};

        for(int x : tab){
            System.out.println(x);
        }

        fuc();
        checkIsFun(true);
        System.out.println(metoda1(12));

        //przeciążenie metod
        System.out.println(dodawanie(2,4));
        System.out.println(dodawanie(2.4,2.8));

        //stworzenie obiektu
        NewClass cl = new NewClass(15);
        cl.wypiszWiek();

        //wywołanie classy z pakage
        Test tsd = new Test();
        Test ts = new Test("Bartłomiej Kufel", 58,182);
        ts.powitanie();
        ts.info();
    }


    public static void fuc(){
        System.out.println("Fuc u");
    }

    public static void checkIsFun(boolean check){
        if(check){
            System.out.println("Fun jej!");
        }else {
            System.out.println("Not fun :(");
        }
    }

    public static int metoda1(int liczba){
        liczba++;
        return liczba;
    }

    public static int dodawanie(int num1, int num2){
        return num1+num2;
    }

    public static double dodawanie(double num1, double num2){
        return num1+num2;
    }


}