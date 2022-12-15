import java.util.*;
// Ordenar com o número de página.
public class ExemploOrdenacaoMap {
    public static void main(String[] args) {
        Map<String, Livros> meusLivros = new HashMap<>(){{
            put("Hawking, Stephen", new Livros("Uma breve historia do Tempo", 256));
            put("Duhigg, Charles", new Livros("O poder do hábito", 408));
            put("Connan Doyle, Arthur", new Livros("Um estudo em vermelho", 150));
        }};
        // Ordem aleatoria
        for (Map.Entry<String, Livros> livro : meusLivros.entrySet()){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }
        // Ordem de inserção
        System.out.println(" ");
        Map<String, Livros> meuslivros2 = new LinkedHashMap<>(meusLivros);
        for (Map.Entry<String, Livros> livro : meuslivros2.entrySet()){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }
        System.out.println(" ");
        // Ordem natural
        Map<String, Livros> meuslivros3 = new TreeMap<>(meusLivros);
        for (Map.Entry<String, Livros> livro : meuslivros3.entrySet()){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }
        // De acordo com o nome do livro
        System.out.println(" ");
        Set<Map.Entry<String, Livros>> meusLivros4 = new TreeSet<>(new ComparatorNome());
        meusLivros4.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livros> livro : meusLivros4){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }


    }


}

class Livros {
    private String nome;
    private Integer paginas;

    public Livros(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livros livros = (Livros) o;
        return nome.equals(livros.nome) && paginas.equals(livros.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    @Override
    public String toString() {
        return "Livros{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}

class ComparatorNome implements Comparator<Map.Entry<String, Livros>>{

    @Override
    public int compare(Map.Entry<String, Livros> l1, Map.Entry<String, Livros> l2) {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
}