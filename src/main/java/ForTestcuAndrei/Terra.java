package ForTestcuAndrei;

public class Terra extends SistemSolar implements Soare {
    // definirea parametrilor
    public String atmosfera;
    // definirea constructorului pt Terra
    Terra(String atmosfera){
        this.atmosfera = atmosfera;
    }

    @Override
    public void luminaSolara() {
        System.out.println("Terra");
    }

    @Override
    public String toString() {
        return "Terra{" +
                "atmosfera='" + atmosfera + '\'' +
                '}';
    }
}
