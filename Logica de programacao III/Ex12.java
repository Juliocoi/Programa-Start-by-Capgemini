import java.util.Scanner;
import java.text.NumberFormat;

public class Ex12 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    NumberFormat real = NumberFormat.getCurrencyInstance();

    System.out.println("Informe o valor de custo do veículo: ");
    float costPrice = input.nextFloat();

    float tax = 1.45f;
    float distributor = 1.28f;

    float finalPrice = (costPrice * tax) * distributor;

    System.out.printf("O preço final do veículo será de %s.", real.format(finalPrice));

  }
}