public class EstruturaEstatica<T> {
    private T[] elementos;
    private int tamamho;

    public EstruturaEstatica(int capacidade){
        this.elementos =(T[]) new Object[capacidade];
        this.tamamho =0;
    }

    public EstruturaEstatica(){
        this(10);
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
}
