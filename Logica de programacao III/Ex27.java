import java.util.Scanner;
import java.text.NumberFormat;

public class Ex27 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    NumberFormat real = NumberFormat.getCurrencyInstance();
    float value;
    float discount;
    float newValue;
    float totalDiscount = 0;
    float totalSpent = 0;
    String fuelType;

    System.out.println("##### CARANGO #####");
    System.out.println("");
    System.out.println("Vamos calcular o desconto de seu carro novo.");
    System.out.println("Quando desejar sair atribua o valor 0 quando solicitado o valor do veículo.");
    System.out.println("-------------------------");

    do {
      System.out.println("informe o valor do veículo: ");
      value = input.nextFloat();
      input.nextLine();

      if (value > 0) {
        System.out.println("");
        System.out.println("Qual o tipo de combustível do veículo(Gasolina/Álcool/Diesel)?");
        fuelType = input.nextLine();
        System.out.println("");

        switch (fuelType) {
          case "álcool", "alcool" -> {
            discount = value * 0.25f;
            newValue = value - discount;

            totalDiscount += discount;
            totalSpent += newValue;
            System.out.printf("O valor do desconto será de %s. O valor final do veículo será de %s.\n",
                real.format(discount), real.format(newValue));
          }

          case "gasolina" -> {
            discount = value * 0.21f;
            newValue = value - discount;

            totalDiscount += discount;
            totalSpent += newValue;
            System.out.printf("O valor do desconto será de %s. O valor final do veículo será de %s.\n",
                real.format(discount), real.format(newValue));
          }

          case "diesel" -> {
            discount = value * 0.14f;
            newValue = value - discount;

            totalDiscount += discount;
            totalSpent += newValue;
            System.out.printf("O valor do desconto será de %s. O valor final do veículo será de %s.\n",
                real.format(discount), real.format(newValue));
          }
        }
      }
    } while (value != 0);

    System.out.printf("O total de descontos concedido aos clientes foi de %s.\n", real.format(totalDiscount));
    System.out.printf("O total pago pelos clientes foi de %s.\n", real.format(totalSpent));
  }
}