import java.util.Scanner;
import java.text.NumberFormat;

public class Ex35 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    NumberFormat real = NumberFormat.getCurrencyInstance();

    System.out.println("Informe a quantidade de KW/h de sua conta de energia(apenas número): ");
    float consumo = input.nextFloat();;
    input.nextLine();
    System.out.println("Informe o tipo de contrato: ");
    System.out.println("1. Residencial;");
    System.out.println("2. Comercial;");
    System.out.println("3. Industrial.");
    System.out.println("Indique a opção desejada: ");
    byte opc = input.nextByte();
    input.nextLine();

    switch(opc){
      case 1 -> {
        System.out.println("Consumidor residencial.");
        System.out.printf("O valor da sua conta é de: %s.", real.format(consumo * 0.60f));
        System.out.println("");
      }
      case 2 -> {
        System.out.println("Consumidor comercial.");
        System.out.printf("O valor da sua conta é de: %s.", real.format(consumo * 0.48f));
        System.out.println("");
      }
      case 3 -> {
        System.out.println("Consumidor industrial.");
        System.out.printf("O valor da sua conta é de: %s.", real.format(consumo * 1.29f));
        System.out.println("");
      }
    }
  }
}