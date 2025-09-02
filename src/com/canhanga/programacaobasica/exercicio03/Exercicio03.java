/*
 * Faça um Programa que peça dois números e imprima a soma.
 */
package com.canhanga.programacaobasica.exercicio03;

import java.util.Scanner;

public class Exercicio03 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Informe um número inteiro: ");
    int firstNumber = scan.nextInt();

    System.out.print("Informe outro número inteiro: ");
    int secondNumber = scan.nextInt();

    System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));

    scan.close();
  }
}
