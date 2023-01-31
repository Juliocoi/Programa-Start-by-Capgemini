import java.util.Scanner;

public class Ex13 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Indique um número inteiro: ");
    int number = input.nextInt();

    if(number > 10){
      System.out.printf("O número %d é maior que 10.", number);
    } else if(number == 10){
      System.out.printf("O número indicado é 10.");
    }else{
      System.out.printf("O número %d é menor que 10.", number);
    }
  }
}