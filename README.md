

# Testes Unitários com JUnit utilizando Maven

## Este projeto tem como objetivo exemplificar alguns testes unitários básicos.

* Busque a simplicidade ao escrever nomes dos métodos.
* Comece a testar cedo — desenvolva a implementação e os testes simultaneamente.
* Busque a padronização nos nomes de classes e métodos.
* Os testes precisam ser atemporais.
* Economize tempo automatizando a execução dos testes e utilize ferramentas de cobertura de código, como o JaCoCo.

## Acesse https://mvnrepository.com/

* Utilize o JUnit Jupiter Engine.
* Procure pela dependência.

### 1. Verifique seu arquivo `pom.xml`:

Adicione a dependência assim:

```xml
<dependencies>
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter-engine</artifactId>
        <version>5.8.0</version>
        <scope>test</scope>
    </dependency>
    <!-- Outras dependências -->
</dependencies>
```



### 2. Atualize o índice de dependências:

No seu IDE (como IntelliJ IDEA ou Eclipse), atualize o projeto Maven.

### 3. Verifique a conexão com a Internet:

Garanta que seu ambiente tenha acesso à Internet para que o Maven possa baixar a dependência.

### Caso tenha problemas, especifique o repositório no `pom.xml`:

1. **Adicione o repositório Maven Central:** Caso tenha problemas, especifique o repositório no `pom.xml`:

```xml
<repositories>
    <repository>
        <id>central</id>
        <url>https://repo.maven.apache.org/maven2</url>
    </repository>
</repositories>
```

2. **Limpe o cache do Maven:** Tente limpar o cache com o comando:

```bash
mvn clean install
```

3. **Verifique a versão:** Confira se a versão `5.8.0` está disponível no [Maven Central](https://search.maven.org/).

4. **Considere versões mais recentes:** Se continuar com problemas, use uma versão mais recente:

```xml
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter-engine</artifactId>
    <version>5.9.0</version> <!-- Ou a última disponível -->
    <scope>test</scope>
</dependency>
```

## Exemplos de Testes Unitários

Aqui estão alguns exemplos simples de testes unitários usando JUnit:

### Exemplo 1: Testando uma soma

```java
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    @Test
    void testAddition() {
         Calculator calculator = new Calculator();
        assertEquals(5, calculator.calculator(2, 3), "A soma deve ser 5");
    }
}
```

### Exemplo 2: Testando uma exceção

```java
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void testDivisionByZero() {
        Calculator calculator = new Calculator();
        assertThrows(ArithmeticException.class, () -> calculator.divide(1, 0), "Divisão por zero deve lançar exceção");
    }
}
```

### Exemplo 3: Testando um método que retorna uma lista

```java
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import org.junit.jupiter.api.Test;

class ListUtilTest {

    @Test
    void testGetListSize() {
        ListUtil listUtil = new ListUtil();
        List<String> list = List.of("A", "B", "C");
        assertEquals(3, listUtil.getSize(list), "O tamanho da lista deve ser 3");
    }
}
```


