package exercicio2;

// Aqui é a classe que define um veículo do modelo Etios

public class Etios implements IVehicle{

    public void start(){
        System.out.println("Veiculo Etios ligando");
    }

    public void drive(){
        System.out.println("Veiculo Etios em movimento");
    }

    public void stop(){
        System.out.println("Veiculo Etios parando");
    }
    
}
