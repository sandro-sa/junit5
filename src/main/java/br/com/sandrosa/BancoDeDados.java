package br.com.sandrosa;

import java.util.logging.Logger;

public class BancoDeDados {

    private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());

    public static void iniciarConexa0(){
        LOGGER.info("Inicio conexao");
    }

    public static void finalizouConexa0(){
        LOGGER.info("Finalizou conexao");
    }

    public static void insereDados(Pessoa pessoa){
        //Insere dados no DB
        LOGGER.info("Inseriu dados");
    }

    public static void removeDados(Pessoa pessoa){
        //Remove dados no DB
        LOGGER.info("Removeu dados");
    }
}
