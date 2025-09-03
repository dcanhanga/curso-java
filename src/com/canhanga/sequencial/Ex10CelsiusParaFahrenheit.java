/*
10. Faça um Programa que peça a temperatura em graus Celsius,
transforme e mostre em graus Fahrenheit.
*/

package com.canhanga.sequencial;

import java.util.Scanner;

public class Ex10CelsiusParaFahrenheit {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite a temperatura em Celsius: ");
    double celsius = scanner.nextDouble();

    double fahrenheit = (celsius * 9 / 5) + 32;

    System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);

    scanner.close();
  }
}
