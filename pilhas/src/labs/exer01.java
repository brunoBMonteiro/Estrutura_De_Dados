package labs;

import vetor.Pilha;

import java.util.Scanner;

public class exer01 {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<Integer>();

        Scanner input = new Scanner(System.in);

        for(int i = 0; i <= 10; i++){
            System.out.println("Digite um numero :");
            int num = input.nextInt();
        }
    }
}
