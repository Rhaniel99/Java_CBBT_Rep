import java.util.Scanner;

public class ExampleArray2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] consonants = new String[6];
        int amountConsonants = 0;
        int count = 0;
        
        do {
            System.out.println("Letra: ");
            String letter = scan.next();

            if ( !(letter.equalsIgnoreCase("a") || 
            letter.equalsIgnoreCase("e") ||
            letter.equalsIgnoreCase("i") ||
            letter.equalsIgnoreCase("o") ||
            letter.equalsIgnoreCase("u"))) {
                consonants[count] = letter;
                amountConsonants++;
            }
            count ++;
        } while (count < consonants.length);

        System.out.print("Consoantes: ");
        for (String consonant : consonants) {
            if (consonant != null)
            System.out.print(consonant + " ");
        }
        System.out.println("Quantidade de consoantes: " + amountConsonants);
        System.out.println(consonants.length);
    }
}
