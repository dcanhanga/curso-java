/*
9. Faça um Programa que peça a temperatura em graus Farenheit,
transforme e mostre a temperatura em graus Celsius.
Fórmula: C = (5 * (F - 32) / 9).
*/

package com.canhanga.sequencial;

import java.util.Scanner;

public class Ex09FahrenheitParaCelsius {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite a temperatura em Fahrenheit: ");
    double fahrenheit = scanner.nextDouble();

    double celsius = (5 * (fahrenheit - 32)) / 9;

    System.out.println("A temperatura em Celsius é: " + celsius);

    scanner.close();
  }
}
