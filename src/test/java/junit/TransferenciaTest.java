package junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TransferenciaTest {

    @Test
    void validarCenarioDeExcecaoNaTransferencia() {
        Conta contaOrigem = new Conta("12345", 0);
        Conta contaDestino = new Conta("56789", 100);

        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();

        /** Lança exceção para transferência menor ou igual a zero **/
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                transferenciaEntreContas.transfere(contaOrigem, contaDestino, -1));

        /** Não lança exceção para transferência maior que zero **/
        Assertions.assertDoesNotThrow(
                () -> transferenciaEntreContas.transfere(contaOrigem, contaDestino, 20)
        );
    }
}
