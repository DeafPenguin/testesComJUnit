package junit;

import org.junit.jupiter.api.*;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ConsultarDadosDePessoasTest {

    @BeforeAll
    static void configuraConexao() {
        BancoDeDados.iniciarConexao();
    }

    @BeforeEach
    void insereDadosParaTeste() {
        BancoDeDados.cadastraPessoa(new Pessoa("Victor", LocalDate.of(1993, 6, 30)));
    }

    @AfterEach
    void removeDadosDoTeste() {
        BancoDeDados.deletaPessoa(new Pessoa("Victor", LocalDate.of(1993, 6, 30)));
    }

    @AfterAll
    static void finalizaConexao() {
        BancoDeDados.finalizarConexao();
    }

    @Test
    void validarDadosDeRetorno() {
        assertTrue(true);
    }

    @Test
    void validarDadosDeRetorno2() {
        assertTrue(true);
    }
}
