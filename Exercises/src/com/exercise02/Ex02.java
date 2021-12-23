package com.exercise02;

import java.util.Scanner;
import java.util.Stack;

public class Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Stack<Integer> par = new Stack<Integer>();
        Stack<Integer> impar = new Stack<Integer>();

        for(int i = 1; i <= 10; i++){
            System.out.println("Digite um numero : ");
            int numberEntry = input.nextInt();

            if(numberEntry == 0){

                // pilha par
                Integer desempilhar = par.pop();

                if(desempilhar == null){
                    System.out.println("Pilha está vazia");
                }else {
                    System.out.println("Desempilhando da pilha : " + desempilhar);
                }

                // pilha impar
                desempilhar = impar.pop();

                if(desempilhar == null){
                    System.out.println("Pilha está vazia");
                }else {
                    System.out.println("Desempilhando da pilha : " + desempilhar);
                }

            } else if (numberEntry % 2 == 0){
                System.out.println("O numero é par " + numberEntry);
                par.push(numberEntry);
            }else {
                System.out.println("o numero é impar " + numberEntry);
                impar.pop();
            }

        }

        System.out.println("Desempilhando todos os números da pilha par");

        while (!par.isEmpty()){
            System.out.println("Desempilhando da pilha par : " + par.pop());
        }

        System.out.println("Desempilhando todos os números da pilha impar");

        while (!impar.isEmpty()){
            System.out.println("Desempilhando da pilha par : " + impar.pop());
        }


    }
}
