public class Pilha<T>{

    private T[] elementos;
    private int tamanho;

    public Pilha(int capacidade){
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    public int tamanho(){
        return this.tamanho;
    }

    public String toString(){

    }
}
