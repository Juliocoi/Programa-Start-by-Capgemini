import java.util.Scanner;

public class Ex02 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int opc = 0;
    float num1;
    float num2;

    while (opc != 5) {
      System.out.println("\n\n");
      System.out.println("##### Opções #####");
      System.out.println("1 - Somar");
      System.out.println("2 - Subtrair");
      System.out.println("3 - Multiplicação");
      System.out.println("4 - Divisão");
      System.out.println("5 - Sair");

      System.out.println("Informe a opção desejada dentre as opções acima: ");

      opc = input.nextInt();

      switch (opc) {
        case 1:
          System.out.println("Indique um número: ");
          num1 = input.nextFloat();

          System.out.println("Indique outro número: ");
          num2 = input.nextFloat();

          System.out.println("A soma dos números indicados é " + (num1 + num2));

          break;
        case 2:
          System.out.println("Indique um número: ");
          num1 = input.nextFloat();

          System.out.println("Indique outro número: ");
          num2 = input.nextFloat();

          System.out.println("A subtração dos números indicados é " + (num1 - num2));
          break;

        case 3:
          System.out.println("Indique um número: ");
          num1 = input.nextFloat();

          System.out.println("Indique outro número: ");
          num2 = input.nextFloat();

          System.out.println("A multiplicação dos números indicados é " + (num1 * num2));
          break;
        case 4:
          System.out.println("Indique um número: ");
          num1 = input.nextFloat();

          System.out.println("Indique outro número: ");
          num2 = input.nextFloat();

          if (num2 == 0) {
            System.out.println("Não é possível dividir por zero.");
            break;
          }

          System.out.println("A divisão dos números indicados é " + (num1 / num2));
          break;
        case 5:
          System.out.println("Até logo!");
          break;
      }
    }

  }
};
