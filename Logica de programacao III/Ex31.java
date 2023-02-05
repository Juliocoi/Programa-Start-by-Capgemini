import java.util.Scanner;

public class Ex31 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Indique um número (inteiro ou real):");
    float numA = input.nextFloat();
    System.out.println("Indique outro número (inteiro ou real):");
    float numB = input.nextFloat();
    input.nextLine();
    System.out.println("Agora indique um caractere qualquer: ");
    char charC = input.nextLine().charAt(0);

    switch(charC){
      case '+' -> {
        System.out.println("A soma dos números informados é: " + (numA + numB));
      }
      case '-' -> {
        System.out.println("A subtração dos números informados é: " + (numA - numB));
      }
      case '*' -> {
        System.out.println("A multiplicação dos números informados é: " + (numA * numB));
      }
      case '/' -> {
        if(numB == 0){
          System.err.println("Não é possível dividir por zero");
          break;
        }
        System.out.println("A divisão dos números informados é: " + (numA / numB));
      }
      default -> System.out.println("Operador não definido.");
    }
  }
}