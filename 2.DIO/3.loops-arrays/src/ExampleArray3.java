import java.util.Random;

public class ExampleArray3 {
    public static void main(String[] args) {
        Random random = new Random();
        int [] numberRandom = new int [20];

        for (int i = 0; i < numberRandom.length; i++) {
            int number = random.nextInt(100);
            numberRandom[i] = number;
        }
        System.out.print("Números aleatorios: ");
        for (int number : numberRandom) {
            System.out.print(number + " ");
        }
        System.out.print("\n- Números aleatorios: ");
        for (int number : numberRandom) {
            System.out.print((number - 1) + " ");
        }
        System.out.print("\n+ Números aleatorios: ");
        for (int number : numberRandom) {
            System.out.print((number + 1) + " ");
        }
    }
}
