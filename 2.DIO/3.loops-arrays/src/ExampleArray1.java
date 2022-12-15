public class ExampleArray1 {
    public static void main(String[] args) {
        int [] vetor = {-5, 14, 23, 3, 14};

        int count = 0;
        System.out.print("\nVetor: ");
        while (count < (vetor.length)){
            System.out.print(vetor[count] + " ");
            count ++;
        }

        System.out.print("\nVetor: ");
        for (int i = (vetor.length - 1); i >= 0; i --){
            System.out.print(vetor[i] + " ");
        }
    }
}
