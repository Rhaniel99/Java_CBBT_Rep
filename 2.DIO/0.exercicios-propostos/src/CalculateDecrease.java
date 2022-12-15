// Neste desafio, receba um número inteiro N, calcule e imprima o somatório de todos os números de N até 0.   

// Entrada
// A Entrada será composta por um número inteiro, N. 

// Saída
// Será  impresso o somatório de N até 0, como no exemplo a baixo: 

import java.util.Scanner;

public class CalculateDecrease {
    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);
        int num = somatorio(numero.nextInt());
        System.out.println(num);
    }

    static int somatorio(int numero) {
        int acum = 0;
        if (numero == 0) {
            return 0;
        } else {
            for (int i = numero; i > 0; --i ){
                acum = acum + i;
            }
        return acum;
    }
}
}