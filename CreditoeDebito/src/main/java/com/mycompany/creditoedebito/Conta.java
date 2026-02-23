/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.creditoedebito;

/**
 *
 * @author alunolab13
 */
public class Conta {
    private double saldo, limite;
    private int agencia, numero;
    
    public Conta(int agencia, int numero, double saldo, double limite){
        this.agencia = agencia;
        this.numero = numero;
        this.limite = limite;
        this.saldo = saldo;        
        
    }
    
    public Conta(double saldoInicial){
        this.saldo = saldoInicial;
    }
    
    public void transferir(Conta destino, double valor){
        debitar(valor);
        destino.creditar(valor);
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void setAgencia(int agencia){
        this.agencia = agencia;
    } 
    
    public int getAgencia(){
        return agencia;
    }
    
    
    public void setNumero(int numero){
        this.numero = numero;
    }
    
    public int getNumero(){
        return numero;
    }
    
    public double setLimite(double limite){
        this.limite = limite;
    }
    
    public double getLimite(){
        return limite;
    }
    
    public Conta(){
        
    }
    
    
    public void creditar(double valor){
        saldo += valor;
    }
    
    public void debitar(double valor){
        if(valor > saldo + limite){
        System.out.prinln("ERRO: Seu saldo é menor que o valor de débito");
        } else{
        saldo -= valor;
    }
    }
}
