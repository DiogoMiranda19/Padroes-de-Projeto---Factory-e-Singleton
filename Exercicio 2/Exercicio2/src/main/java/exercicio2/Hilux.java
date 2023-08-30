package exercicio2;

// Aqui é a classe que define um veículo do modelo Hilux

public class Hilux implements IVehicle {

    public void start(){
        System.out.println("Veiculo Hilux ligando");
    }

    public void drive(){
        System.out.println("Veiculo Hilux em movimento");
    }

    public void stop(){
        System.out.println("Veiculo Hilux parando");
    }
    
}
