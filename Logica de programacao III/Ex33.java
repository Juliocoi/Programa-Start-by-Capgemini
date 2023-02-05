import java.util.Scanner;
import java.text.NumberFormat;

public class Ex33 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    NumberFormat real = NumberFormat.getCurrencyInstance();

    System.out.println("##### Escola Aprender #####");
    System.out.println("Informe a quantidade de horas trabalhadas: ");
    int hour = input.nextInt();
    System.out.println("Indique o nível do funcionário: ");
    System.out.println("1. Nível 1;");
    System.out.println("2. Nível 2;");
    System.out.println("3. Nível 3.");
    System.out.println("Informe a opção desejada: ");
    byte opc = input.nextByte();
    input.nextLine();

    switch (opc){
      case 1 -> {
        float nivel1 = 12.00f;
        System.out.printf("O salário do mês será: %s.", real.format(hour * nivel1));
        System.out.println("");
      }
      case 2 -> {
        float nivel2 = 17.00f;
        System.out.printf("O salário do mês será: %s.", real.format(hour * nivel2));
        System.out.println("");
      }
      case 3 -> {
        float nivel3 = 25.00f;
        System.out.printf("O salário do mês será: %s.", real.format(hour * nivel3));
        System.out.println("");
      }
    }
  }
}