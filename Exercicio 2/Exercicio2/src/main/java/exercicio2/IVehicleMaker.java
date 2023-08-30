package exercicio2;

// Aqui é a classe que define a fabrica de veículos, e portanto onde se inicia o padrão de fábrica
// Nessa classe temos um método que será usado para criar veículos.
// A partir desse uso do padrão de Fábrica, será possível criar novas fábricas de veículos, ou novos veículos
// de forma mais prática e flexível


public interface IVehicleMaker {

    public IVehicle makeVehicle(String modelo);
    
}
