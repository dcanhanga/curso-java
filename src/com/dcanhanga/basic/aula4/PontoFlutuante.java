package com.dcanhanga.basic.aula4;

public class PontoFlutuante {
  public static void main(String[] args) {
    double salario = 1250.70;
    float taxa = 0.20f; // por padrão o literal do ponto flutuante é double, para indicar que é float
                        // deve ser adicionado a letra f
    System.out.println("Salário: " + salario);
    System.out.println("Taxa: " + taxa);
  }
}
