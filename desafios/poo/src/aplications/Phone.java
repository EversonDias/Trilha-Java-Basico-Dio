package aplications;

import aplications.Interface.IPhone;
import java.util.Scanner;

public class Phone implements IPhone {

  Scanner sc =  new Scanner(System.in);

  public void menu() {
    int option = 4;
    while (option != 0) {

      System.out.println("================");
      System.out.println("[1] => Ligar");
      System.out.println("[2] => Atender");
      System.out.println("[3] => Correio de Voz");
      System.out.println("[0] => voltar");
      System.out.println("================");

      option = sc.nextInt();

      switch (option) {
        case 1 -> ligar();
        case 2 -> atender();
        case 3 -> iniciarCorrerioVoz();
      }
    }
  }

  private void ligar() {
    System.out.println("Fazendo Ligação!");
  }

  private void atender() {
    System.out.println("Ligação Atendida!");
  }

  private void iniciarCorrerioVoz() {
    System.out.println("Correio de Voz Iniciado!");
  }
}
