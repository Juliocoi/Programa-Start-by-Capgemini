import java.util.Scanner;

public class Ex32 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Informe um número inteiro: ");
    int num1 = input.nextInt();
    System.out.println("Informe um segundo número inteiro: ");
    int num2 = input.nextInt();
    System.out.println("Informe um terceiro número inteiro: ");
    int num3 = input.nextInt();

    if (num1 == num2 && num1 == num3){
      System.out.println("Equilátero");
    } else if(num1 == num2 || num1 == num3 || num2 == num3){
      System.out.println("Isosceles");
    } else if (num1 != num2 && num1 != num3){
      System.out.println("Escaleno");
    }
  }
}
