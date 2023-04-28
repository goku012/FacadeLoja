public class ClienteFacade {
    public static boolean verificarPendenciasCompra(Cliente cliente) {
        if (Estoque.getInstancia().verificarClienteComPendencia(cliente)) {
            return false;
        }
        if (Pagamento.getInstancia().verificarClienteComPendencia(cliente)) {
            return false;
        }
        if (Logistica.getInstancia().verificarClienteComPendencia(cliente)) {
            return false;
        }
        return true;
    }
}