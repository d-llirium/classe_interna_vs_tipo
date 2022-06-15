package singleton;

public class Highlander {

    // cria a instancia do objeto dentro dele mesmo
    // static no atributo: tem um único atributo para todos os objetos
    private static Highlander instancia = new Highlander(); 

    // private no contrutor impede que o objeto seja criado fora da classe
    private Highlander() { 
        System.out.println("teste > criação do Highlander");
    }

    // static no método para chamar o método a partir da classe e não do objeto
    // synchronized no método impede que seja chamado de maneira paralela [ mais de uma thread ao mesmo tempo ]
    public static synchronized Highlander getInstance() { 

        return instancia;
    }
}
