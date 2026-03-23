/*
 * Exercício 05 - Cálculo de valor a pagar
 *
 * Objetivo:
 * Ler os dados de dois itens (código, quantidade e valor unitário)
 * e calcular o valor total a ser pago.
 *
 * Exemplo:
 *
 * Entrada:
 * 12 1 5.30
 * 16 2 5.10
 *
 * Saída:
 * VALOR A PAGAR: R$ 15.50
 */
package estrutura_sequencial;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio05CalculoDeItens {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int cod1, cod2, qtde1, qtde2 ;
    double valor1, valor2, total;

    //Entrada de dados.
    System.out.print("Digite o codigo do item 1: ");
    cod1 = sc.nextInt();

    System.out.print("Digite a quantidade: ");
    qtde1 = sc.nextInt();

    System.out.print("Digite o valor unitário: ");
    valor1 = sc.nextDouble();

    System.out.print("Digite o codigo do item 2: ");
    cod2 = sc.nextInt();

    System.out.print("Digite a quantidade: ");
    qtde2 = sc.nextInt();

    System.out.print("Digite o valor unitário: ");
    valor2 = sc.nextDouble();

    //Processamento/Cálculo
    total = (qtde1 * valor1) + (qtde2 * valor2);

    //Saída de dados.
    System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

    sc.close();
  }
}
