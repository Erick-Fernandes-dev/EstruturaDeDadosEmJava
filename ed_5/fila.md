# Filas

Na aula passada vimos a estrutura de dados do tipo pilha, na qual o primeiro elemento a entrar é o último a sair.

![](https://s3.amazonaws.com/caelum-online-public/estrutura-de-dados/cap06/estdados_6_1.png)

Veremos nesta aula as *Filas*, que se estruturam de modo parecido com as Pilhas. Aqui, o primeiro a entrar é o primeiro a sair.

Criemos a Classe "Fila", que será suportada pelo *LinkedList*, e terá alguns métodos.
```java
package ed.fila;

import java.util.LinkedList;
import java.util.List;

public class Fila {

    private List<String> alunos = new LinkedList<String>();

    //métodos
}
```
Criaremos também, como é de costume, o método main para testar as funções de Fila:
```java
package ed.fila

public class TesteDaFila {

    public static void main(String[] args) {
        Fila fila = new Fila();

    }
}
```
E o toString:
```java
@Override
public String toString() {
    return alunos.toString();
}
```
## Método adiciona

Este método funciona igual ao da Pilha:
```java
public void adiciona(String aluno) {
    alunos.add(aluno);
}
```
Fazemos para teste:
```java
fila.adiciona("Mauricio");
fila.adiciona("Guilherme");

System.out.println(fila);
```
O quê retorna
```java
[Mauricio, Guilherme]
```
## Método remove

Lembre-se que na estrutura de Fila, será sempre o primeiro elemento do array a ser removido, então fazemos:
```java
public String remove() {
    return alunos.remove(0);
}

Para testarmos:

String x1 = fila.remove();
System.out.println(x1);
System.out.println(fila);
```
O que retorna:
```java
Mauricio
[Guilherme]
```
De fato, "Mauricio", que é o primeiro elemento, foi removido.

## Método vazia

Nos falta ainda esse método. Implementamos da seguinte forma:
```java
public boolean vazia() {
    return alunos.isEmpty();
}
```
## Queue

Da mesma forma que a estrutura de Pilhas tinha o nome de Stack, à estrutura de Filas damos o nome de Queue:
```java
Queue<String> filaDoJava = new LinkedList<String>();
```
Para as filas os métodos têm os seguintes nomes:

* adiciona: add
* remove: poll

Implementamos da seguinte forma:
```java
Queue<String> filaDoJava = new LinkedList<String>();

filaDoJava.add("Mauricio");
String x2 = filaDoJava.poll();
```

Se imprimirmos o ```x2```, nos retorna ```Mauricio```.


**FIFO -> First-in, First-out**

### Ilustração de um Fila:

![](https://wiki.sj.ifsc.edu.br/images/a/ad/Prg-queue.png)