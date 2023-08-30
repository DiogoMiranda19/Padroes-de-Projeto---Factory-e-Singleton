package exercicio2;

// Aqui é a classe que define a fabrica de veículos dos modelos da Toyota, e utiliza do padrão de Fábrica 
// para instanciar novos objetos a partir de seu modelo

public class Toyota implements IVehicleMaker{

    public IVehicle makeVehicle(String modelo){

        if(modelo.equals("Corolla")){
            return new Corolla();
        } else if(modelo.equals("Etios")){
            return new Etios();
        }else if(modelo.equals("Hilux")){
            return new Hilux();
        }else{
            return null;
        }
    }
    
}
    

