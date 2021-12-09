package com.bruno.estruturadados.vetor;

import java.lang.reflect.Array;
import java.util.Vector;

public class Teste {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);

        vetor.adiciona("Elemento na 0");
        vetor.adiciona("Elemento na 1");

        // Vai exibir a quantia de elementos adicionados no vetor
        System.out.println(vetor.tamanho());


        System.out.println(vetor);

        // Imprimir todos elementos do vetor
        System.out.println(vetor.toString());


    }
}
