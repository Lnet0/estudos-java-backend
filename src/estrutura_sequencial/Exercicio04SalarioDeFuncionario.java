/*
 * Exercício 04 - Salário do funcionário
 *
 * Objetivo:
 * Ler o número do funcionário, suas horas trabalhadas e o valor por hora,
 * calculando e exibindo o salário com duas casas decimais.
 *
 * Exemplo de execução:
 *
 * Entrada:
 * numeroFuncionario = 25
 * horas = 100
 * valorHora = 5.50
 *
 * Saída:
 * Funcionario numero = 25
 * Salario = U$ 550.00
 */

package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04SalarioDeFuncionario {

  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int funcionario, horas;
    double valorHora, salario;

    //Entrada de dados.
    System.out.print("Digite o numero do funcionario: ");
    funcionario = sc.nextInt();

    System.out.print("Digite o numero de horas trabalhadas: ");
    horas = sc.nextInt();

    System.out.print("Digite o valor por hora: U$ ");
    valorHora = sc.nextDouble();

    //Processamento.
    salario = horas * valorHora;

    //Saída de dados.
    System.out.printf("%nFuncionario numero = %d%n", funcionario);
    System.out.printf("Salario = U$ %.2f%n", salario);

    sc.close();
  }
}
