package exercicio2;

// Aqui é a classe que define um veículo do modelo Civic

public class Civic implements IVehicle {
        
        public void start(){
            System.out.println("Veiculo Civic ligando");
        }
        
        public void drive(){
            System.out.println("Veiculo Civic em movimento");
        }
        
        public void stop(){
            System.out.println("Veiculo Civic parando");
        }
    
}
