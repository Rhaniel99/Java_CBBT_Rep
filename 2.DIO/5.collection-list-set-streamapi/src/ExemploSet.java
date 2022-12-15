import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {
        System.out.println("Crie um conjunto e adicione as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 7.3, 5.4));
        System.out.println(notas);
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(4d);
        notas2.add(7.5);
        notas2.add(9d);
        notas2.add(9.3);
        notas2.add(5.3);
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);
    }
}
