package ForTestcuAndrei;

public class Main {
    public static void main ( String []args)
    {
       Terra terra = new Terra("atmosfera");
       Mercur mercur = new Mercur (10);
       System.out.println(terra);
       System.out.println(mercur);

       terra.luminaSolara();
       mercur.luminaSolara();
    }
}
