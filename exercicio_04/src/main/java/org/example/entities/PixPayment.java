package org.example.entities;

import java.util.Random;

public class PixPayment implements PaymentStrategy{

    @Override
    public void processPayment(double amount) {
        System.out.println("Transação via Pix");
        System.out.println("R$ " + String.format("%.2f", amount));

        int codigoPix = new Random().nextInt(100);
        System.out.println("Código Pix: " + codigoPix);
    }
}
