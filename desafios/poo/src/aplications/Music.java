package aplications;

import aplications.Interface.IMusic;
import java.util.Scanner;

public class Music implements IMusic {

  Scanner sc =  new Scanner(System.in);


  public void menu() {
    int option = 4;
    while (option != 0) {

      System.out.println("================");
      System.out.println("[1] => Tocar Musica");
      System.out.println("[2] => Pausar Musica");
      System.out.println("[3] => Selecionar Musica");
      System.out.println("[0] => voltar");
      System.out.println("================");

      option = sc.nextInt();

      switch (option) {
        case 1 -> tocar();
        case 2 -> pausar();
        case 3 -> selecionarMusica();
      }
    }
  }

  private void tocar() {
    System.out.println("Tocando Musica!");
  }

  private void pausar() {
    System.out.println("Musica Pausada!");
  }

  private void selecionarMusica() {
    System.out.println("Musica Selecionada com Sucesso!");
  }
}
