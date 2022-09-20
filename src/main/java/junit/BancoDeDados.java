package junit;

import java.util.logging.Logger;

public class BancoDeDados {

    private static Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());

    public static void iniciarConexao() {
        LOGGER.info("Iniciando conexao ao banco de dados...");
    }

    public static void finalizarConexao() {
        LOGGER.info("Finalizando conexao ao banco de dados...");
    }

    /**
     * Insere pessoa no DB
     **/
    public static void cadastraPessoa(Pessoa pessoa) {
        LOGGER.info("Cadastro dados no banco...");
    }

    /**
     * Remove pessoa no DB
     **/
    public static void deletaPessoa(Pessoa pessoa) {
        LOGGER.info("Removendo dados no banco...");
    }
}
