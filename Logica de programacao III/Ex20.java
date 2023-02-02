import java.util.Scanner;
import java.text.NumberFormat;

public class Ex20 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    NumberFormat real = NumberFormat.getCurrencyInstance();
    float value;
    float discount;
    float newValue;
    int year;
    byte prior2000 = 0;
    byte after2000 = 0;
    byte opc = 0;

    while (opc != 2) {
      System.out.println("##### Bem vindo ao Carango Velho #####");
      System.out.println("");
      System.out.println("O que deseja fazer?");
      System.out.println("1 - calcular desconto;");
      System.out.println("2. Sair");
      System.out.println("-------------------------");
      System.out.println("Digite sua opção: ");
      opc = input.nextByte();
    //  System.out.println("");

      switch (opc) {
        case 1 -> {
          System.out.println("informe o valor do veículo: ");
          value = input.nextFloat();
          System.out.println("");
          System.out.println("Qual o ano de fabricação do veículo?");
          year = input.nextInt();
          System.out.println("");
          if (year > 2000) {
            after2000++;
            discount = value * 0.07f;

            newValue = value - discount;

            System.out.printf("Valor do desconto: %s;\nValor final: %s.", real.format(discount), real.format(newValue));
            System.out.println("\n");
          } else {
            prior2000++;
            discount = value * 0.12f;

            newValue = value - discount;

            System.out.printf("Valor do desconto: %s;\nValor final: %s.", real.format(discount), real.format(newValue));
            System.out.println("\n");

          }
        }
        case 2 -> {
          System.out.printf("Total de veículos anterior ao ano 2000: %d;\n", prior2000);
          System.out.printf("Total de veículos posterior ao ano 2000: %d;\n", after2000);
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