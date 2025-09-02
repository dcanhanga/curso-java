/*
 * 5. Faça um Programa que converta metros para centímetros.
 */
package com.canhanga.programacaobasica.exercicio05;

import java.util.Scanner;

public class Exercicio05 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Digite o valor em metros");
    double metros = scan.nextDouble();

    System.out.printf("Valor em centímetros: %.2f cm%n", metros * 100);

    scan.close();
  }
}
