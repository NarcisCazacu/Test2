package pachet1;

public class HomeworkEx1 {
     public static void main(String[] args){
         final double width = 6;
        final double height = 16;

        double perimeter = 2*(height+width);
        System.out.printf("Perimeter is 2*(%.1f + %.1f)=%.2f\n", height,width, perimeter);

        double area = width * height;
        System.out.printf("Area is %.1f * %.1f = %.2f\n",height,width, perimeter);
     }
    }
