package exercicio2;

// Aqui é a classe que define o veículo do modelo City

public class City implements IVehicle {
        
        public void start(){
            System.out.println("Veiculo City ligando");
        }
        
        public void drive(){
            System.out.println("Veiculo City em movimento");
        }
        
        public void stop(){
            System.out.println("Veiculo City parando");
        }
    
}
