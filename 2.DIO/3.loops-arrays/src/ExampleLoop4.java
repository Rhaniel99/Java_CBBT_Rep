import java.util.Scanner;

public class ExampleLoop4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numeroPar = 0, numeroImpar = 0, count = 0, totalNumero = 0, numero = 0;

        System.out.println("Digite a quantidade de números: ");
        totalNumero = scan.nextInt();

        do{
            System.out.println("Digite um número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) numeroPar ++;
            else numeroImpar ++;

            count ++;
        }while(count < totalNumero);

        System.out.println("A quantidade de números pares: " + numeroPar);
        System.out.println("A quantidade de números impares: " + numeroImpar);

    }
}
