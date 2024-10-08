package br.com.sandrosa;

public class Conta {

    private String numeroConta;
    private int saldo;

    public Conta(String numeroConta, int saldo){
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public int getSaldo(){
        return saldo;
    }
}
