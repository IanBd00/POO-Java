/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contabancaria;

/**
 *
 * @author alunolab13
 */
public class ContaCorrente extends Conta {
    private double limite;
    private int diaVencimento;
    private static final double TARIFA = 0.01;

    public ContaCorrente(String numeroConta, Titular titular, Notificador notificador, double limite) {
        super(numeroConta, titular, notificador);
        this.limite = limite;
    }
    
    public double getLimite(){
        return limite;
    }
    
    public void setLimite(double limite){
        this.limite = limite;
    }
    
    public boolean sacarComLimite(double valor){
        if(valor <= 0){
            System.out.println("Valor inserido inválido!");
            return false;
        }
        if(valor <= saldo + limite){
            System.out.println("Saque realizado com sucesso!");
            saldo -= valor;
            return true;
        } else{
            System.out.println("Limite indisponível!");
            return false;
        }
    }
    
    public void cobrarTarifa(){
        if(TARIFA <= 0){
            System.out.println("Tarifa Inválida!");
        }
        if(saldo >= TARIFA){
            System.out.println("Cobrança da tarifa realizada com sucesso!");
            saldo -= TARIFA;
        }else{
            System.out.println("Tarifa incorreta!");
        }        
    }
    
    @Override
    public void exibir(){
        super.exibir();
        System.out.println("\nLimite: R$" + limite + "\nData de Vencimento: " + diaVencimento);
    }
}
