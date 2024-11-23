# Guia Completo: Tipos Primitivos em Java

## Índice

1. [Introdução](#introdução)
2. [O que são Tipos Primitivos?](#o-que-são-tipos-primitivos)
3. [Visão Geral dos Tipos Primitivos](#visão-geral-dos-tipos-primitivos)
4. [Detalhamento dos Tipos Primitivos](#detalhamento-dos-tipos-primitivos)
5. [Comportamentos Especiais](#comportamentos-especiais)
6. [Conversão entre Tipos](#conversão-entre-tipos)
7. [Wrapper Classes](#wrapper-classes)
8. [Literais e Notações](#literais-e-notações)
9. [Boas Práticas](#boas-práticas)
10. [Performance e Memória](#performance-e-memória)
11. [Exercícios Práticos](#exercícios-práticos)
12. [Perguntas Frequentes](#perguntas-frequentes)

## Introdução

Este guia oferece uma visão abrangente dos tipos primitivos em Java, fundamentais para qualquer desenvolvedor Java. O documento aborda desde conceitos básicos até aspectos avançados de performance e otimização.

## O que são Tipos Primitivos?

Um tipo primitivo em Java é um tipo de dado fundamental que:

- Não é um objeto
- Armazena valores diretamente na memória
- Possui tamanho fixo
- É mais eficiente em termos de memória e processamento que objetos

Java possui oito tipos primitivos, divididos em quatro categorias:

- Números inteiros: `byte`, `short`, `int`, `long`
- Números de ponto flutuante: `float`, `double`
- Caractere: `char`
- Booleano: `boolean`

## Visão Geral dos Tipos Primitivos

| Tipo    | Tamanho (bits) | Valor Mínimo               | Valor Máximo              | Potência do Intervalo |
| ------- | -------------- | -------------------------- | ------------------------- | --------------------- |
| byte    | 8              | -128                       | 127                       | -(2^7) a 2^7 -1       |
| short   | 16             | -32.768                    | 32.767                    | -(2^15) a 2^15 -1     |
| int     | 32             | -2.147.483.648             | 2.147.483.647             | -(2^31) a 2^31 -1     |
| long    | 64             | -9.223.372.036.854.775.808 | 9.223.372.036.854.775.807 | -(2^63) a 2^63 -1     |
| float   | 32             | ±1.4E-45                   | ±3.4E+38                  | IEEE 754              |
| double  | 64             | ±4.9E-324                  | ±1.8E+308                 | IEEE 754              |
| char    | 16             | \u0000                     | \uFFFF                    | 0 a 2^16 -1           |
| boolean | JVM dependente | false                      | true                      | N/A                   |

## Detalhamento dos Tipos Primitivos

### 1. byte

```java
byte pequeno = 127;
byte negativo = -128;
// Use para economizar memória em arrays grandes
byte[] dados = new byte[1000000]; // Economiza memória
```

**Características:**

- Menor tipo numérico
- Útil para manipulação de dados binários
- Comum em operações de I/O

### 2. short

```java
short valor = 32767;
short negativo = -32768;
// Útil para valores que excedem byte mas são menores que int
```

**Características:**

- Pouco usado na prática
- Pode ser útil em arrays muito grandes onde int seria desperdício

### 3. int

```java
int padrao = 42;
int maximo = 2_147_483_647;
int negativo = -2_147_483_648;
// Tipo mais comum para números inteiros
```

**Características:**

- Tipo padrão para inteiros em Java
- Tamanho ideal para contadores e índices
- Suporta notação com underscore para legibilidade

### 4. long

```java
long grande = 9223372036854775807L; // Note o sufixo L
long comUnderscores = 922_337_203_685_477_580_7L;
// Necessário para valores maiores que int
```

**Características:**

- Use para valores muito grandes
- Requer sufixo L para literais
- Comum em timestamps e IDs

### 5. float

```java
float decimal = 3.14f; // Note o sufixo f obrigatório
float cientifica = 1.234e-5f;
// Precisão de aproximadamente 7 dígitos decimais
```

**Características:**

- Menor precisão que double
- Requer sufixo f para literais
- Não recomendado para cálculos financeiros

### 6. double

```java
double pi = 3.141592653589793;
double cientifica = 1.234e-10;
// Precisão de aproximadamente 15 dígitos decimais
```

**Características:**

- Tipo padrão para decimais
- Maior precisão que float
- Preferido para cálculos científicos

### 7. char

```java
char letra = 'A';
char unicode = '\u0041'; // Também 'A'
char numero = 65;        // Também 'A'
// Demonstração do comportamento como inteiro
char c1 = 'A';
char c2 = 'B';
int diferenca = c2 - c1; // Resulta em 1
```

**Características:**

- Armazena um caractere Unicode de 16 bits
- Pode ser tratado como um valor numérico
- Suporta escape sequences (\n, \t, etc.)
- Comporta-se como um tipo numérico sem sinal

### 8. boolean

```java
boolean verdadeiro = true;
boolean falso = false;
// Apenas dois valores possíveis
```

**Características:**

- Tipo mais simples
- Usado em condicionais
- Tamanho real dependente da JVM

## Comportamentos Especiais

### Comportamento Numérico do char

O tipo `char` em Java tem um comportamento único: ele pode ser usado em operações aritméticas como um número inteiro sem sinal.

```java
char c = 'A';
System.out.println((int)c);    // Imprime 65
c++;                           // Incrementa para 'B'
System.out.println(c);         // Imprime B
System.out.println((int)c);    // Imprime 66

// Operações aritméticas
char c1 = 'A';
char c2 = 'C';
int diferenca = c2 - c1;       // Resulta em 2
char soma = (char)(c1 + 2);    // Resulta em 'C'
```

### Overflow e Underflow

```java
int maximo = Integer.MAX_VALUE;
System.out.println(maximo + 1);        // Resulta em Integer.MIN_VALUE
byte pequeno = 127;
System.out.println((byte)(pequeno + 1)); // Resulta em -128
```

## Conversão entre Tipos

### Conversão Implícita (Widening)

```java
byte b = 100;
int i = b;      // OK: byte → int
long l = i;     // OK: int → long
float f = l;    // OK: long → float
double d = f;   // OK: float → double
```

### Conversão Explícita (Narrowing)

```java
double d = 100.0;
float f = (float)d;    // Necessário cast
long l = (long)f;      // Necessário cast
int i = (int)l;        // Necessário cast
short s = (short)i;    // Necessário cast
byte b = (byte)s;      // Necessário cast
```

## Wrapper Classes

Cada tipo primitivo possui uma classe wrapper correspondente:

```java
// Criação de objetos wrapper
Integer intObj = Integer.valueOf(42);
Double doubleObj = Double.valueOf(3.14);
Boolean boolObj = Boolean.valueOf(true);

// Autoboxing
Integer autoboxed = 42;  // Automaticamente convertido
int unboxed = autoboxed; // Automaticamente desconvertido

// Métodos úteis
String strNum = "42";
int num = Integer.parseInt(strNum);
String binario = Integer.toBinaryString(42);
```

| Tipo Primitivo | Classe Wrapper | Valor Padrão |
| -------------- | -------------- | ------------ |
| byte           | Byte           | 0            |
| short          | Short          | 0            |
| int            | Integer        | 0            |
| long           | Long           | 0L           |
| float          | Float          | 0.0f         |
| double         | Double         | 0.0d         |
| char           | Character      | '\u0000'     |
| boolean        | Boolean        | false        |

## Literais e Notações

### Notações Numéricas

```java
// Decimal
int decimal = 42;

// Hexadecimal
int hexadecimal = 0x2A;  // 42 em hexadecimal

// Binário
int binario = 0b101010;  // 42 em binário

// Octal
int octal = 052;         // 42 em octal

// Underscore em números
long cartao = 1234_5678_9012_3456L;
float pi = 3.141_592_65f;
```

### Literais de Caractere

```java
char tab = '\t';          // Tabulação
char newLine = '\n';      // Nova linha
char unicode = '\u0041';  // 'A' em Unicode
char aspas = '\'';        // Aspas simples
```

## Boas Práticas

### Escolha do Tipo Apropriado

1. Use `int` para números inteiros na maioria dos casos
2. Use `long` para IDs e timestamps
3. Use `double` para cálculos científicos
4. Use `BigDecimal` (não primitivo) para cálculos financeiros
5. Use `boolean` para flags e condições

### Evite Armadilhas Comuns

```java
// Comparação de ponto flutuante
double a = 0.1 + 0.2;
double b = 0.3;
// Errado
if (a == b) { }
// Correto
if (Math.abs(a - b) < 0.000001) { }

// Divisão por zero
int x = 1;
int y = 0;
// Lança ArithmeticException
// int resultado = x / y;

// Com ponto flutuante
double resultado = x / (double)y; // Resulta em Infinity
```

## Performance e Memória

### Impacto na Performance

1. Tipos primitivos são mais rápidos que objetos
2. Operações com `int` são geralmente mais otimizadas
3. `double` é mais rápido que `BigDecimal`

### Uso de Memória

```java
// Exemplo de uso de memória
byte[] bytesArray = new byte[1000];    // 1000 bytes
int[] intsArray = new int[1000];       // 4000 bytes
Integer[] integersArray = new Integer[1000]; // ~16000 bytes + overhead
```

## Exercícios Práticos

### Exercício 1: Overflow

```java
public class OverflowExercicio {
    public static void main(String[] args) {
        byte b = 127;
        b++;
        System.out.println(b); // O que será impresso?
    }
}
```

### Exercício 2: Conversão de Tipos

```java
public class ConversaoExercicio {
    public static void main(String[] args) {
        double d = 100.0;
        int i = (int)d;
        byte b = (byte)i;
        System.out.println(b); // O valor permanece o mesmo?
    }
}
```

## Perguntas Frequentes

### 1. Por que preciso usar 'f' em literais float?

R: O Java trata todos os literais de ponto flutuante como `double` por padrão. O sufixo 'f' indica explicitamente que o literal é do tipo `float`.

### 2. Qual a diferença entre `int` e `Integer`?

R: `int` é um tipo primitivo que armazena o valor diretamente, enquanto `Integer` é um objeto wrapper que encapsula um valor `int`.

### 3. Por que não usar `float` ou `double` para dinheiro?

R: Devido à forma como números de ponto flutuante são armazenados, podem ocorrer imprecisões em cálculos. Para valores monetários, use `BigDecimal`.

### 4. O que acontece se eu não inicializar uma variável primitiva?

R: Variáveis primitivas locais devem ser inicializadas antes do uso. Variáveis de instância recebem valores padrão automaticamente.

## Conclusão

Os tipos primitivos são fundamentais em Java, oferecendo eficiência e simplicidade. A escolha correta do tipo primitivo pode impactar significativamente a performance e a correção do programa. Este guia fornece uma base sólida para trabalhar com tipos primitivos em Java, mas a prática e experiência são essenciais para dominar seu uso efetivo.
