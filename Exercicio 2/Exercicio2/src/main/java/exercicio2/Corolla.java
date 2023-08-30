package exercicio2;

// Aqui é a classe que define um veículo do modelo Corolla

public class Corolla implements IVehicle{

    public void start(){
        System.out.println("Veiculo ligando");
    }

    public void drive(){
        System.out.println("Veiculo Corolla em movimento");
    }

    public void stop(){
        System.out.println("Veiculo Corolla parando");
    }
    
}
