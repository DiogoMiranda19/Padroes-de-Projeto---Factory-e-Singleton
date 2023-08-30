package com.mycompany.lab2;

import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o fabricante (Apple ou Samsung): ");
        String fabricante = scanner.nextLine();

        FabricanteCelular fabrica;

        if (fabricante.equalsIgnoreCase("Apple")) {
            fabrica = FabricanteCelularSingleton.getInstanciaApple();
        } else if (fabricante.equalsIgnoreCase("Samsung")) {
            fabrica = FabricanteCelularSingleton.getInstanciaSamsung();
        } else {
            System.out.println("Fabricante inválido");
            scanner.close();
            return;
        }

        System.out.print("Digite o modelo do celular: ");
        String modelo = scanner.nextLine();

        Celular celular = fabrica.constroiCelular(modelo);
        celular.fazLigacao();
        celular.tiraFoto();

        scanner.close();
    }

    
}
