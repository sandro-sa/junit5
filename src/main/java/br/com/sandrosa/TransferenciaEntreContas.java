package br.com.sandrosa;

public class TransferenciaEntreContas {


    public void trasferir(Conta caontaOrigem, Conta caontaDestino, int valor){
       if(valor <= 0){
           throw new IllegalArgumentException("Valor precisa ser maoirque zero");
       }
    }
}
