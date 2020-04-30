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
