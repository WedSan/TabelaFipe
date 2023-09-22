package Models;

import Services.TabelaFipe;

public class Carro {
    public Carro(){
        TabelaFipe tabelaFipe = new TabelaFipe();
        tabelaFipe.mostrarTabela(EAutomoveis.CARRO);
    }
}
