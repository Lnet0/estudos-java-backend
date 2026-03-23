/*
 * Exercício 02 - Área do Círculo
 *
 * Objetivo:
 * Ler o valor do raio de um círculo e calcular sua área.
 *
 * Fórmula:
 * area = PI * raio²
 *
 * Considerando PI = 3.14159
 *
 * Exemplo de execução:
 *
 * Entrada:
 * 2.00
 *
 * Saída:
 * A area do círculo é 12.5664
 */

package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02AreaDoCirculo {

  public static void main(String[] args) {

    //Define o padrão de ponto para casas decimais.
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    double raio, area;
    final double PI = 3.14159;

    //Entrada de dados do usuário.
    System.out.print("Informe o valor do raio do círculo: ");
    raio = sc.nextDouble();

    //Cálculo da área.
    area = PI * raio * raio;

    //Saída de dados com 4 casas decimais utilizando %.4f.
    System.out.printf("A area do círculo é %.4f%n", area);

    sc.close();
  }
}
