import java.util.Scanner;

public class Ex05 {
  public static void main(String[] args) {
    String name;
    float note1;
    float note2;
    float note3;
    float media;
    Scanner input = new Scanner(System.in);

    System.out.println("Indique o nome do aluno: ");
    name = input.nextLine();

    System.out.println("Informe a PRIMEIRA nota do semestre: ");
    note1 = input.nextFloat();

    System.out.println("Informe a SEGUNDA nota do semestre: ");
    note2 = input.nextFloat();

    System.out.println("Informe a TERCEIRA nota do semestre: ");
    note3 = input.nextFloat();

    media = (note1 + note2 + note3) / 3;

    System.out.println("Aluno: " + name + "\n" + "Nota: " + media);
  }
}