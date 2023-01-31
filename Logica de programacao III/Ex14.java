import java.util.Scanner;

public class Ex14 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Indique um número inteiro:");
    int num1 = input.nextInt();

    System.out.printf("Indique outro número inteiro: ");
    int num2 = input.nextInt();

    if(num1 > num2){
      System.out.printf("O %d é maior que %d.", num1, num2);
    } else{
      System.out.printf("O %d é maior que %d.", num2, num1);
    }
  }
}