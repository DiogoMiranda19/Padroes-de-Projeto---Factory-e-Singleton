package com.mycompany.lab2;

public class Samsung implements FabricanteCelular {
    
    public  Celular constroiCelular(String modelo){

        if(modelo.equals("Galaxy S10")){
            return new Galaxy10();
        }
        else if(modelo.equals("Galaxy S20")){
            return new Galaxy20();
        }
        else{
            return null;
        }
    }




}