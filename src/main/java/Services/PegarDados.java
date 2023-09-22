package Services;

import Models.Dados;
import Models.Automovel;
import Models.DadosModelos;
import Models.EAutomoveis;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

public class PegarDados {
    private ConsumoApi consumoApi = new ConsumoApi();
    private ObjectMapper objectMapper = new ObjectMapper();
    private String endereco = "https://parallelum.com.br/fipe/api/v1/";

    public List<Dados> automoveis(EAutomoveis tipo) {

        String veiculo = null;

        if (tipo.equals(EAutomoveis.CARRO)) {
            veiculo = "carros";

        } else if (tipo.equals(EAutomoveis.MOTO)) {
            veiculo = "motos";

        } else {
            veiculo = "caminhoes";

        }

        String dadosApi = consumoApi.obterDados(endereco + veiculo + "/marcas");
        return obterLista(dadosApi);
    }

    public DadosModelos automoveis(EAutomoveis tipo, String codigoMarca) {

        String veiculo = null;

        if (tipo.equals(EAutomoveis.CARRO)) {
            veiculo = "carros";

        } else if (tipo.equals(EAutomoveis.MOTO)) {
            veiculo = "motos";

        } else {
            veiculo = "caminhoes";

        }

        String dadosApi = consumoApi.obterDados(endereco + veiculo +"/marcas/"+codigoMarca+"/modelos");
        return obterListaModelos(dadosApi);
    };

    public List<Dados> automoveis(EAutomoveis tipo, String codigoMarca, String codigoModelo) {

        String veiculo = null;

        if (tipo.equals(EAutomoveis.CARRO)) {
            veiculo = "carros";

        } else if (tipo.equals(EAutomoveis.MOTO)) {
            veiculo = "motos";

        } else {
            veiculo = "caminhoes";

        }

        String dadosApi = consumoApi.obterDados(endereco + veiculo +"/marcas/"+codigoMarca+"/modelos/"+codigoModelo+"/anos");
        return obterLista(dadosApi);
    };

    public Automovel automoveis(EAutomoveis tipo, String codigoMarca, String codigoModelo, String codigoAno) {

        String veiculo = null;

        if (tipo.equals(EAutomoveis.CARRO)) {
            veiculo = "carros";

        } else if (tipo.equals(EAutomoveis.MOTO)) {
            veiculo = "motos";

        } else {
            veiculo = "caminhoes";

        }

        String dadosApi = consumoApi.obterDados(endereco + veiculo +"/marcas/"+codigoMarca+"/modelos/"+codigoModelo+"/anos/"+codigoAno);
        return obterAutomovel(dadosApi);
    };

    private List<Dados> obterLista(String dadosApi){
        List<Dados> dadosAutomoveis = null;
        try {
            dadosAutomoveis = objectMapper.readValue(dadosApi, objectMapper.getTypeFactory()
                    .constructCollectionType(List.class, Dados.class));
        } catch (JsonProcessingException e) {
            System.out.println("Erro ao acessar o json, erro: " + e.getMessage());
        }
        return dadosAutomoveis;
    }

    private DadosModelos obterListaModelos(String dadosApi){
        DadosModelos dadosModelos = null;
        try {
            dadosModelos = objectMapper.readValue(dadosApi, DadosModelos.class);
        } catch (JsonProcessingException e) {
            System.out.println("Erro ao acessar o json, erro: " + e.getMessage());
        }
        return dadosModelos;
    }

    private Automovel obterAutomovel(String dadosApi){
        Automovel dadosAutomovel = null;
        try {
            dadosAutomovel = objectMapper.readValue(dadosApi, Automovel.class);
        } catch (JsonProcessingException e) {
            System.out.println("Erro ao acessar o json, erro: " + e.getMessage());
        }
        return dadosAutomovel;
    }

}
