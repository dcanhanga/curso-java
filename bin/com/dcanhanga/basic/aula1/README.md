# Introdução ao Java Hello World

## Sumário

- [Introdução ao Java Hello World](#introdução-ao-java-hello-world)
  - [Sumário](#sumário)
  - [Introdução ao Java](#introdução-ao-java)
    - [Estrutura de um Programa Java](#estrutura-de-um-programa-java)
    - [Compilar e Executar um Programa Java](#compilar-e-executar-um-programa-java)
    - [Exemplo: Hello World](#exemplo-hello-world)
    - [Resultado](#resultado)

## Introdução ao Java

**Java** é uma linguagem de programação amplamente utilizada e orientada a objetos, conhecida por sua portabilidade e robustez.

### Estrutura de um Programa Java

- Por convenção, o **nome da classe principal** deve ser o mesmo do arquivo.
- Todo programa Java começa pela execução do método `main`.

### Compilar e Executar um Programa Java

1. **Compilação**: Converta o código para bytecode com o comando:

   ```bash
   javac NomeDoArquivo.java
   ```

2. **Execução**: Execute o bytecode gerado com o comando:

   ```bash
   java NomeDoArquivo
   ```

### Exemplo: Hello World

Abaixo está o exemplo clássico de um programa Java que imprime "Hello, World!" no console:

```java
class HelloWorld {
  public static void main(String[] args) {
    System.out.println("Hello, World!");
  }
}
```

### Resultado

Ao executar este programa, você verá a saída:

```bash
Hello, World!
```

> **Dica**: Java é altamente utilizado em desenvolvimento de aplicativos, web, e sistemas corporativos devido à sua escalabilidade e desempenho!
