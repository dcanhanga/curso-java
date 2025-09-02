/*
 
Faça um Programa que peça um número e então mostre a
mensagem O número informado foi [número].
 */
package com.canhanga.programacaobasica.exercicio02;

import java.util.Scanner;

public class Exercicio02 {
  public static void main(String[] args) {
    System.out.println("Informe um numero inteiro: ");
    Scanner scan = new Scanner(System.in);
    int inputNumber = scan.nextInt();
    System.out.println("O número informado foi " + inputNumber);
    scan.close();

  }
}
