package com.arrayList.metodos;

import java.util.ArrayList;

public class ArrayListExemplo {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("A");
        arrayList.add("B");

        System.out.println(arrayList);

        arrayList.add(2, "C");
        arrayList.add(3, "D");

        System.out.println(arrayList.lastIndexOf("D"));

        arrayList.remove("A");
        System.out.println(arrayList);


        /*
            formas de limpar o array
        // opção 01
        this.elementos = (T[]) new Object(this.elementos.lenght)

        // opção 02
        this.tamanho = 0;

        // opção 03
        for(int i =0; i < this.tamanho; i++){
            this.elementos[i] = null;
        }
        this.tamanho = 0;

         */
        arrayList.clear();
        System.out.println(arrayList);

    }


}

