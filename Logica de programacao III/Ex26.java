import java.util.Scanner;

public class Ex26 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    byte loop = 6;

    for(int i = 0; i < loop; i++) {
      System.out.println("indique um número inteiro entre 1 e 5.");
      byte num = input.nextByte();
      switch (num) {
        case 1 -> System.out.println("Um\n");
        case 2 -> System.out.println("Dois\n");
        case 3 -> System.out.println("Três\n");
        case 4 -> System.out.println("Quatro\n");
        case 5 -> System.out.println("Cinco\n");
        default -> {
          System.err.println("Número inválido.\n");
          input.nextLine();
        }
      }
    }
  }
}