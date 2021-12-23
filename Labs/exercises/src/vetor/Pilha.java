package vetor;

import base.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica {

    public Pilha(){
        super();
    }

    public Pilha(int capacidade){
        super(capacidade);
    }

    public void empilha(T elemento){
        super.adiciona(elemento);

        // ao invés de reescrever a lógica novamente, podemos chamar o método pronto
        // this.aumentaCapacidade();
        // this.elementos[tamanho] = elemento;
        // tamanho++;
    }

    public T topo(){
        if(this.estaVazio()){
            return null;
        }
        return (T) this.elementos[tamanho-1];
    }

    public T desempilhar(){
        if(this.estaVazio()){
            return null;
        }

        return (T) this.elementos[--tamanho];
        // mesmo código de baixo reescrito acima
        /*
        T elemento = (T) this.elementos[tamanho-1];
        tamanho--;

        return elemento;
         */
    }
}
