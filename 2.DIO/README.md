# Anotações DIO
## Pesquisas
- classe: system.out
	- throws exception
- private
- operadores unarios
- java doc
- destrutor método.
- POO: Instância x Estático: atributos e métodos.
	- estado de um objeto
	- identidade de um objeto
	- representação numérica de um objeto
	- representação padrão de um objeto
- Relações: Tipo de Classe: Abstrata e Concreta.
	- metodos abstratos
	- caracteristicas das associações
	-  palavras coringas: super, base e super()
	- relações entre classes e interfaces: extends e implements.
- Padrões de Projeto: (Design Patterns)
- Boa práticas: SOLID, código, técnicas de programação, etc.
- refatoração.
- UML.
- frameworks
- thread save
- diamond Operator (List)
- metodo tostring
- interface Comparable
- Map.Entry<String, Double> entry  = O entry
- Interface Funcionais ( Collections?)
- Javax.swing JoptionPane
- Maven archetype list
- instrução de execução do comando mvn archetype
- interface
* * *
## Curiosidades
- métodos são () ?
- argumento são os valores/variaveis
- caractere aspas simples.
- Literal new força a criação de um novo objeto, aparentemente é sempre melhor usar o literal. 
Para formatar, arquivo em People.java
Para criar construtor com argumentos opcionais, construtor CurrentAccount.
* * *
## Assuntos
### **Java SE**
- ```Biblioteca de componentes visuais.```
### **Classes**
- ```Definida por atributos e métodos.```
### **Constantes**
- ```Valores armazenados em memoria que não muda.```
### **Variaveis**
- ```Sempre no singular, com exceções se for array. Idioma unico```
	-  *Variaveis maiusculas apenas quando o valor não pode ser alterado (FINAL).*
### **Métodos**
- ```Sempre nomeado como verbo, nomeclatura padrão "camelCase". Função ou sub-rotinas disponiveis dentro das classes. (Ações).```
	-  *Void para caso o metodo não retorne nenhum valor*
	- public = Ele estará visivel por todo o sistema.
	```java
					public double somar(int num1, int num2){
					//logica
					return ...;
					}
	```
	- Utilizando metodo sem um retorno.
		```java
						public void imprimir(String texto){
					}
	```
### **Operadores**
- ##### Ternarios
	- ```Ternarios são um IF para condições mais simples.```
	```java
	String resultado = a == b ? "Verdadeiro" : "Falso";
	```
	- É possivel usar um valor inteiro também no retorno.
	```java
	int resultado = a == b ? 1 : 0;
	```
### **Relacionais**
- *-> == != > >= < <=*
### **Operadores Lógicos**
- ##### Conjunção
	- && = E
		```java
		if (condicao1 && (7 > 4))
		```
- ##### Disjunção
	- || = Ou
- ##### Disjunção Exclusiva
	- ``Operação que só ocorre quando ambas expressões são opostas.``
		- 	^
- ##### Negação (Inversão)
	- ``Operação que inverte o valor lógico de um operando ou expressão``
		- !
### **Primitivos**
- ##### Inteiros
	- `` byte, short, int(mais utilizado), long.``
	- Exemplo de conversão para short.
	```java
	short numeroCurto2 = (short) numeroNormal;
	```
- ##### Fracionarios
	- `` float, double(mais utilizado).``
	- *float tem que ter um F no final.*
- ##### Boolean e Char.
### **Palavras reservadas**
- ##### Modificadores de acesso
	- ``public, private, protected.``
- ##### Modificadores de classe
	- ``extends, abstract, final, implements, interface, new, static, synchronized, transient.``
	- ``abstract`` torna os metodos obrigatorios nos filhos.
	-  ``new `` cria um novo objeto, instanciando um construtor.
- ##### Controle de fluxo dentro do código
	- ``break, case, continue.``
	- ``break`` sai do bloco de código.
	- ``case`` executa um bloco dependendo do switch.
	- ``continue`` pula o bloco.
### **Operações**
| soma | sub | mult | divisao | modulo |
|-|-|-|-|-|
|+|  -|  *|  /|  % | 
-  ##### Incrementação ++
	- *é igual  ``a: numero = numero + 1``*
### **Classe String**
- ##### length 
	- ``retorna a quantidade de caractere.``
	```java
	System.out.println("Hello, World!".length());
	```
- ##### equals 
	- ``método da classe Object utilizado para testar a relação de igualdade entre dois objetos.``
	```java
	if (nome1.equals(nome2)) {System.out.println("Os nomes são iguais!")};
	```
- ##### equalsIgnoreCase  
	- ``Esse método ignora a distinção entre letras maiúsculas e minúsculas nas duas strings comparadas.``
	```java
	if(nome1.equalsIgnoreCase(nome2)) {System.out.println("Os nomes são iguais!");}
	```
- ##### compareTo  
	- > Esse método pode retornar 0 se as strings forem iguais, um número negativo se a string que invoca o compareTo for menor que a string que é passada como um argumento
		e um número positivo se a string que invoca o compareTo for maior que a string que é passada como argumento.
	```java
	System.out.println("nome2.compareTo(nome1) = "+nome2.compareTo(nome1));
	System.out.println("nome1.compareTo(nome2) = "+nome1.compareTo(nome2));
	```
- ##### concat  
	-  ``Existem duas formas de unir duas ou mais sequências de caracteres. A mais comum dentre elas é utilizando o operador de adição. ``
	```java
	String nomeCompleto = nome + sobrenome;
	String nomeCompleto = nome.concat(sobrenome);
	```
- ##### String.valueOf
	- > valueOf é um método estático da classe String, que não precisa de uma instância para ser invocado. Ele converte um tipo primitivo em um objeto do tipo String. O Código 15 demonstra como utilizar esse método.
	```java
	double numero = 102939939.939;
	boolean booleano = true;

	System.out.println("Retorna Valor : " + String.valueOf(numero));
	System.out.println("Retorna Valor: " + String.valueOf(booleano));
	```
- ##### charAt
```java
	String nomeCurso = "JAVA";

	if(nomeCurso.charAt(1) == ‘A’) {
		System.out.println(“O caractere A está na posição 1”);}
```
### **JavaDoc**
- ``Para documentação.``
- ``@param`` numeroUm este é o primeiro parametro.
- 	``/``  comentario de uma linha.
- ``/* */ ``  comentario e varias linhas.
- ``/** */ ``  para documentação.
### **Estruturas**