package junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class PessoaTest {

    @Test
    void validaSeEstaNulo(){
        Pessoa pessoaNula = null;
        assertNull(pessoaNula);

        Pessoa victor = new Pessoa("Victor", LocalDate.of(1993, 6, 30));
        assertNotNull(victor);
    }

    @Test
    void validarCalculoDeIdade(){
        Pessoa victor = new Pessoa("Victor", LocalDate.of(1993, 6, 30));
        assertEquals(29, victor.getIdade());
    }

    @Test
    void deveRetornarSeEhMaiorDeIdade(){
        /** Maior de idade **/
        Pessoa victor = new Pessoa("Victor", LocalDate.of(1993, 6, 30));
        assertEquals(true, victor.ehMaiorDeIdade());

        /** Menor de idade **/
        Pessoa anthony = new Pessoa("Anthony", LocalDate.now());
        assertEquals(false, anthony.ehMaiorDeIdade());
    }


}
