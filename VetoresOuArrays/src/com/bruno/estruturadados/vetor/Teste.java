package com.bruno.estruturadados.vetor;

import java.lang.reflect.Array;
import java.util.Vector;

public class Teste {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);

        /*
        vetor.adiciona("Elemento na 0");
        vetor.adiciona("Elemento na 1");

        System.out.println("=============================");
        // Vai exibir a quantia de elementos adicionados no vetor
        System.out.println(vetor.tamanho());
        System.out.println(vetor);

        System.out.println("=============================");
        // Imprimir todos elementos do vetor
        System.out.println(vetor.toString());

        System.out.println("=============================");
        // método de busca
        System.out.println(vetor.busca(1));
        // Exception
        //System.out.println(vetor.busca(12));

        System.out.println("=============================");
        // Verificando se o elemento existe
        System.out.println(vetor.busca("Elemento na 2"));
        */

        // Adicionando elementos no vetor
        // Adicionando elementos em posições aleatórias do vetor
        System.out.println("=================================");

        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("E");
        vetor.adiciona("F");
        vetor.adiciona("G");

        System.out.println(vetor);

        vetor.adicionaEmPosicaoEspecifica(0, "A");
        System.out.println(vetor);
        System.out.println("================================");

        vetor.adicionaEmPosicaoEspecifica(1, "B");
        vetor.adicionaEmPosicaoEspecifica(2, "C");
        vetor.adicionaEmPosicaoEspecifica(3, "D");
        vetor.adicionaEmPosicaoEspecifica(4, "E");
        vetor.adicionaEmPosicaoEspecifica(5, "F");
        System.out.println(vetor);

        System.out.println("================================");

        System.out.println(vetor.tamanho());

    }
}
