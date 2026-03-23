/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contabancaria;

/**
 *
 * @author alunolab13
 */
public class Conta {
    private String numeroConta;
    protected double saldo;
    private Titular titular;
    private Notificador notificador = new Notificador();
    
    public Conta(String numeroConta, Titular titular, Notificador notificador){
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.notificador = notificador;
    }

    public double getSaldo(){
        return saldo;
    }
    
    public String getNumero(){
        return numeroConta;
    }
    
    public Titular titular(){
        return titular;
    } 
    
    public void depositar(double valor){
        saldo += valor;
    }
    
    public boolean sacar(double valor){
        if(valor <= 0){
            System.out.println("Valor inserido incorreto!");
            return false;
        }
        if(saldo >= valor){
            System.out.println("Saque realizado com sucesso!");
            saldo -= valor;
            return true;
        }else{
            System.out.println("Saldo insuficiente para realizar o saque!");
            return false;
        }
        
    }
    
    public void exibir(){
        System.out.println("Número da Conta: " + numeroConta + "\nTitular: " + titular + "\nSaldo: R$ " + saldo);
    }
    
    public void consultarSaldo(){
        notificador.enviarSaldo(titular, this);
    }
    
}
