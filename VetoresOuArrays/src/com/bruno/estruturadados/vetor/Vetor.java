package com.bruno.estruturadados.vetor;

import java.util.Arrays;

public class Vetor {
    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade){
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    // Adicionando elemento no vetor
    /*
    public void adiciona(String elemento){
        for(int i =0; i<this.elementos.length; i++){
            if(this.elementos[i] == null){
                this.elementos[i] = elemento;
                break;
            }
        }
    }
     */

    // Adicionando elemento no vetor
    /*
    public void adiciona(String elemento) throws Exception {
        if(this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        } else {
            throw new Exception("Vetor já está cheio!");
        }
    }
     */

    // Adicionando elemento no vetor
    public boolean adiciona(String elemento){
        if(this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    // Vai exibir a quantia de elementos adicionados no vetor
    public int tamanho(){
        return this.tamanho;
    }


    // Sem o toString exibe a referencia a memória hasCode
    // Imprimir todos elementos do vetor
    /*
    public String toString(){
        return Arrays.toString(elementos);
    }
     */

    public String toString(){

        StringBuilder s = new StringBuilder();
        s.append("[");

        for(int i = 0; i < this.tamanho-1; i++){
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if(this.tamanho>0){
            s.append(this.elementos[this.tamanho-1]);
        }
        s.append("]");

        return s.toString();
    }

    // Método de busca por posição do vetor
    public String busca(int posicao){
        if (!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição inválida!");
        }
        return this.elementos[posicao];
    }

    // verifica se o elemento existe, e sobrecarregando método
    public boolean busca(String elemento){
        for (int i = 0; i<this.tamanho; i++){
            if(this.elementos[i].equals(elemento)){
                return true;
            }
        }
        return false;
    }


    // Adicionar em posição especifica do vetor

    // 0 1 2 3 4 5 6 = tamanho é 5
    // B C E F G + +

    public boolean adicionaEmPosicaoEspecifica(int posicao, String elemento){
        if (!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição inválida!");
        }

        // mover todos elementos
        for(int i=this.tamanho-1; i>posicao; i--){
            this.elementos[i+1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;

        return true;
    }
}
