/*
2. Faça um Programa que peça um número e então mostre a
mensagem: O número informado foi [número].
*/

package com.canhanga.sequencial;

import java.util.Scanner;

public class Ex02NumeroInformado {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite um número: ");
    int numero = scanner.nextInt();

    System.out.println("O número informado foi: " + numero);

    scanner.close();
  }
}
