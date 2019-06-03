package ForTestcuAndrei;

public class Mercur extends SistemSolar implements Soare {

    private int temperatura;

    // definirea constructorului pt Terra
    Mercur(int temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public void luminaSolara() {
        System.out.println("Mercur");
    }

    @Override
    public String toString() {
        return "Mercur{" +
                "temperatura=" + temperatura +
                '}';
    }
}
