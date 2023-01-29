import java.util.Scanner;

public class Ex03 {
  public static void main(String[] args) {
    float distance;
    float consumedFuel;
    Scanner input = new Scanner(System.in);

    System.out.println("Indique a distância percorrida pelo veículo em Km(utilize apenas números): ");
    distance = input.nextFloat();

    System.out.println("Agora indique o total de combustível consumido(litros): ");
    consumedFuel = input.nextFloat();

    System.out.println("O consumo foi de aproximadamente de " + (distance / consumedFuel));
  }
}