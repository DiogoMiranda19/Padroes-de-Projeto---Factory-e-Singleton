package com.mycompany.lab2;

public class Apple implements FabricanteCelular {

    public  Celular constroiCelular(String modelo){

        if(modelo.equals("Iphone X")){
            return new IphoneX();
        }
        else if(modelo.equals("Iphone S")){
            return new IphoneS();
        }
        else{
            return null;
        }
    }


    
    
}
