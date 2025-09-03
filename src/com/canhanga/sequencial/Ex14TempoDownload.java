/*
14. Faça um programa que peça o tamanho de um arquivo para download
(em MB) e a velocidade de um link de Internet (em Mbps), calcule e
informe o tempo aproximado de download do arquivo usando este link
(em minutos).
*/

package com.canhanga.sequencial;

import java.util.Scanner;

public class Ex14TempoDownload {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Entrada
    System.out.print("Digite o tamanho do arquivo (em MB): ");
    double tamanhoMB = scanner.nextDouble();

    System.out.print("Digite a velocidade da Internet (em Mbps): ");
    double velocidadeMbps = scanner.nextDouble();

    // Conversão de MB para Megabits
    double tamanhoEmMegabits = tamanhoMB * 8;

    // Tempo em segundos
    double tempoSegundos = tamanhoEmMegabits / velocidadeMbps;

    // Converte para minutos
    double tempoMinutos = tempoSegundos / 60;

    // Saída
    System.out.printf("Tempo aproximado de download: %.2f minutos%n", tempoMinutos);

    scanner.close();
  }
}
