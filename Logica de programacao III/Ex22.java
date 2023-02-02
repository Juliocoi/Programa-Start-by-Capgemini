import java.util.Scanner;
import java.text.NumberFormat;

public class Ex22 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    NumberFormat real = NumberFormat.getCurrencyInstance();
    float costPrice, salePrice, costPriceMedia = 0, salePriceMedia = 0;
    int loop = 5;

    for (int i = 0; i < loop; i++) {
      System.out.println("Preço de custo:  ");
      costPrice = input.nextFloat();
      System.out.println("Preço de venda: ");
      salePrice = input.nextFloat();
      System.out.println("");

      if (salePrice > costPrice) {
        System.out.printf("Preço de custo do Produto: %s.", real.format(costPrice));
        System.out.println("");
        System.out.printf("Preço de venda do produto: %s.", real.format(salePrice));
        System.out.println("");
        System.out.println("Houve lucro na venda.");
        System.out.println("");

        costPriceMedia += costPrice;
        salePriceMedia += salePrice;

      } else if (salePrice == costPrice) {
        System.out.printf("Preço de custo do Produto: %s.", real.format(costPrice));
        System.out.println("");
        System.out.printf("Preço de venda do produto: %s.", real.format(salePrice));
        System.out.println("");
        System.out.println("Houve um empate nos preços.");
        System.out.println("");

        costPriceMedia += costPrice;
        salePriceMedia += salePrice;

      } else {
        System.out.printf("Preço de custo do Produto: %s.", real.format(costPrice));
        System.out.println("");
        System.out.printf("Preço de venda do produto: %s.", real.format(salePrice));
        System.out.println("");
        System.out.println("Houve prejuízo.");
        System.out.println("");

        costPriceMedia += costPrice;
        salePriceMedia += salePrice;
      }

    }
    System.out.printf("A média de preço de custo é de: %s ", real.format(costPriceMedia / loop));
    System.out.println("");
    System.out.printf("A média de preço de venda é de: %s ", real.format(salePriceMedia / loop));
  }
}