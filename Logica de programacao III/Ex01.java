import java.util.Scanner;

public class Ex01 {
  public static void main(String[] args) {
    int num1;
    int num2;
    int soma;
    Scanner input = new Scanner(System.in);

    System.out.println("Indique um número:");
    num1 = input.nextInt();

    System.out.println("Indique um número:");
    num2 = input.nextInt();

    soma = num1 + num2;

    System.out.println("A soma dos números é " + soma);
  }
}