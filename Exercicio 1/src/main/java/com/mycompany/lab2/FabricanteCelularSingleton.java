package com.mycompany.lab2;

public class FabricanteCelularSingleton {
    
    private static FabricanteCelular instanciaApple;
    private static FabricanteCelular instanciaSamsung;

    private FabricanteCelularSingleton() {}

    public static FabricanteCelular getInstanciaApple() {
        if (instanciaApple == null) {
            instanciaApple = new Apple();
        }
        return instanciaApple;
    }

    public static FabricanteCelular getInstanciaSamsung() {
        if (instanciaSamsung == null) {
            instanciaSamsung = new Samsung();
        }
        return instanciaSamsung;
    }
}




