import java.util.Scanner;

public class Ex17 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int num;
    int in = 0;
    int out = 0;
    int loop = 80;

    for(int i = 0; i < loop; i++){
      System.out.println("Informe um número inteiro qualquer");
      num = input.nextInt();

      if(num > 9 && num < 151){
        in++;
      } else {
        out++;
      }
    }
    System.out.printf("%d números estão no intervalo de 10 a 150.\n", in);

    System.out.printf("%d números estão fora do intervalo de 10 a 150.", out);
  }
}