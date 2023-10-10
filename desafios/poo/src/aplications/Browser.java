package aplications;

import aplications.Interface.IBrowser;
import java.util.Scanner;

public class Browser implements IBrowser {

  Scanner sc =  new Scanner(System.in);

  public void menu() {
    int option = 4;
    while (option != 0) {

    System.out.println("================");
    System.out.println("[1] => Exibir Pagina");
    System.out.println("[2] => Adicionar Nova Aba");
    System.out.println("[3] => Atualizar Pagina");
    System.out.println("[0] => voltar");
    System.out.println("================");

    option = sc.nextInt();

    switch (option) {
      case 1 -> exibirPagina();
      case 2 -> adicionarNovaAba();
      case 3 -> atualizarPagina();
    }
    }
  }

  private void exibirPagina() {
    System.out.println("Abrindo Navegador.");
  }

  private void adicionarNovaAba() {
    System.out.println("Abrindo Nova Aba!");
  }

  private void atualizarPagina() {
    System.out.println("Carregando Pagina!");
  }

}
