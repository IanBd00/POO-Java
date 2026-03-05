/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.creditoedebito;
//import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author alunolab13
 */
public class Principal {

    public static void main(String[] args) {
        Conta[] contas = new Conta[2];
        int[] agencia = new int[2];
        int[] numero = new int[2];
        double[] saldo = new double[2];
        double[] limite = new double[2];
        
        for(int i = 0; i < contas.length; i++){
        agencia[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite a agência da conta " + (i+1) + ":", agencia[i]));
        numero[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta " + (i+1) + ":", numero[i]));
        saldo[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo da conta " + (i+1) + ":", saldo[i]));
        limite[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o limite da conta " + (i+1) + ":", limite[i]));
        
        contas[i] = new Conta(agencia[i], numero[i], saldo[i], limite[i]);
        }
        
        double valorCreditar = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser creditado em c1: "));
        double valorDebitar = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser debitado em c1: "));        
        double valorTransferir = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser transferido: "));
        
        contas[0].debitar(valorDebitar);
        contas[0].creditar(valorCreditar);        
        contas[0].transferir(contas[1],valorTransferir);
        
        JOptionPane.showMessageDialog(null, contas[0].getSaldo());
        
    }
}
