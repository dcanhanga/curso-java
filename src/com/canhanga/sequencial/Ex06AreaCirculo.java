/*
6. Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
*/

package com.canhanga.sequencial;

import java.util.Scanner;

public class Ex06AreaCirculo {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o raio do círculo: ");
    double raio = scanner.nextDouble();

    double area = Math.PI * Math.pow(raio, 2);

    System.out.println("A área do círculo é: " + area);

    scanner.close();
  }
}
