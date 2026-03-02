/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.principal;
import java.util.Scanner;

/**
 *
 * @author alunolab13
 */
public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o agência da conta 1: ");
        int agencia = sc.nextInt();
        
        System.out.println("Digite o número da conta 1: ");
        int numero = sc.nextInt();
        
        System.out.println("Digite o saldo inicial da conta 1: ");
        double saldo = sc.nextDouble();
        
        System.out.println("Digite o limite da conta 1: ");
        double limite = sc.nextDouble();
        
        Conta c1 = new Conta(agencia,numero,saldo,limite);
        Conta c2 = new Conta(456,888,1000,800);
        
        c1.transferir(c2, 10000);
        
        System.out.println(c1.getSaldoDisponivel());
        System.out.println(c2.getSaldoDisponivel());
    }
}
