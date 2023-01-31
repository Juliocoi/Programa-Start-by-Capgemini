import java.util.Scanner;

public class Ex18 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int age;
    int loop = 75;

    for(int i = 0; i < loop; i++){
      System.out.println("Informe idade: ");
      age = input.nextInt();

      if(age >= 18){
        System.out.println("Maior de idade");
      } else {
        System.out.println("Menor de idade");
      }
    }
  }
}