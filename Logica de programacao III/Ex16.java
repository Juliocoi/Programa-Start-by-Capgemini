import java.util.Scanner;

public class Ex16 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Nome do aluno: ");
    String studentName = input.nextLine();

    System.out.println("Primeira nota: ");
    float note1 = input.nextFloat();

    System.out.println("Segunda nota: ");
    float note2 = input.nextFloat();

    System.out.println("Terceira nota: ");
    float note3 = input.nextFloat();

    float finalMedia = (note1 + note2 + note3) / 3;

    if(finalMedia >= 7){
      System.out.printf("Aluno %s aprovado!", studentName);
    } else if(finalMedia < 6.9 && finalMedia > 5){
      System.out.printf("Aluno %s em recuperação.", studentName);
    } else {
      System.out.printf("Aluno %s reprovado.", studentName);
    }
  }
}