package org.example;

import org.example.entities.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---Selecione o método de pagamento---");
        System.out.println("(1) - Pix \n(2) - Cartão de Crédito \n(3) - Boleto");
        int op = sc.nextInt();

        System.out.print("Digite o valor a pagar: ");
        double amount = sc.nextDouble();

        PaymentStrategy paymentStrategy = null;

        switch (op) {
            case 1:
                paymentStrategy = new PixPayment();
                break;
            case 2:
                paymentStrategy = new CreditCardPayment();
                break;
            case 3:
                paymentStrategy = new BoletoPayment();
                break;
            default:
                System.out.println("Opção inválida");
        }

        PaymentProcessor paymentProcessor = new PaymentProcessor(paymentStrategy);
        paymentProcessor.processPayment(amount);

        sc.close();
    }
}