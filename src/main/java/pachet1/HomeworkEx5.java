package pachet1;

import java.util.Scanner;

public class HomeworkEx5 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Imput a string:");
        String line = in.nextLine();
        line = line.toLowerCase();
        System.out.println(line);
    }
}
