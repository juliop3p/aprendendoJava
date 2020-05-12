## Curso Java Completo - Aula 04: Download do ambiente de desenvolvimento

### Shortcuts IntelliJ

#### Alt + 1 = Abre e fecha a janela lateral.

#### Ctrl + Shift + F10 = compila e roda o programa atual.

#### Shift + F10 = compila e roda o programa se já rodado antes pelo comando anterior.

## Curso Java Completo - Aula 05: Tipos primitivos, convenções de código e comentários

## Primitive Types

<p>int, double, float, boolean, char, byte, short, long</p>

`// -> comentario de uma linha`

<pre>
/*
comentario de
multiplas
linhas
*/   
</pre>

<pre>
/***
* comentario oficial da linguagem.
*/   
</pre>

<p>No java utilizar camelCase para nome das variaveis:</p>
<code>int idadeDoParticipante = 20</code>

## Curso Java Completo - Aula 06: Continuação tipos primitivos, exercício e operadores

<p>Operadores Unários</p>
<pre>
++   -> Increment
--   -> Decrement
+    -> Plus
-    -> Minus
*    -> Multiplication 
/    -> Division
()   -> Cast
!    -> Not
%    -> Modulo operator
</pre>

## Curso Java Completo - Aula 07: Operador resto e operadores de comparação

<p>Operadores de Comparação</p>
<pre>
>    -> Maior que
<    -> Menor que
>=   -> Maior igual
<=   -> Menor igual
==   -> Igual à 
!=   -> Diferente de
</pre>

#### Ctrl + d = Replicar uma linha.

## Curso Java Completo - Aula 08: Operadores Lógicos

<pre>
&& == and
|| == or
</pre>

## Curso Java Completo - Aula 09: Operadores de Atribuição

`= -= += *= /= %=`

## Curso Java Completo - Aula 10: Controle de fluxo if, else if e else

<p>Uma curiosidade da linguagem.</p>
<pre>
boolean z = false;

if(z = true) {
System.out.println("Sim isso seria true por que é uma atribuição e não uma comparação");
}

</pre>

## Curso Java Completo - Aula 11: Controle de fluxo: Tabela verdade e mais.

<p>Operador ternário:</p>
<code>status = idade > 17 ? "Adulto" : "Não Adulto";</code>

## Curso Java Completo - Aula 13: Controle de fluxo switch e exercícios

<pre>
char sexo = 'M';

  switch (sexo) {
    case 'M':
      System.out.println("Masculino");
      break;
    case 'F':
      System.out.println("Feminino");
      break;
  }
</pre>

## Curso Java Completo - Aula 15: Controle de fluxo for, while, do while

<pre>
int i = 0;

while (i < 10) {
  System.out.println(++i);
  ;
}

do {
  System.out.println("Dentro do Do While");
} while (i < 10);

for (int j = 0; j < 10; j++) {
  System.out.println("Valor de i é " + j);
}
</pre>

## Curso Java Completo - Aula 19: Arrays parte 2

<pre>
// int idades[]; not recomended
int[] idades = new int[3];
String[] fruits = new String[3]; 
idades[0] = 20;
idades[1] = 30;
idades[2] = 40;
fruits[0] = "Maça";
fruits[1] = "Melancia";
fruits[2] = "Uva";

for (int i = 0; i < 3; i++) {
  System.out.println(idades[i]);
}

// No java tem a propriedade 'length' que retorna o tamanho do array

for (int i = 0; i < fruits.length; i++) {
  System.out.println(fruits[i]);
}
</pre>

## Curso Java Completo - Aula 20: Arrays parte 3 foreach

<p>Maneirar alternativas de inicializar um array.</p>
<pre>
int[] numeros2 = { 1, 2, 3, 4, 5 };
int[] numeros3 = new int[]{9, 8, 7, 6, 5};
</pre>

<p>forEach</p>
<pre>
for (int i : numeros3) {
  System.out.println(i);
}
</pre>

## Curso Java Completo - Aula 21: Arrays parte 4 arrays multidimensionais

#### arrays multidimensionais

<pre>
int[][] dias = new int[2][2]; 
    dias[0][0] = 5;
    dias[0][1] = 10;
    dias[1][0] = 3;
    dias[1][1] = 6;

    for (int i = 0; i < dias.length; i++) {
      for (int j = 0; j < dias[i].length; j++) {
        System.out.println(dias[i][j]);
      }
    }

    for (int[] ref : dias) {
      for (int dia : ref)
        System.out.println(dia);
    }
</pre>

## Curso Java Completo - Aula 22: Arrays parte 5 arrays multidimencionais

