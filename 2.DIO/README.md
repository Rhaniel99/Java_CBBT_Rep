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
	-  *```Obs.: Variaveis maiusculas apenas quando o valor não pode ser alterado (FINAL).```*
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


	



