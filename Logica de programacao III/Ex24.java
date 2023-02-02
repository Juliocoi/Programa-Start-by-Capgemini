import java.util.Scanner;

public class Ex24 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int num;
    System.out.println("Informe a quantidade do loop: ");
    int loop = input.nextInt();

    for(int i = 0; i < loop; i++){
      System.out.println("Entre com um número: ");
      num = input.nextInt();

      if(num > 0){
        System.out.println("Positivo.");

      } else if(num < 0){
        System.out.println("Negativo.");
      } else {
        System.out.println("O número é igual a 0.");
      }
    }
  }
}