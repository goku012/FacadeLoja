import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {
    @Test
    void deveRetornarPendenciaEstoqueCompra() {
        Cliente cliente = new Cliente();
        Estoque.getInstancia().addClientePendente(cliente);

        assertEquals(false, cliente.fazerCompra());
    }

    @Test
    void deveRetornarPendenciaPagamentoCompra() {
        Cliente cliente = new Cliente();
        Pagamento.getInstancia().addClientePendente(cliente);

        assertEquals(false, cliente.fazerCompra());
    }

    @Test
    void deveRetornarPendenciaLogisticaCompra() {
        Cliente cliente = new Cliente();
        Logistica.getInstancia().addClientePendente(cliente);

        assertEquals(false, cliente.fazerCompra());
    }

    @Test
    void deveRetornarClienteSemPendenciaCompra() {
        Cliente cliente = new Cliente();

        assertEquals(true, cliente.fazerCompra());
    }
}