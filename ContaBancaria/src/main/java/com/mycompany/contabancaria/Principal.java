/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contabancaria;

/**
 *
 * @author alunolab13
 */
public class Principal {

    public static void main(String[] args) {
// Criando titular
        Titular titular = new Titular("Ian", "123345657", "teste@gmail.com");
        
        // Criando notificador
        Notificador notificador = new Notificador("Email");
        
        // =========================
        // TESTE CONTA POUPANÇA
        // =========================
        System.out.println("=== CONTA POUPANÇA ===");
        
        ContaPoupanca poupanca = new ContaPoupanca(0.05, 10, "001", titular, notificador);
        
        poupanca.depositar(1000);
        poupanca.exibir();
        
        poupanca.sacar(200);
        poupanca.renderJuros();
        
        poupanca.exibir();
        
        
        // =========================
        // TESTE CONTA CORRENTE
        // =========================
        System.out.println("\n=== CONTA CORRENTE ===");
        
        ContaCorrente corrente = new ContaCorrente("002", titular, notificador, 500);
        
        corrente.depositar(300);
        corrente.exibir();
        
        corrente.sacarComLimite(600); // usa limite
        corrente.cobrarTarifa();
        
        corrente.exibir();
        
        
        // =========================
        // TESTE TITULAR
        // =========================
        System.out.println("\n=== TITULAR ===");
        titular.exibir();
        
        // =========================
        // TESTE NOTIFICADOR
        // =========================
        System.out.println("\n=== NOTIFICADOR ===");
        notificador.enviarAlerta(titular, "Operação realizada com sucesso!");
        notificador.enviarSaldo(titular, corrente);
    }
}
