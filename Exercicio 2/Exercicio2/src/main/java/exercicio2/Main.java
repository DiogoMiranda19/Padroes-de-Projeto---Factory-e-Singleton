package exercicio2;

// Aqui é a classe Main que vai ser executada demonstrando o funcionamento do padrão Singleton e Factory
// Ela vai pedir para o usuário digitar o fabricante do carro e o modelo do carro e vai instanciar o carro

import java.util.Scanner;

// Aqui na classe Main colocamos em prática ambos os padrões de projeto (Singleton e Fábrica), de forma à
// instanciar novos objetos (veículos) a partir de suas respectivas fábricas e de seus modelos

public class Main {

    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);

        System.out.println("Digite o fabricante do carro (Toyota ou Honda): ");
        String fabricante = sc.nextLine();

        IVehicleMaker fabrica;

        if (fabricante.equals("Toyota")) {
            fabrica = IVehicleMakerSingleton.getInstanciaToyota();
        } else if (fabricante.equals("Honda")) {
            fabrica = IVehicleMakerSingleton.getInstanciaHonda();
        } else {
            System.out.println("Fabricante inválido");
            sc.close();
            return;
        }

        System.out.println("Digite o modelo do carro: ");
        String modelo = sc.nextLine();

        IVehicle carro = fabrica.makeVehicle(modelo);
        carro.start();
        carro.drive();
        carro.stop();

        sc.close();

    }
}
