package Test2;

public class Ceas {

    public static void main(String args[]) {
        int cat = 0;
        int rest = 0;
        int ora = 21;
        int minute = 12;
        int secunde = 00;

        if(secunde % 2 == 0){
            System.out.println("P");
        }else{
            System.out.println("I");
        }

        cat = ora / 5;
        rest = ora % 5;
        for (int i = 0; i < cat; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < rest; i++) {
            System.out.print("*");
        }
        System.out.println();
        cat = minute / 5;
        rest = minute % 5;
        for (int i = 0; i < cat; i++) {
            System.out.print("*");
        }

        System.out.println();
        for (int i = 0; i < rest; i++) {
            System.out.print("*");
        }


    }
}

