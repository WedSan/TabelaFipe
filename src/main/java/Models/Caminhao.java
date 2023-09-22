package Models;

import Services.TabelaFipe;

public class Caminhao{
    public Caminhao(){
       TabelaFipe tabelaFipe =  new TabelaFipe();
       tabelaFipe.mostrarTabela(EAutomoveis.CAMINHAO);
    }


}

