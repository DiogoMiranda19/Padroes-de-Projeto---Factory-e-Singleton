package exercicio2;

// Aqui é a classe que define a fabrica de veículos dos modelos da Honda, e utiliza do padrão de Fábrica 
// para instanciar novos objetos a partir de seu modelo

public class Honda implements IVehicleMaker{

    public IVehicle makeVehicle(String modelo){

        if(modelo.equals("Civic")){
            return new Civic();
        } else if(modelo.equals("City")){
            return new City();
        }else if(modelo.equals("Fit")){
            return new Fit();
        }else{
            return null;
        }
    }
    
}
