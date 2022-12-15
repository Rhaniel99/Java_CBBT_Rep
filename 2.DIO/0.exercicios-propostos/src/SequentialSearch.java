// A saída será a a posição do elemento no array, caso o valor não se encontre na Array, retorne a frase 
// " Numero __ nao encontrado!", como no exemplo abaixo:

import java.util.Scanner;

public class SequentialSearch {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int numero = leitor.nextInt();
        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75}; 
        int position = 0, stop = 0;
        //TODO: Retorne o valor do elemento no Array junto de sua respectiva posição.

        for (int i : elementos) {
            if (i == numero){
                ++ stop;
                System.out.println("Achei " + i + " na posicao " + position);
            }
            ++ position;
        }
        if (stop == 0){
            System.out.println("Numero " + numero + " nao encontrado!");
        }
        
    }
}
