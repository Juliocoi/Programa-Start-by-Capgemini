import java.util.Scanner;

public class Ex25 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int num1, num2;
    System.out.println("Informe um número inteiro: ");
    num1 = input.nextInt();
    System.out.println("Informe outro número inteiro: ");
    num2 = input.nextInt();

    if(num1 == num2){
      System.out.println("Os números são iguais.");
    } else if(num1 > num2){
      System.out.printf("O número %d é diferente do número %d. Ele é maior.", num1, num2);
    } else {
      System.out.printf("O número %d é diferente do número %d. Ele é menor.", num1, num2);
    }
  }
}