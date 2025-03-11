package org.example.entities;

import java.util.Scanner;

public class CreditCardPayment implements PaymentStrategy {

    @Override
    public void processPayment(double amount) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número do cartão: ");
        String numCartao = sc.next();

        System.out.println("Transação via Cartão de Crédito");
        System.out.println("R$ " + String.format("%.2f", amount));

        sc.close();
    }
}
