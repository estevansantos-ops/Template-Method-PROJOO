# Template Method - Ordenação de Palavras em Java

Este projeto demonstra a implementação do padrão de projeto comportamental **Template Method** (Método Template) em Java para ordenação customizada de strings utilizando `Arrays.sort()`.

## Enunciado Base
Escrever um `Comparator` para ordenar palavras pela última letra, contendo também uma aplicação de teste com `Arrays.sort()` contendo:
1. Ordenação padrão alfabética.
2. Ordenação por tamanho da palavra.
3. Ordenação pela última letra.

## Estrutura do Projeto (Pasta Principal)

* **`ComparatorTemplate.java`**: Classe abstrata que define o esqueleto fixo do algoritmo de comparação (Template Method) e delega a extração da chave de ordenação para as subclasses através do método abstrato `extractKey`.
* **`LastLetterComparator.java`**: Subclasse concreta que extrai e compara a última letra das palavras.
* **`AlphabeticalComparator.java`**: Subclasse concreta para comparação alfabética padrão.
* **`LengthComparator.java`**: Subclasse concreta para ordenação por tamanho da palavra.
* **`App.java`**: Classe executável de teste sem formatações complexas, apenas exibindo os resultados.

## Como Executar

Compile os arquivos:
```bash
javac *.java
```

Execute a aplicação:
```bash
java App
```