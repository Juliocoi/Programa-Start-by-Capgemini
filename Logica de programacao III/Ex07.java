import java.util.Scanner;

public class Ex07 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Bem vindo ao conversor de temperatura Convertator Tabajara.");
    System.out.println("Indique a temperatura em graus Celsius para conversão para Fahrenheit.");
    float celsius = input.nextFloat();
    float fahrenheit = (9 * celsius + 160) / 5;

    System.out.println(celsius + "ºc " + "equivale a " + fahrenheit + "ºF");
  }
}