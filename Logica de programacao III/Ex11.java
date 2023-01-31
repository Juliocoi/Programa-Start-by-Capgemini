import java.net.StandardSocketOptions;
import java.util.Scanner;
import java.text.NumberFormat;

public class Ex11 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    NumberFormat real = NumberFormat.getCurrencyInstance();

    System.out.println("Indique o preço de custo da mercadoria: ");
    float price = input.nextFloat();

    System.out.println("Indique o percentual a ser acrescido(apenas números): ");
    byte percentage = input.nextByte();

    float finalPrice = ((float) percentage / 100 + 1) * price;

    System.out.printf("O valor final do produto será de: %s.", real.format(finalPrice));



  }
}