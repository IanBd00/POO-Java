/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contabancaria;

/**
 *
 * @author alunolab13
 */
public class ContaPoupanca extends Conta {
    private double taxaJuros;
    private int diaAniversario;
    private double rendimento;
   
    public ContaPoupanca(double taxaJuros, int diaAniversario, String numeroConta, Titular titular, Notificador notificador){
        super(numeroConta, titular, notificador);
        this.taxaJuros = taxaJuros;
        this.diaAniversario = diaAniversario;
    }
    
    public double getTaxaJuros(){
        return taxaJuros;
    }
    
    public int getDiaAniversario(){
        return diaAniversario;
    }
    
    public void setTaxaJuros(double taxaJuros){
        this.taxaJuros = taxaJuros;
    }
    
    public void renderJuros(){
        rendimento = (1 + taxaJuros) * saldo;
        System.out.println("Sua conta rendeu: R$ " + rendimento);
    }
    
    @Override
    public boolean sacar(double valor){
        if(valor <= 0){
            System.out.println("Valor de saque Indefinido.");
            return false;
        } if (valor <= saldo){
            System.out.println("Saque realizado com sucesso!");
            saldo -= valor;
            return true;
        } else{
            System.out.println("Saldo não disponível para saque");
            return false;
        }
    }
        
    @Override
    public void exibir(){
        super.exibir();
        System.out.println("\nTaxa de Juros: " + taxaJuros + "\nDia de aniversário: " + diaAniversario);
    }
    
}
