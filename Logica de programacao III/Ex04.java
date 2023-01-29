import java.util.Scanner;
import java.text.NumberFormat;

public class Ex04 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    NumberFormat real = NumberFormat.getCurrencyInstance();

    System.out.println(" Para calcular o valor da comissão do colaborador indique os dados requerido abaixo.");
    System.out.println("Indique o nome do colaborador: ");
    String name = input.nextLine();

    System.out.println("Agora indique o valor da remuneração mensal do colaborador: ");
    float salary = input.nextFloat();

    System.out.println("Indique o valor total das vendas realizado pelo colaborador no mês: ");
    float totalSell = input.nextFloat();

    float commission = totalSell * 0.15f;

    float monthSalary = salary + commission;

    System.out.println("Colaborador " + name + "; " + "salário: " + real.format(salary) + "; " + "Salário do mês: " + real.format(monthSalary));
  }
}