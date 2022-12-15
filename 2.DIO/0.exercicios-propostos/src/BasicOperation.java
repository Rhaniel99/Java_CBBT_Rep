// Calcule as 4 operações básicas: soma, subtração, multiplicação e divisão. Sempre 2 valores devem ser passados.


public class BasicOperation {
    public static void sum(int num1, int num2){
        System.out.println("A soma do número: "+ num1 + " e o número: " + num2 + " resulta em: " + (num1+num2));
    }
    public static void sub(int num1, int num2){
        System.out.println("A subtração do número: "+ num1 + " e o número: " + num2 + " resulta em: " + (num1-num2));
    }
    public static void mult(int num1, int num2){
        System.out.println("A multiplicação do número: "+ num1 + " e o número: " + num2 + " resulta em: " + (num1*num2));
    }
    public static void div(double num1, double num2){
        System.out.println("A Divisão do número: "+ num1 + " e o número: " + num2 + " resulta em: " + (num1/num2));
    }
}
