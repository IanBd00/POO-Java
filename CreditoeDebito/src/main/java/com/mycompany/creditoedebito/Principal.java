/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.creditoedebito;
import javax.swing.JOptionPane;
import java.util.ArrayList;

//import java.util.Scanner;

/**
 *
 * @author alunolab13
 */
public class Principal {

    public static void main(String[] args) {
        ArrayList<Conta> contas = new ArrayList<>();
        int select = -1;
        int i = 0;
        
        while(1 > 0){
        select = Integer.parseInt(JOptionPane.showInputDialog("Menu\n 1- Criar Conta\n 2- Creditar\n 3- Debitar\n 4- Transferir\n 5- Relatório de Transações\n 6- Deletar Conta\n 7- Sair"));
            if(select == 1){
                int agencia = Integer.parseInt(JOptionPane.showInputDialog("Insira nº da agência:"));
                int numero = Integer.parseInt(JOptionPane.showInputDialog("Insira nº da conta:"));
                double saldo = Double.parseDouble(JOptionPane.showInputDialog("Insira nº da agência:"));
                double limite = Double.parseDouble(JOptionPane.showInputDialog("Insira nº da agência:"));
            }
        }
        
        
        
        
        
//        double valorCreditar = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser creditado em c1: "));
//        double valorDebitar = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser debitado em c1: "));        
//        double valorTransferir = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser transferido: "));
//        
//        contas[0].debitar(valorDebitar);
//        contas[0].creditar(valorCreditar);        
//        contas[0].transferir(contas[1],valorTransferir);
//        
//        JOptionPane.showMessageDialog(null, contas[0].getSaldo());
        
    }
}
