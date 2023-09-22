package Services;

import Models.*;

import java.util.List;
import java.util.Scanner;

public class TabelaFipe implements IAutomoveis {

    protected PegarDados pegarDados = new PegarDados();
    protected Scanner ler = new Scanner(System.in);



    @Override
    public void mostrarTabela(EAutomoveis tipoAutomovel) {

        List<Dados> dadosMarcas = pegarDados.automoveis(tipoAutomovel);
        System.out.println("---MARCAS---");
        dadosMarcas.forEach(e -> {
            System.out.println("Marca: " + e.nome());
            System.out.println("Codigo: " + e.codigo());
            System.out.println("------");
        });

        System.out.print("Digite o codigo desejado para acessar a marca: ");
        String opcaoMarca = ler.nextLine();

        DadosModelos dadosModelos = pegarDados.automoveis(tipoAutomovel, opcaoMarca);

        System.out.println("---MODELOS---");
        dadosModelos.modelos().forEach(e ->{
            System.out.println("Nome: "+ e.nome());
            System.out.println("Codigo: "+ e.codigo());
            System.out.println("--------");
        });

        System.out.println("Digite o codigo desejado para acessar o modelo: ");
        String opcaoModelo = ler.nextLine();

        List<Dados> dados = pegarDados.automoveis(tipoAutomovel, opcaoMarca, opcaoModelo);
        System.out.println("---ANOS---");

        dados.forEach(e->{
            System.out.println("Ano: "+ e.nome());
            System.out.println("Codigo:"+ e.codigo());
            System.out.println("-------");
        });

        System.out.println("Digite o codigo desejado, para acessar o ano: ");
        String opcaoAno = ler.nextLine();

        Automovel automovel = pegarDados.automoveis(tipoAutomovel, opcaoMarca, opcaoModelo, opcaoAno);
        System.out.println("-------");
        System.out.println("Detalhes do veiculo selecionado: ");
        System.out.println("Tipo de Veículo: " + automovel.tipoVeiculo());
        System.out.println("Valor: " + automovel.valor());
        System.out.println("Marca: " + automovel.marca());
        System.out.println("Modelo: " + automovel.modelo());
        System.out.println("Ano Modelo: " + automovel.anoModelo());
        System.out.println("Combustível: " + automovel.combustivel());
        System.out.println("Código Fipe: " + automovel.codigoFipe());
        System.out.println("Mês de Referência: " + automovel.mesRef());
        System.out.println("Sigla do Combustível: " + automovel.siglaCombust());
        System.out.println("-------");
    }

}

