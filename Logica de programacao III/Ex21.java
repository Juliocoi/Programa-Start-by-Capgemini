import java.util.Scanner;

public class Ex21 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    byte opc = 0;
    String name;
    char sexo;
    byte age;
    int ableYes = 0;
    int ableNo = 0;

    while (opc != 2) {
      System.out.println("##### Cadastramento dos candidatos #####");
      System.out.println("O que deseja fazer?");
      System.out.println("1 - Cadastrar novo candidato;");
      System.out.println("2. Sair");
      System.out.println("-------------------------");
      System.out.println("Digite sua opção: ");
      opc = input.nextByte();
      input.nextLine();

      switch (opc) {
        case 1 -> {
          System.out.println("informe os dados solicitados abaixo: ");
          System.out.println("Nome: ");
          name = input.nextLine();
          System.out.println("Sexo:\nH - homem;\nM - Mulher.");
          sexo = input.nextLine().toUpperCase().charAt(0);
          System.out.println("Idade: ");
          age = input.nextByte();

          if (age >= 18) {
            ableYes++;

            System.out.printf("%s, sexo: %s, Idade: %d, está apto ao serviço militar.", name, sexo, age);
            System.out.println("\n");
          } else {
            ableNo++;

            System.out.printf("%s, sexo: %s, Idade: %d, não está apto por possuir menos de 18 anos.", name, sexo, age);
            System.out.println("\n");
          }
        }
        case 2 -> {
          System.out.printf("Total de pessoas aptas ao serviço militar: %d;\n", ableYes);
          System.out.printf("Total de pessoas inaptas ao serviço militar %d;\n", ableNo);
          System.out.println("Volte sempre!");
        }
        default -> {
          System.err.println("Opção inválida");
          System.out.println("");
        }
      }
    }
  }
}