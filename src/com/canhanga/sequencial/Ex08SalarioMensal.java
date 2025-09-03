/*
8. Faça um Programa que pergunte quanto você ganha por hora e o
número de horas trabalhadas no mês. Calcule e mostre o total do seu
salário no referido mês.
*/

package com.canhanga.sequencial;

import java.util.Scanner;

public class Ex08SalarioMensal {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Quanto você ganha por hora? ");
    double valorHora = scanner.nextDouble();

    System.out.print("Quantas horas você trabalhou no mês? ");
    double horas = scanner.nextDouble();

    double salario = valorHora * horas;

    System.out.println("Seu salário no mês é: KZ " + salario);

    scanner.close();
  }
}
