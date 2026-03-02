/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

/**
 *
 * @author alunolab13
 */
public class Conta {
    private double saldo, limite;
    private int agencia, numero;
    
    public Conta(){    
    }

    public Conta(int agencia, int numero, double saldo, double limite) {
        this.saldo = saldo;
        this.limite = limite;
        this.agencia = agencia;
        this.numero = numero;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }
    
    public void creditar(double valor){
        saldo += valor;
    }
    
    public double getSaldoDisponivel(){
        return saldo + limite;
    }
    
    public boolean debitar(double valor){
        if(valor <= getSaldoDisponivel()){
            saldo -= valor;
            return true;
        } else{
            System.out.println("ERRO: SALDO INDISPONÍVEL");
            return false;
        }
    }
    
    public boolean transferir(Conta destino, double valor){
        if(this.debitar(valor)){
            destino.creditar(valor);
            return true;
        } else{
            System.out.println("Transferência não autorizada");
            return false;  
        }
    }
    
}
