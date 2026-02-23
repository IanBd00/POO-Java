/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.creditoedebito;

/**
 *
 * @author alunolab13
 */
public class Principal {

    public static void main(String[] args) {
        Conta c1 = new Conta(123,6630,5000);
        Conta c2 = new Conta();
        c2.setAgencia(124);
        c2.setNumero(550);
        c2.creditar(15000);

        c1.transferir(c2, 4000);
        
        
        System.out.println("Saldo c1: R$" + c1.getSaldo());
        System.out.println("Saldo c2: R$" + c2.getSaldo());
        
        
        
    }
}
