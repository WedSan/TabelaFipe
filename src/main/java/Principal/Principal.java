package Principal;

import Models.Caminhao;
import Models.Carro;
import Models.Moto;

import java.util.Scanner;

public class Principal {
    private final static Scanner ler = new Scanner(System.in);

    public Principal(){
        System.out.println("Digite os valores que pretende acessar abaixo");
        System.out.print("1 - Carros \n2 - Motos\n3 - Caminhoes\n");
        System.out.print("Digite a sua opção: ");
        int opcao = ler.nextInt();
        switch (opcao){
            case 1:
                new Carro();
                break;
            case 2:
                new Moto();
                break;
            case 3:
                 new Caminhao();
        }
    }
}
