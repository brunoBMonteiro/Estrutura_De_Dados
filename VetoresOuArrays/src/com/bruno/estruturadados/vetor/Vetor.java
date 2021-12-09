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



}
