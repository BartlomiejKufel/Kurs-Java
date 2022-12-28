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
}