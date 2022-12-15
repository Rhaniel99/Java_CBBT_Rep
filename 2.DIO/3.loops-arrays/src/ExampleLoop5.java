import java.util.Scanner;

public class ExampleLoop5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite a tabuada: ");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada de " + tabuada);
        for(int i = 1; i <= 10; i = i + 1){
            System.out.println(i + " x " + tabuada + " = " + (tabuada*i));
        }

    }
}
