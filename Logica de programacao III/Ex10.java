import java.util.Scanner;
import java.text.NumberFormat;

public class Ex10 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    NumberFormat real = NumberFormat.getCurrencyInstance();

    System.out.println("##### Bem vindos ao Mamão com Açúcar #####");
    System.out.println("Indique o valor da compra: ");
    float value = input.nextFloat();

    System.out.println("Indique a quantidade de parcelas (1 a 5): ");
    byte opc = input.nextByte();

    switch (opc) {
      case 1:
        System.out.format("Parcela única de %s.", real.format(value));
        break;
      case 2:
        System.out.format("Pagamento em %dx de: %s.", opc, real.format(value / opc));
        break;
      case 3:
        System.out.format("Pagamento em %dx de: %s.", opc, real.format(value / opc));
        break;
      case 4:
        System.out.format("Pagamento em %dx de: %s. ", opc, real.format(value / opc));
        break;
      case 5:
        System.out.format("Pagamento em %dx de: %s. ", opc, real.format(value / opc));
        break;
      default:
        System.out.println("Opção inválida. Só é possível parcelar de 1 a 5 vezes.");
        break;
    }
    System.out.print("Até logo");
  }
}