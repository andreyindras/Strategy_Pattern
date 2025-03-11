package org.example.entities;

import java.util.Random;

public class BoletoPayment implements PaymentStrategy {

    @Override
    public void processPayment(double amount) {
        System.out.println("Transação via Boleto");
        System.out.println("R$ " + String.format("%.2f", amount));

        int codigoBoleto = new Random().nextInt(100);
        System.out.println("Código do boleto: " + codigoBoleto);
    }
}
