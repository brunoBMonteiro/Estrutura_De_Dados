import java.lang.reflect.Array;

public class Lista<T> {

    private T[] elementos;
    private int tamamho;

    public Lista(int capacidade){
        this.elementos =(T[]) new Object[capacidade];
        this.tamamho =0;
    }

    public Lista(){
        this(10);
    }

    public Lista(int capacidade, Class<T> tipoClasse){
        this.elementos = Array.newInstance(tipoClasse, capacidade);
        this.tamamho = 10;
    }

    public int tamanho(){
        return this.tamamho;
    }

    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("[");

        for(int i =  0; i < this.tamamho-1; i++){
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if(this.tamamho > 0){
            s.append(this.elementos[this.tamamho-1]);
        }

        s.append("}");
    }

    public boolean adiciona(T elemento){
        this.aumentaCapacidade();
        if(this.tamamho < this.elementos.length){
            this.elementos[this.tamamho] = elemento;
            this.tamamho++;
            return true;
        }
        return false;
    }

    public boolean adiciona(int posicao, T elemento){
        if(!(posicao >= 0 && posicao < tamamho)){
            throw new IllegalArgumentException("Posição inválida");
        }
        this.aumentaCapacidade();

        for (int i = this.tamamho-1; i >= posicao; i--){
            this.elementos[i+1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamamho++;

        return true;
    }

    private void aumentaCapacidade(){
        if(this.tamamho == this.elementos.length){
            T[] elementosNovos = (T[]) new Object[this.elementos.length];
            for(int i =0; i < this.elementos.length; i++){
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }



}
