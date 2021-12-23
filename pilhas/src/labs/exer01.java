package labs;

import vetor.Pilha;

import java.util.Scanner;

public class exer01 {
    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<Integer>();

        Scanner input = new Scanner(System.in);

        for(int i = 0; i <= 10; i++){
            System.out.println("Digite um numero :");
            int number = input.nextInt();

            if(number % 2 == 0){
                System.out.println("Empilhando o número :" + number);
                pilha.empilha(number);
            } else {
                Integer desempilha = pilha.desempilhar();
                if(desempilha == null){
                    System.out.println("Pilha está vazia!");
                } else {
                    System.out.println("Número impar, desempilhando um elemento da pilha: " + pilha.desempilhar());
                }
            }
        }

        System.out.println("Todos os números foram lidos, desempilhando números da pilha");

        while(!pilha.estaVazio()){
            Integer desempilha = pilha.desempilhar();

            System.out.println("Desenpilhando um elemento da pilha " + desempilha);
        }
        System.out.println("Todos os elementos foram desempilhados");


    }
}
