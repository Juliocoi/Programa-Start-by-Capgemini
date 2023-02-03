import java.util.Scanner;

public class Ex30 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int [] vetorNum = new int[3];
    int aux;

    System.out.println("Indique um número inteiro");
    int num1 = input.nextInt();
    System.out.println("Indique outro número inteiro: ");
    int num2 = input.nextInt();
    System.out.println("Indique um terceiro número: ");
    int num3 = input.nextInt();

    if(num1 > num2){
      aux = num1;
      num1 = num2;
      num2 = aux;
    }

    if(num2 <= num3){
      System.out.printf("A ordem crescente é: %d %d %d.",num1,num2,num3);

    } else {
      if(num1 <= num3){
        System.out.printf("A ordem crescente é: %d %d %d",num1,num3,num2);

      } else {
        System.out.printf("A ordem crescente é: %d %d %d.",num3,num1,num2);
      }
    }
  }
}