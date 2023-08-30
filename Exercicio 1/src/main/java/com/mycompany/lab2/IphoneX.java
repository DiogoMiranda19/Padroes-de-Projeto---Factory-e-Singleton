package com.mycompany.lab2;

public class IphoneX implements Celular {

    @Override
    public void fazLigacao() {
        System.out.println("Ligação feita do Iphone X com sucesso!");
    }

    @Override
    public void tiraFoto() {
        System.out.println("Foto tirada do Iphone X com sucesso!");
    }
    
}