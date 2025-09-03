/*
12. Tendo como dados de entrada a altura de uma pessoa, construa um
algoritmo que calcule seu peso ideal, usando a seguinte fórmula:
(72.7 * altura) - 58
*/

package com.canhanga.sequencial;

import java.util.Scanner;

public class Ex12PesoIdeal {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite sua altura em metros: ");
    double altura = scanner.nextDouble();

    double pesoIdeal = (72.7 * altura) - 58;

    System.out.println("Seu peso ideal é: " + pesoIdeal + " kg");

    scanner.close();
  }
}
