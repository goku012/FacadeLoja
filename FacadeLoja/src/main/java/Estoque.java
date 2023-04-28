import java.util.ArrayList;

public class Estoque extends Setor {
    private static Estoque estoque = new Estoque();

    private Estoque() {};

    public static Estoque getInstancia() {
        return estoque;
    }
}