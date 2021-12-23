import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Pilha<Integer> par = new Pilha<Integer>();
        Pilha<Integer> impar = new Pilha<Integer>();

        for(int i = 0; i <= 10; i++){
            System.out.println("Digite um numero :");
            int numberEntry = input.nextInt();

            if(numberEntry %% 2 == 0){

            }
        }
    }
}
