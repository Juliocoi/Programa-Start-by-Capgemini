import java.util.Scanner;
import java.text.NumberFormat;

public class Ex08 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    NumberFormat real = NumberFormat.getCurrencyInstance();

    System.out.println("Qual a cotação atual do real frente ao dólar?");
    float realR$ = input.nextFloat();
    System.out.println("Quantos dólares você possui?");
    float qtdDolar = input.nextFloat();

    float totalConvertido = qtdDolar * realR$;

    System.out.printf(real.format(totalConvertido));
  }

}