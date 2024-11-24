# Introdução ao Java Hello World Java

## Sumário

- [**Introdução ao Java**](#introdução-ao-java)
- [**Características Principais**](#características-principais)
- [**Estrutura do Ecossistema Java**](#estrutura-do-ecossistema-java)
  - [**Java Development Kit (JDK)**](#java-development-kit-jdk)
  - [**Java Runtime Environment (JRE)**](#java-runtime-environment-jre)
  - [**Java Virtual Machine (JVM)**](#java-virtual-machine-jvm)
- [**Ciclo de Vida do Java**](#ciclo-de-vida-do-java)
- [**Versões e Plataformas**](#versões-e-plataformas)
  - [**Plataformas Java**](#plataformas-java)
  - [**Evolução e Lançamentos**](#evolução-e-lançamentos)
- [**Estrutura de um Programa Java**](#estrutura-de-um-programa-java)
  - [**Anatomia de uma Classe Java**](#anatomia-de-uma-classe-java)
  - [**Hello World em Java**](#hello-world-em-java)
  - [**Convenções de Código**](#convenções-de-código)
- [**Compilação e Execução**](#compilação-e-execução)
  - [**Compilando código Java**](#compilando-código-java)
  - [**Executando programas Java**](#executando-programas-java)

## Introdução ao Java

**Java** é uma linguagem de programação orientada a objetos e uma plataforma de desenvolvimento amplamente utilizada. Criada pela Sun Microsystems em 1995, é atualmente mantida pela Oracle Corporation. Com foco em portabilidade, robustez e segurança, Java é usado em diversas áreas como desenvolvimento de sistemas empresariais, aplicativos móveis, aplicações web e dispositivos embarcados.

## Características Principais

- **Plataforma Independente**: Graças ao conceito de Write Once, Run Anywhere (Escreva uma vez, execute em qualquer lugar), o código Java pode ser executado em qualquer sistema com Java Virtual Machine (JVM).
- **Orientação a Objetos**: Java suporta programação orientada a objetos, permitindo a criação de classes, objetos e herança.
- **Robustez e Segurança**: Java possui um modelo de segurança forte, que impede o acesso não autorizado a recursos do sistema. Inclui gerenciamento automático de memória, manipulação de exceções e verificações rigorosas em tempo de execução.
- **Desempenho Aprimorado**:Suporte nativo para programação paralela e concorrente.
- **Extensa Biblioteca Padrão:**: APIs robustas para manipulação de coleções, entrada/saída (IO), rede, segurança, e muito mais.

## Estrutura do Ecossistema Java

### Java Development Kit (JDK)

O JDK é o conjunto de ferramentas necessário para desenvolver aplicativos em Java. Ele inclui:

- **Java Compiler (javac)**:  Transforma o código-fonte (.java) em bytecode (.class).
- **Java Runtime Environment (JRE)**: Fornece a máquina virtual Java (JVM) e as bibliotecas necessárias para executar aplicativos Java.
- APIs Padrão: Uma vasta coleção de bibliotecas para tarefas comuns, como manipulação de strings, entrada/saída, rede, etc.

### Java Runtime Environment (JRE)

O JRE é o ambiente necessário para executar aplicativos Java. Ele contém:

- **Java Virtual Machine (JVM)**: Responsável por interpretar o bytecode e executar o programa.
- **Bibliotecas de Tempo de Execução**:APIs necessárias para a execução dos programas.

### Java Virtual Machine (JVM)

A JVM é o núcleo da plataforma Java. Ela interpreta o bytecode e executa no sistema subjacente. Componentes principais:

- **Class Loader**: Carrega classes e bibliotecas.
- **Execution Engine**: Interpreta e executa o bytecode.
- **Heap e Garbage Collector**: Gerencia a memória alocada dinamicamente.
- **Just-In-Time Compiler (JIT)**: Otimiza o código durante a execução.

## Ciclo de Vida do Java

1. **Desenvolvimento**: O código-fonte é escrito em Java (.java).
2. **Compilação**: O código-fonte é compilado em bytecode (.class).
3. **Execução**: O bytecode é interpretado e executado pela JVM.

## Versões e Plataformas

### Plataformas Java

1. **Java SE (Standard Edition)**: Para desenvolvimento de aplicações desktop e servidores.
2. **Java EE (Enterprise Edition)**: Para desenvolvimento de aplicações corporativas.
3. **Java ME (Micro Edition)**: Para dispositivos móveis e embarcados.

### Evolução e Lançamentos

A partir do Java 9, a Oracle adotou um ciclo de lançamento semestral, garantindo novas funcionalidades com mais frequência.

## Estrutura de um Programa Java

### Anatomia de uma Classe Java

Uma classe Java básica possui a seguinte estrutura:

```java
// Declaração do pacote (opcional)
package com.exemplo;

// Importações (opcional)
import java.util.Scanner;

// Declaração da classe
public class NomeClasse {
    // Campos/Atributos
    private String campo;

    // Construtor
    public NomeClasse() {
        // Inicializações
    }

    // Métodos
    public void metodo() {
        // Implementação
    }
}
```

### Hello World em Java

O programa "Hello World" é o exemplo mais básico de um programa Java:

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

Análise dos componentes:

- `public class HelloWorld`: Declara uma classe pública
- `public static void main(String[] args)`: Método principal que inicia a execução
- `System.out.println()`: Imprime texto no console

### Convenções de Código

1. **Nomenclatura**
   - Classes: PascalCase (ex: `MinhaClasse`)
   - Nome do arquivo deve ser o mesmo que o nome da class
   - Métodos e variáveis: camelCase (ex: `meuMetodo`)
   - Constantes: SNAKE_CASE_MAIÚSCULO (ex: `VALOR_MAXIMO`)

## Compilação e Execução

### Compilando código Java

1. **Processo de Compilação**

   ```bash
   # Sintaxe básica
   javac NomeDoArquivo.java

   # Exemplo com HelloWorld
   javac HelloWorld.java
   ```

   - O comando `javac` gera um arquivo `.class` contendo o bytecode
   - O arquivo `.class` tem o mesmo nome da classe

2. **Opções de Compilação Úteis**

   ```bash
   # Compilar com informações de debug
   javac -g HelloWorld.java

   # Especificar diretório de saída
   javac -d bin HelloWorld.java

   # Compilar múltiplos arquivos
   javac Arquivo1.java Arquivo2.java
   ```

### Executando programas Java

1. **Execução Básica**

   ```bash
   # Sintaxe básica
   java NomeDoArquivo

   # Exemplo com HelloWorld
   java HelloWorld
   ```

   - Note que não se usa a extensão `.class` ao executar
   - O arquivo deve conter um método `main`
