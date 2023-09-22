package Models;

import com.fasterxml.jackson.annotation.JsonAlias;

public record Automovel(
        @JsonAlias("TipoVeiculo") String tipoVeiculo,
        @JsonAlias("Valor") String valor,
        @JsonAlias("Marca") String marca,
        @JsonAlias("Modelo") String modelo,
        @JsonAlias("AnoModelo") String anoModelo,
        @JsonAlias("Combustivel") String combustivel,
        @JsonAlias("CodigoFipe") String codigoFipe,
        @JsonAlias("MesReferencia") String mesRef,
        @JsonAlias("SiglaCombustivel") String siglaCombust
) {
}