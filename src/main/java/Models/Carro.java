package Models;

import Principal.Automoveis;

public class Carro extends Automoveis implements IAutomoveis {
    public Carro(){
        mostrarTabela(EAutomoveis.CARRO);
    }
}
