package exemplos.visibilidade;

public class ExemplosVisibilidade2 extends ExemplosVisibilidade1 {
    ExemplosVisibilidade1 classe1;
    void metodo(){
        // Ele tem acesso ao metodo de 2 e 3, mas não o 1 por ser privado. Mesma coisa com atributos.
    }
}
