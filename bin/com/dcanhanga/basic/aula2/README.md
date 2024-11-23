# Argumentos no Método `main` em Java

Este guia explica como trabalhar com argumentos de linha de comando no método `main` do Java, permitindo que programas recebam dados de entrada durante sua execução.

## Sumário

- [Argumentos no Método `main` em Java](#argumentos-no-método-main-em-java)
  - [Sumário](#sumário)
  - [Conceitos Básicos](#conceitos-básicos)
  - [Sintaxe e Funcionamento](#sintaxe-e-funcionamento)
    - [Estrutura Base](#estrutura-base)
    - [Compilação e Execução](#compilação-e-execução)
  - [Exemplos Práticos](#exemplos-práticos)
    - [1. Exemplo Básico](#1-exemplo-básico)
    - [2. Exemplo com Múltiplos Argumentos](#2-exemplo-com-múltiplos-argumentos)
  - [Boas Práticas](#boas-práticas)
  - [Tratamento de Erros](#tratamento-de-erros)
    - [Cenários Comuns](#cenários-comuns)
    - [Exemplo de Tratamento Completo](#exemplo-de-tratamento-completo)
  - [Casos de Uso](#casos-de-uso)
  - [Dicas Avançadas](#dicas-avançadas)

## Conceitos Básicos

O método `main` em Java possui a seguinte assinatura:

```java
public static void main(String[] args)
```

O parâmetro `args` é um array de strings que:

- Armazena argumentos passados na linha de comando
- Permite acesso sequencial aos valores fornecidos
- Mantém a ordem dos argumentos conforme digitados

## Sintaxe e Funcionamento

### Estrutura Base

```java
class ExemploArgumentos {
    public static void main(String[] args) {
        // args[0] - primeiro argumento
        // args[1] - segundo argumento
        // ...
    }
}
```

### Compilação e Execução

```bash
# Compilação
javac ExemploArgumentos.java

# Execução com argumentos
java ExemploArgumentos arg1 arg2 arg3
```

## Exemplos Práticos

### 1. Exemplo Básico

```java
public class ExemploBasico {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("Primeiro argumento: " + args[0]);
            System.out.println("Total de argumentos: " + args.length);
        } else {
            System.out.println("Nenhum argumento fornecido");
        }
    }
}
```

### 2. Exemplo com Múltiplos Argumentos

```java
public class ExemploMultiplo {
    public static void main(String[] args) {
        System.out.println("Lista de argumentos recebidos:");
        for (int i = 0; i < args.length; i++) {
            System.out.printf("Argumento %d: %s%n", i, args[i]);
        }
    }
}
```

## Boas Práticas

1. **Sempre Verifique o Tamanho do Array**

```java
if (args.length < numeroEsperado) {
    System.out.println("Número insuficiente de argumentos");
    System.exit(1);
}
```

2. **Valide os Argumentos**

```java
public static void main(String[] args) {
    try {
        int valor = Integer.parseInt(args[0]);
        // Processamento com o valor
    } catch (NumberFormatException e) {
        System.out.println("O argumento deve ser um número");
    }
}
```

3. **Forneça Mensagens de Uso**

```java
if (args.length == 0 || args[0].equals("--help")) {
    System.out.println("Uso: java Programa <argumento1> <argumento2>");
    System.out.println("Exemplo: java Programa 123 abc");
    return;
}
```

## Tratamento de Erros

### Cenários Comuns

1. Array vazio (nenhum argumento)
2. Índice fora dos limites
3. Tipo de dado incorreto
4. Argumentos inválidos

### Exemplo de Tratamento Completo

```java
public class ExemploTratamento {
    public static void main(String[] args) {
        try {
            if (args.length == 0) {
                throw new IllegalArgumentException("Nenhum argumento fornecido");
            }

            // Processamento dos argumentos
            processarArgumentos(args);

        } catch (IllegalArgumentException e) {
            System.err.println("Erro: " + e.getMessage());
            mostrarInstrucoes();
            System.exit(1);
        }
    }

    private static void processarArgumentos(String[] args) {
        // Lógica de processamento
    }

    private static void mostrarInstrucoes() {
        System.out.println("\nInstruções de uso:");
        System.out.println("java ExemploTratamento <arg1> <arg2>");
    }
}
```

## Casos de Uso

1. **Scripts e Automação**
   - Processamento em lote
   - Automatização de tarefas

2. **Configuração de Programa**
   - Definição de parâmetros iniciais
   - Modos de execução

3. **Ferramentas de Linha de Comando**
   - Utilitários
   - Processadores de texto/dados

## Dicas Avançadas

1. **Argumentos com Espaços**

```bash
java Programa "argumento com espaço"
```

2. **Argumentos Nomeados**

```java
// Execução: java Programa --nome=João --idade=25
for (String arg : args) {
    if (arg.startsWith("--nome=")) {
        String nome = arg.substring(7);
        // Processar nome
    }
}
```

**Processamento de Flags**

```java
// Execução: java Programa -v -f arquivo.txt
boolean verbose = false;
String arquivo = null;

for (int i = 0; i < args.length; i++) {
    switch (args[i]) {
        case "-v":
            verbose = true;
            break;
        case "-f":
            arquivo = args[++i];
            break;
    }
}
```
