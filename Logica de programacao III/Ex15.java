import java.util.Scanner;

public class Ex15 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Indique um número inteiro qualquer: ");
    int num = input.nextInt();

    if(num >= 100 && num <= 200){
      System.out.printf("O número %d está entre 100 e 200.", num);
    } else if(num < 100){
      System.out.printf("O número %d não está entre 100 e 200. Ele é menor que 100", num);
    } else {
      System.out.printf("O número %d não está entre 100 e 200. Ele é maior que 200", num);
    }
  }
}