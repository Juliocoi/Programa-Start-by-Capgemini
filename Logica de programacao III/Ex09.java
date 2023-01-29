import java.util.Scanner;
import java.text.NumberFormat;

public class Ex09 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    NumberFormat real = NumberFormat.getCurrencyInstance();

    float juros = 1.07f;
    System.out.println("Informe o valor a ser depositado: ");
    float deposito = input.nextFloat();

    float rendimentos = deposito * juros;

    System.out.println("Saldo em um mês: " + real.format(rendimentos));

  }
}