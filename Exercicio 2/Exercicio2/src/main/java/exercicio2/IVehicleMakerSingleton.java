package exercicio2;

// Aqui é a classe que define o padrão Singleton para a fabrica de veículos para  
// garantir que exista apenas uma instancia de cada fabrica.
// Com isso podemos controlar o número de instancias de cada fabrica de veículos e
// controlar o acesso a essas instancias.
// Com isso podemos chamar os métodos varias vezes, que será retornado a mesma instancia da fabrica de veículos

// Combinando os padrões de projeto Factory e Singleton, podemos criar instancias unicas das fabricas de veículos
// mas que sejam flexíveis nos tipos de veiculos que podem ser criados

public class IVehicleMakerSingleton {
    
    private static IVehicleMaker instanciaHonda;
    private static IVehicleMaker instanciaToyota;

    private IVehicleMakerSingleton() {}

    // Aqui é o método que retorna a instancia única da fabrica de veículos para a Honda
    public static IVehicleMaker getInstanciaHonda() {
        if (instanciaHonda == null) {
            instanciaHonda = new Honda();
        }
        return instanciaHonda;
    }

    // Aqui é o método que retorna a instancia única da fabrica de veículos para a Toyota
    public static IVehicleMaker getInstanciaToyota() {
        if (instanciaToyota == null) {
            instanciaToyota = new Toyota();
        }
        return instanciaToyota;
    }
}