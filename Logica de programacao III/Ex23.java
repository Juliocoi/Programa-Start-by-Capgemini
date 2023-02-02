import java.util.Scanner;

public class Ex23 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int num;
    System.out.println("Insira um número inteiro: ");
    num = input.nextInt();

    if(num > 80){
      System.out.printf("O número %d, é maior que 80.\n", num);

    }else if(num == 40){
      System.out.printf("O número %d é igual a 40.\n", num);
    } else if(num < 25){
      System.out.printf("O número %d é menor que 25.", num);
    }
  }
}