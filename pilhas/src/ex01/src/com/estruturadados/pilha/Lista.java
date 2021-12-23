package com.estruturadados.pilha;

import java.lang.reflect.Array;

public class Lista<T> {

    private T[] elementos;
    private int tamanho;

    public Lista(int capacidade){
        this.elementos =(T[]) new Object[capacidade];
        this.tamanho =0;
    }

    public Lista(){
        this(10);
    }

    public Lista(int capacidade, Class<T> tipoClasse){
        this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
        this.tamanho = 10;
    }

    public int tamanho(){
        return this.tamanho;
    }

    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("[");

        for(int i =  0; i < this.tamanho-1; i++){
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if(this.tamanho > 0){
            s.append(this.elementos[this.tamanho-1]);
        }

        s.append("}");

        return s.toString();
    }

    public boolean adiciona(T elemento){
        this.aumentaCapacidade();
        if(this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
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

        for (int i = this.tamanho-1; i >= posicao; i--){
            this.elementos[i+1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;

        return true;
    }

    private void aumentaCapacidade(){
        if(this.tamanho == this.elementos.length){
            T[] elementosNovos = (T[]) new Object[this.elementos.length];
            for(int i =0; i < this.elementos.length; i++){
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }



}
