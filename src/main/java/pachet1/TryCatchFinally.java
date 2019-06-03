package pachet1;

public class TryCatchFinally {
    public static void main(String[] args){
        checkAge(15);
    }
        /*try{
            int[] myNumbers = {1,2,3};
            System.out.println(myNumbers[10]);
        }catch(Exception e){
            System.out.println("Something went wrong");
        }finally {
            System.out.println("The'try catch'is finnished");
        }
    }*/
    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You Must be at least 18 years old.");
        } else {
            System.out.println("Acces granted - Old Enough!");
        }
    }
}
