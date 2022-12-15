import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ExemploStream {
    public static void main(String[] args) {
        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "9", "2", "3");

        System.out.println("Imprima todos os elementos dessa lista de String: ");


        // Sem lambda
        /*numerosAleatorios.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/
        // Com lambda
        // numerosAleatorios.forEach(s ->  System.out.println(s));
        // Usando reference method

        numerosAleatorios.forEach(System.out::println);
        // Colando os 5 primeiros números dentro de um set.
        System.out.println("-");
        // ctrl + alt + v e a ultima opção
        Set<String> collectSet = numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet());
        // Transforme esta lista de String em uma lista de números inteiro
        // Map recebe uma function
        List<Integer> collectList = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        System.out.println("Maiores números pares de 2: ");
        List<Integer> numerosParesMaiores2 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(i -> (i % 2 == 0 && i > 2)).collect(Collectors.toList());
        System.out.println(numerosParesMaiores2);
        System.out.println("Maiores números pares de 2: ");
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);

    }
}
