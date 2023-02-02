import java.util.Scanner;

public class Ex19 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String name;
    String sex;
    int man = 0;
    int woman = 0;
    int loop = 5;

    for(int i = 0; i < loop; i++){
      System.out.println("Nome: ");
      name = input.nextLine();
      System.out.println("Sexo (H/M): ");
      System.out.println("H - Homem.");
      System.out.println("M - Mulher.");
      sex = input.nextLine();


      if(sex.equalsIgnoreCase("h")){
        System.out.printf("%s é um HOMEM.\n", name);
        man++;
      } else {
        System.out.printf("%s é um MULHER.\n", name);
        woman++;
      }
    }

    System.out.printf("%d Homens.\n", man);

    System.out.printf("%d Mulheres.", woman);
  }
}