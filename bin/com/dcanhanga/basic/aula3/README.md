# Variáveis no Java

Uma **variável** é um espaço reservado na memória do computador que pode armazenar valores de um determinado tipo, como números, textos ou booleanos.

## Sumário

- [Variáveis no Java](#variáveis-no-java)
  - [Sumário](#sumário)
  - [Como declarar uma variável](#como-declarar-uma-variável)
  - [Convenções de Nomeação de Variáveis](#convenções-de-nomeação-de-variáveis)
    - [1. **Restrições**](#1-restrições)
    - [2. **Regras de Estilo e Boas Práticas**](#2-regras-de-estilo-e-boas-práticas)
  - [Exemplo Prático](#exemplo-prático)
    - [Pontos Importantes](#pontos-importantes)

---

## Como declarar uma variável

A declaração de uma variável segue esta estrutura:

1. Com inicialização:

   ```java
   <tipo> <nome> = <valor>;
   ```

   Exemplo:

   ```java
   int idade = 25;
   String nome = "João";
   ```

2. Sem inicialização:

   ```java
   <tipo> <nome>;
   ```

   Exemplo:

   ```java
   int altura;
   String corFavorita;
   ```

---

## Convenções de Nomeação de Variáveis

### 1. **Restrições**

- Não utilize **palavras reservadas do Java** como nomes de variáveis, por exemplo: `class`, `int`, `static`.
- O nome deve começar com uma letra (`a-z`, `A-Z`), um **underscore** (`_`) ou um **sinal de dólar** (`$`).
- Após o primeiro caractere, você pode usar letras, números, underscores (`_`) ou o símbolo de dólar (`$`).

### 2. **Regras de Estilo e Boas Práticas**

- Use **camelCase**: Comece com a primeira letra em minúscula e as seguintes palavras com a inicial maiúscula.
  Exemplo:

  ```java
  int numeroDeAlunos;
  String nomeDoProduto;
  ```

- Não use underscores para separar palavras, pois não é uma prática recomendada em Java.
  - **Evitar:** `int nome_do_aluno;`
- Evite nomes confusos ou genéricos:
  - **Má prática:** `int a = 10; String b = "Texto";`
  - **Boa prática:** `int idade = 10; String nome = "Texto";`

---

## Exemplo Prático

```java
public class Variables {
    public static void main(String[] args) {

        int idade = 25;
        String nomeDoCachorro = "Max";

        System.out.println("Idade: " + idade);
        System.out.println("Nome do cachorro: " + nomeDoCachorro);
    }
}
```

---

### Pontos Importantes

1. **Legibilidade é essencial**:
   - Nomes de variáveis devem ser claros e descritivos.
   - Exemplos:
     - **Bom**: `quantidadeDeProdutos`, `precoDoItem`.
     - **Ruim**: `qtd`, `pdi`.

2. **CamelCase é padrão em Java**:
   - Utilize nomes que sigam o padrão camelCase para facilitar a leitura.

3. **Evite más práticas**:
   - Nomes confusos ou genéricos podem tornar o código difícil de entender e manter.

Com essas práticas, seu código será mais organizado, legível e fácil de manter!
