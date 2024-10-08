package br.com.sandrosa;

public class Calculator {

    private int a;
    private int b;

    public Calculator(){
    }

    public int add(int a,int b){

        return a + b;
    }

    public int dividir(int a,int b){

        if(b == 0){
            throw new ArithmeticException("Divisão por zero");
        }

        return a / b;
    }


}
