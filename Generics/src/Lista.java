public class Lista<T> {

    private T[] elementos;
    private int tamanho;

    public Lista(int tamanho){
        this.elementos = (T[]) new Object[capacidade]; // fazendo casting segundo livro effective java para pode instanciar genérico
        this.tamanho = 0;
    }

    public boolean adiciona(T elemento){
        this.aumentaCapacidade():
        if(this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = tamanho;
            this.tamanho++;
            return true;
        }
        return false;
    }

    public boolean adiciona(int posicao, T elemento){
        if(!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }
        this.aumentaCapacidade();

        for(int i = this.tamanho-1; i>=posicao; i--){
            this.elementos[i+1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;
        return true;
    }

    private void aumentaCapacidade() {
        if (this.tamanho == this.elementos.length){
            T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
                    for(int i = 0; i < this.elementos.length; i++){
                        elementosNovos[i] = this.elementos[i];
                    }
                    this.elementos = elementosNovos;
        }
    }

    public Object busca(int posicao){
        if(!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.elementos[posicao];
    }

    public int busca(T elemento){
        for(int i = 0; i < this.tamanho; i++){
            if(this.elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }

    public int tamanho(){
        return  this.tamanho;
    }



}
