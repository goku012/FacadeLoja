import java.text.Normalizer;
public class Cliente {
    public boolean fazerCompra() {
        return ClienteFacade.verificarPendenciasCompra(this);
    }
}