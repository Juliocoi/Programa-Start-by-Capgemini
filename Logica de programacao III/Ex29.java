import java.util.Scanner;

public class Ex29{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("indique um número inteiro para saber seu mês correspondente:");
    byte month = input.nextByte();

    switch (month) {
      case 1 -> System.out.println("Janeiro");
      case 2 -> System.out.println("Fevereiro");
      case 3 -> System.out.println("Março");
      case 4 -> System.out.println("Abril");
      case 5 -> System.out.println("Maio");
      case 6 -> System.out.println("Junho");
      case 7 -> System.out.println("Julho");
      case 8 -> System.out.println("Agosto");
      case 9 -> System.out.println("Setembro");
      case 10 -> System.out.println("Outubro");
      case 11 -> System.out.println("Novembro");
      case 12 -> System.out.println("Dezembro");
      default -> {
        System.err.println("Mês inválido.");
      }
    }
  }
}