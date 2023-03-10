import java.util.*;
import java.util.stream.StreamSupport;

public class ExemploOrdList {
    public static void main(String[] args) {
        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Jon", 18, "Preto"));
            add(new Gato("Simba", 6, "Tigrado"));
            add(new Gato("Jon", 12, "Amarelo"));
        }};
        System.out.println("--\tOrdem de Inserção\t--");
        System.out.println(meusGatos);

        System.out.println("--\tOrdem aleatória\t--");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("--\tOrdem Natural\t--");
        Collections.sort(meusGatos);  // Organizada de acordo com o Comparable ( Só pode ser utilizada uma vez)
        System.out.println(meusGatos);

        System.out.println("--\tOrdem Idade\t--");
       // Collections.sort(meusGatos, new ComparatorIdade());
        meusGatos.sort(new ComparatorIdade()); // Usando COMPARATOR
        System.out.println(meusGatos);

        System.out.println("--\tOrdem Cor\t--");
        // Collections.sort(meusGatos, new ComparatorCor());
        meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos);

        System.out.println("--\tOrdem NomeIdadeCor\t--");
        //Collections.sort(meusGatos, new ComparatorNomeIdadeCor());
        meusGatos.sort(new ComparatorNomeIdadeCor());
        System.out.println(meusGatos);


    }
}

class Gato implements Comparable<Gato>{
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}

class ComparatorIdade implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}

class ComparatorCor implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}

class ComparatorNomeIdadeCor implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if (nome != 0) return nome;

        int idade = Integer.compare(g1.getIdade(), g2.getIdade());
        if (idade != 0) return idade;

        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}
