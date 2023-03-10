import java.util.*;

public class Series {
    public static void main(String[] args) {
        System.out.println("Ordem aleatória: ");
        Set<Serie> minhasSeries = new HashSet<>(){{
           add(new Serie("Dark", "Fantasia", 60));
           add(new Serie("GoT", "Drama", 60));
           add(new Serie("True Detective", "TrueCrime", 30));
        }};
        for ( Serie serie: minhasSeries) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        System.out.println("\nOrdem de Inserção");
        Set<Serie> minhasSeries2 = new LinkedHashSet<>(){{
            add(new Serie("Dark", "Fantasia", 60));
            add(new Serie("GoT", "Drama", 60));
            add(new Serie("True Detective", "TrueCrime", 30));
        }};
        for ( Serie serie: minhasSeries2) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());

        System.out.println("\nOrdem Natural Tempo de Episódio");
        Set<Serie> minhasSerie3 = new TreeSet<>(minhasSeries2);
        for ( Serie serie: minhasSerie3) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());

        System.out.println("\nOrdem Nome/Genero/TempoEpisodio");
        Set<Serie> minhasSerie4 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
        minhasSerie4.addAll(minhasSerie3);
        for ( Serie serie: minhasSerie4) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());

    }
}
class Serie implements Comparable<Serie>{
    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    public Serie(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoEpisodio=" + tempoEpisodio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return nome.equals(serie.nome) && genero.equals(serie.genero) && tempoEpisodio.equals(serie.tempoEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }
    // Para que o tempo que é igual a 60 nos dois indices ficasse, foi feito uma estrutura de condição para que na interface set não fosse excluida.
    @Override
    public int compareTo(Serie serie) {
        int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
        if (tempoEpisodio != 0) return tempoEpisodio;
        return this.getGenero().compareTo(serie.getGenero());
    }
}
class ComparatorNomeGeneroTempoEpisodio implements Comparator<Serie> {

    @Override
    public int compare(Serie s1, Serie s2) {
        int nome = s1.getNome().compareTo(s2.getNome());
        if (nome != 0) return nome;
        int genero = s1.getGenero().compareTo(s2.getGenero());
        if (genero != 0) return genero;
        return  Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
    }
}