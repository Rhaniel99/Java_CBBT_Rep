import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        // List <Double>notas = new ArrayList <> (Array.asList(2,3,4,6));
        List <Double>notas = new ArrayList <> ();
        notas.add(7.0);
        notas.add(8.0);
        notas.add(9.0);
        notas.add(3.0);
        notas.add(2.0);
        notas.add(1.0);
        notas.add(4.0);
        System.out.println(notas);
        System.out.println("A posição do objeto: " + notas.indexOf(4.0) );
        System.out.println("Adicione na lista a nota 9.0 na posição 4.");
        notas.add(4, 9d);
        System.out.println(notas);
        System.out.println("Substitua a nota 8 pela nota 6.0.");
        notas.set(notas.indexOf(8d), 6.0);
        System.out.println(notas);
        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));
        System.out.println("Exiba os elementos um atrás do outro: ");
        for (Double nota: notas) System.out.println(nota);

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;

        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        // Removendo objetos abaixo de 7.
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println(notas);
    }
}
