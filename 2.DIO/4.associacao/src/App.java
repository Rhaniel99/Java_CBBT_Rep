public class App {
    public static void main(String[] args) throws Exception {
        ClasseMae[] classes = new ClasseMae[]{new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};

        for (ClasseMae classe: classes) {
            classe.metodo1();
        }
        System.out.println(" ");

        for (ClasseMae classe : classes) {
            classe.metodo2();
        }
        System.out.println(" ");

        // Sobescrita 
        ClasseFilha2 classeFilha2 = new ClasseFilha2();
        classeFilha2.metodo2();
    }
}