package pachet1;


public class balarii {
    public static void main(String[] args) {
        int x=10;
        int y=15;
        if(x<y){
            System.out.println("X is greater than Y");
        }

        if(x>y){
            System.out.println("X is lower than Y");
        }
        if(x<y)
            System.out.println("X is greater than Y");
        else
            System.out.println("X is lower than Y");

        int z = x-y;
        int t = x+y;
        switch (z) {
            case 1: z = 3;
            System.out.println(y);
            break;
            case 2: z = 9;
                System.out.println(x);
                break;
            case 3: z = -5;
                System.out.println(t);
                break;
            default: System.out.println("sorry... try again");
            break;
        }
    }


}
