package Models;

import Services.TabelaFipe;

public class Moto {
    public Moto() {
        TabelaFipe tabelaFipe = new TabelaFipe();
        tabelaFipe.mostrarTabela(EAutomoveis.MOTO);
    }
}
