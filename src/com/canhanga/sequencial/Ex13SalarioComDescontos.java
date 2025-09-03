/*
13. Faça um Programa que pergunte quanto você ganha por hora e o
número de horas trabalhadas no mês. Calcule e mostre o total do seu
salário no referido mês, sabendo-se que são descontados 11% para o
Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um
programa que nos dê:
- salário bruto.
- quanto pagou ao INSS.
- quanto pagou ao sindicato.
- o salário líquido.
- calcule os descontos e o salário líquido, conforme a tabela abaixo:

+ Salário Bruto : R$
- IR (11%) : R$
- INSS (8%) : R$
- Sindicato (5%) : R$
= Salário Líquido : R$

Obs.: Salário Bruto - Descontos = Salário Líquido.
*/

package com.canhanga.sequencial;

import java.util.Scanner;

public class Ex13SalarioComDescontos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quanto você ganha por hora? R$ ");
        double valorHora = scanner.nextDouble();

        System.out.print("Quantas horas você trabalhou no mês? ");
        double horasMes = scanner.nextDouble();

        double salarioBruto = valorHora * horasMes;
        double impostoRenda = salarioBruto * 0.11;
        double inss = salarioBruto * 0.08;
        double sindicato = salarioBruto * 0.05;
        double salarioLiquido = salarioBruto - (impostoRenda + inss + sindicato);

        System.out.println("\n### Demonstrativo de Salário ###");
        System.out.printf("Salário Bruto   : R$ %.2f%n", salarioBruto);
        System.out.printf("IR (11%%)        : R$ %.2f%n", impostoRenda);
        System.out.printf("INSS (8%%)       : R$ %.2f%n", inss);
        System.out.printf("Sindicato (5%%)  : R$ %.2f%n", sindicato);
        System.out.printf("Salário Líquido : R$ %.2f%n", salarioLiquido);

        scanner.close();
    }
}
