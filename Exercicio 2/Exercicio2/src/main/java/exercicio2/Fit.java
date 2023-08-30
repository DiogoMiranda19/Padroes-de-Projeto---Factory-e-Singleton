package exercicio2;

// Aqui é a classe que define um veículo do modelo Fit

public class Fit implements IVehicle {

    public void start(){
        System.out.println("Veiculo Fit ligando");
    }

    public void drive(){
        System.out.println("Veiculo Fit em movimento");
    }

    public void stop(){
        System.out.println("Veiculo Fit parando");
    }
    
}
