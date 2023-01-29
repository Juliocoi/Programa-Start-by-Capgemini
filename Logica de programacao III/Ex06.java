import java.util.Scanner;

public class Ex06 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int varA;
    int varB;
    int aux;
    char opc = 'n';

    while(opc == 'n' || opc == 'N'){
      System.out.println("Indique um valor para a variável A (deve ser um número inteiro): ");
      varA = input.nextInt();

      System.out.println("Indique um valor para a variável B (deve ser um número inteiro): ");
      varB = input.nextInt();

      System.out.println("O valor da variável A é " + varA + ";\n" + "O valor da variável B é " + varB + "\n");

      System.out.println("Pressione o ' S ' para confirmar ou o ' N ' para redesignar os valores.");
      opc = input.next().charAt(0);

      if (opc == 's' || opc == 'S'){
        aux = varA;
        varA = varB;
        varB = aux;

        System.out.println("Errou feio, errou feio, errou rude!" + "\n" + "A variável A é " + varA + ";\n" + "A variável B é " + varB);
      }

    }

  }
}