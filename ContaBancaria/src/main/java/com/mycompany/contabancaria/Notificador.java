/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contabancaria;

/**
 *
 * @author alunolab13
 */
public class Notificador {
    private String canal;
    private Titular titular;
    private Conta saldo;
    
    public Notificador(String canal){
        this.canal = canal;
    }
    
    public Notificador(){
    }
    
    public String getCanal(){
        return canal;
    }
    
    public void enviarSaldo(Titular titular, Conta saldo){
        System.out.println("Saldo: R$ " + saldo);
    }
    
    public void enviarAlerta(Titular titular, String msg){
        System.out.println("Mensagem: " + msg);
    }
}
