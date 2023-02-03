import java.util.Scanner;
import java.text.NumberFormat;

public class Ex28 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    NumberFormat real = NumberFormat.getCurrencyInstance();
    String name;
    float employeeSalary;
    float minimumWage;
    float readjustment;
    float newSalary;
    float totalReadjustment = 0;
    byte opc = 0;

    while(opc != 2){
      System.out.println("");
      System.out.println("Calculadora de reajuste salarial");
      System.out.println("");
      System.out.println("1 - Calcular reajuste salarial. ");
      System.out.println("2 -  sair");
      System.out.println("--------------------------------");
      System.out.println("Informe o número da opção desejada: ");
      opc = input.nextByte();
      input.nextLine();

      switch(opc){
        case 1 -> {
          System.out.println("Nome do funcionário: ");
          name = input.nextLine();
          System.out.println("Salário atual do colaborador: ");
          employeeSalary = input.nextFloat();
          System.out.println("Valor do salário mínimo atual:");
          minimumWage = input.nextFloat();
          System.out.println("");

          if(employeeSalary < (minimumWage * 3)){
            readjustment = employeeSalary * 0.50f;
            newSalary = employeeSalary + readjustment;

            totalReadjustment += readjustment;
            System.out.printf("Funcionário: %s, Valor do reajuste: %s. Novo salário: %s.\n", name,
                real.format(readjustment), real.format(newSalary));

          } else if(employeeSalary >= (minimumWage * 3) && employeeSalary <= (minimumWage * 10)){
            readjustment = employeeSalary * 0.20f;
            newSalary = employeeSalary + readjustment;

            totalReadjustment += readjustment;
            System.out.printf("Funcionário: %s, Valor do reajuste: %s. Novo salário: %s.\n", name,
                real.format(readjustment), real.format(newSalary));

          } else if(employeeSalary > (minimumWage * 10) && employeeSalary <= (minimumWage * 20)){
            readjustment = employeeSalary * 0.15f;
            newSalary = employeeSalary + readjustment;

            totalReadjustment += readjustment;
            System.out.printf("Funcionário: %s, Valor do reajuste: %s. Novo salário: %s.\n", name,
                real.format(readjustment), real.format(newSalary));

          } else {
            readjustment = employeeSalary * 0.10f;
            newSalary = employeeSalary + readjustment;

            totalReadjustment += readjustment;
            System.out.printf("Funcionário: %s, Valor do reajuste: %s. Novo salário: %s.\n", name,
                real.format(readjustment), real.format(newSalary));
          }
        }
        case 2 -> {
          System.out.printf("Valor total do aumento na folha de pagamento: %s\n", real.format(totalReadjustment));
          System.out.println("Bye.");
        }
      }
    }
  }
}