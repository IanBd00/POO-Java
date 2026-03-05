package com.mycompany.creditoedebito;

public class Conta {
    private double saldo, limite;
    private int agencia, numero;

    // Construtor completo
    public Conta(int agencia, int numero, double saldo, double limite){
        this.agencia = agencia;
        this.numero = numero;
        this.limite = limite;
        this.saldo = saldo;        
    }

    // Construtor com saldo inicial
    public Conta(double saldoInicial){
        this.saldo = saldoInicial;
    }

    // Construtor vazio
    public Conta(){
    }

    // Transferência
    public void transferir(Conta destino, double valor){
        debitar(valor);
        destino.creditar(valor);
    }

    // Getter saldo
    public double getSaldo(){
        return saldo;
    }

    // Agência
    public void setAgencia(int agencia){
        this.agencia = agencia;
    } 

    public int getAgencia(){
        return agencia;
    }

    // Número
    public void setNumero(int numero){
        this.numero = numero;
    }

    public int getNumero(){
        return numero;
    }

    // Limite
    public void setLimite(double limite){
        this.limite = limite;
    }

    public double getLimite(){
        return limite;
    }

    // Creditar
    public void creditar(double valor){
        saldo += valor;
    }

    // Debitar
    public void debitar(double valor){
        if(valor > saldo + limite){
            System.out.println("ERRO: Seu saldo é menor que o valor de débito");
        } else {
            saldo -= valor;
        }
    }
}