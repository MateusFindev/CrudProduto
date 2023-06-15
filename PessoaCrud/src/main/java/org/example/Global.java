package org.example;

import java.util.Random;

public class Global {
    public static String gerarAleatorioCodigo(){
        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 8; i++) {
            int digito = random.nextInt(10);
            sb.append(digito);
        }

        String numeroAleatorio = sb.toString();
        return numeroAleatorio;
    }
}
