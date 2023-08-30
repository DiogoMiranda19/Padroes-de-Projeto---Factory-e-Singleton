package com.mycompany.lab2;

public class IphoneS implements Celular {

    @Override
    public void fazLigacao() {
        System.out.println("Ligação feita do Iphone S com sucesso!");
    }

    @Override
    public void tiraFoto() {
        System.out.println("Foto tirada do Iphone S com sucesso!");
    }
    
}