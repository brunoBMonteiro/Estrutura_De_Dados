package teste;

import vetor.Pilha;
import java.util.Stack;

public class PilhaTeste {
    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<Integer>();
        Stack<Integer> stack = new Stack<Integer>();


        System.out.println("A pilha está vazia");
        System.out.println(pilha);

        System.out.println("tamanho da pilha 0");
        System.out.println(pilha.tamanho());


        for(int i = 0; i <= 10; i++){
            pilha.empilha(i);
        }

        System.out.println("A pilha está com tamanho 10");
        System.out.println(pilha);

        System.out.println("o tamanho da pilha é 10");
        System.out.println(pilha.tamanho());

        System.out.println("Retorna o ultimo elemento da pilha");
        System.out.println(pilha.topo());

        System.out.println("Desempilhar elementos");
        System.out.println(pilha);
        System.out.println(pilha.desempilhar());
        System.out.println(pilha);
        System.out.println(pilha.desempilhar());
        System.out.println(pilha);

        System.out.println("----------------------------");

        // ----------------------WITH STACK---------------
        System.out.println("With STACK");

        System.out.println(stack);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.peek());
    }
}
