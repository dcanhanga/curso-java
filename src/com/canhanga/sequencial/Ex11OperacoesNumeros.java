/*
11. Faça um Programa que peça 2 números inteiros e um número real.
Calcule e mostre:
a. o produto do dobro do primeiro com metade do segundo.
b. a soma do triplo do primeiro com o terceiro.
c. o terceiro elevado ao cubo.
*/

package com.canhanga.sequencial;

import java.util.Scanner;

public class Ex11OperacoesNumeros {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o primeiro número inteiro: ");
    int num1 = scanner.nextInt();

    System.out.print("Digite o segundo número inteiro: ");
    int num2 = scanner.nextInt();

    System.out.print("Digite um número real: ");
    double num3 = scanner.nextDouble();

    double resultadoA = (2 * num1) * (num2 / 2.0);
    double resultadoB = (3 * num1) + num3;
    double resultadoC = Math.pow(num3, 3);

    System.out.println("Resultado A: " + resultadoA);
    System.out.println("Resultado B: " + resultadoB);
    System.out.println("Resultado C: " + resultadoC);

    scanner.close();
  }
}
