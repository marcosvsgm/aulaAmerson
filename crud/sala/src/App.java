import classes.Produto;
import classes.Tipos;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        Tipos tipo1 = new Tipos(1, "nue");
        Tipos tipo2 = new Tipos(1, "nue");
        Tipos tipo3 = new Tipos(1, "nue");

        Produto prod1 = new Produto(1, 2, "nue", 3, 5);

        System.out.println(tipo1.getNome());
    }
}
