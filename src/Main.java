public class Main {
    public static void main(String[] args) {
       String str1 = "lakson";
       String str2 = "lotoks";

       String result = str1.substring(0, str1.length() / 2) + str2.substring(str2.length() / 2, str2.length() );



        System.out.println(result);
        double a = 8;
        double b = 2;
        System.out.println(Main.add(a,b));
        System.out.println(Main.sub(a,b));
        //mult
        //div
        System.out.println(Main.mult(a,b));
        System.out.println(Main.div(a,b));
        System.out.println(Main.convert(100));
        boolean isWeekend = true;
        boolean isRain = true;
        boolean canWalk = isWeekend == true && isRain == false;
        System.out.println(canWalk);
        boolean isEdekaOpen = false;
        boolean isReweOpen = true;
        System.out.println(Main.canBuy(isEdekaOpen, isReweOpen));
        int temperatura1 = 150;
        int temperatura2 = 75;

        System.out.println(Main.device(temperatura1 , temperatura2));



    }
    private static boolean isEven(String s) {
        return s.length() % 2 == 0;
    }

    private static double add(double a, double b) {
        return a + b;
    }
    private static double sub(double a, double b) {
        return a - b;
    }
    private static double mult(double a, double b) {
        return a * b;
    }
    private static double div(double a, double b) {
        return a / b;
    }
    private static double convert(double amount) {
        return amount * 1.08;

    }
    private static boolean canBuy(boolean isEdekaOpen, boolean isReweOpen) {
        return isEdekaOpen == true || isReweOpen == true;


    }
    private static boolean device(int t1 , int t2) {
        return t1 > 100 && t2 < 100;


    }
}