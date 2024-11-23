package com.dcanhanga.basic.aula4;

public class Char {
  public static void main(String[] args) {
    char letter = 'A';
    System.out.println("Letra: " + letter);
    letter = 65 + 1;
    System.out.println("Letra: " + letter);
    char o = 111;
    char i = 'i';
    char questionMark = 0x003F; // Unicode para o pondo de ?
    System.out.println("" + o + i + questionMark);
  }
}