<pre>
int[][] dias1 = new int[3][];
dias1[0] = new int[2];
dias1[3] = new int[2];

dias1[0][0] = 99;  
dias1[0][1] = 98;
dias1[1][0] = 50;  
dias1[1][1] = 60;
dias1[1][2] = 70;

int[][] dias2 = { { 99, 98 }, { 50, 60, 70 }, { 1, 2, 3, 4, 5 } };
</pre>

## Curso Java Completo - Aula 24: Introdução a classes parte 1

<pre>
package br.com.abc.javacore.Aintroducaoclasses.classes;

public class Estudante {
  public String nome;
  public String matricula;
  public int idade;
}
</pre>

## ---------------------------------------------------------

<pre>
package br.com.abc.javacore.Aintroducaoclasses.test;

import br.com.abc.javacore.Aintroducaoclasses.classes.Estudante;

public class EstudandeTest {
  public static void main(String[] args) {
    Estudante joao = new Estudante();
    joao.nome = "João";
    joao.matricula = "1212";
    joao.idade = 16;

    System.out.println(joao.nome);
    System.out.println(joao.idade);
    System.out.println(joao.matricula);
  }
}
</pre>


## Curso Java Completo - Aula 32: Passagem de objeto como parâmetro e this pt 02

<p>Passar um objeto por parametro</p>

<pre>
public class Professor {
  public String nome;

  public void imprime(Professor prof) {
    System.out.println("Nome: " + prof.nome);
  }
}
</pre>

<pre>
Professor professor = new Professor();
professor.nome = "Arisvaldo";
professor.imprime(professor);
</pre>

<p>Imprimir objeto com o this</p>

<pre>
public class Professor {
  public String nome;

  public void imprime() {
    System.out.println("Nome: " + this.nome);
  }
}
</pre>

## Curso Java Completo - Aula 33: Passagem de parâmetros varargs

<pre>
    // Se receber mais de um parâmetro o VarArgs precisa ser o último.
    // int... a -> isso transforma o que recebe em um array.
    public void somaVarArgs(int... numeros) {
        int soma = 0;
        for(int numero : numeros) {
            soma += numero;
        }
        System.out.println(soma);
    }
</pre>

## Curso Java Completo - Aula 37: Modificador de acesso private, get e set pt 02

<p>Private só dá acesso dentro da própria classe</p>

<p>Recomendado Criar Setters e Getters para objetos internos</p>

* Exemplo
<pre>
 private String name;
 
 //Setter
 public void setName(String name) {
    this.name = name;
 }
 
 //Getter
 public String getName() {
    return this.name;
 }
   
</pre>

 <p>Quando criar uma variável boolean recomendado usar 'is' no começo do nome da variavel.</p>
 <code>private boolean isClient;</code>

## Curso Java Completo - Aula 40: Construtores e sobrecarga de construtores pt 02
<p>Sobrecarga (Overload) de métodos em Java. A sobrecarga, ou overload em inglês, permite a existência de vários métodos com o mesmo nome.</p>

<pre>
// Class Pessoa
public String nome;
public int idade;

public Pessoa(String nome) {
    this.nome = nome;
}

public Pessoa(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
}

public Pessoa() {

}

</pre>

<p>Neste exemplo eu posso instanciar 3 metódos de diferentes maneiras.</p>
<pre>
Pessoa pessoa1 = new Pessoa();
Pessoa pessoa1 = new Pessoa("Julio");
Pessoa pessoa1 = new Pessoa("Julio", 20);
</pre>

## Curso Java Completo - Aula 43: Métodos Estáticos

`this` é associado ao objeto e quando utilizamos a palavra `static` em algum metódo ou variável estamos mexendo diretamente na classe.
#### exemplo de uso

<pre>
package br.com.abc.javacore.Fmodificadorestatico.classes;

public class Carro {
    // Velocidade limite deve ser de 240km/h
    private String nome;
    private static double idadeMaxima = 60;

    public 
}
</pre>

## Curso Java Completo - Aula 44: Bloco de inicialização

Blocos estáticos são executados apenas uma vez na criação do objeto exemplo:

<pre>
public class Cliente {
    private String nome;
       
    // Executaria apenas uma vez pq é estatico. 
    static {
        System.out.println("Bloco de Inicialização Estático");
    }
    
    // Executaria toda vez que fosse criado um novo objeto.
    {
            System.out.println("Bloco de Inicialização Não Estático");
        }
        
}
    
    // main()
    Cliente cliente0 = new Cliente();
    Cliente cliente1 = new Cliente();
    Cliente cliente2 = new Cliente();
</pre>