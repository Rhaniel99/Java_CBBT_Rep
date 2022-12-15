package digital.innovationone.gof.singleton;

/**
 * Singleton "Lazy Boy"
 * @author Rhani
 */
public class SingletonLazy {
    private static SingletonLazy instancia;
    private SingletonLazy(){
        super();
    }
    public static SingletonLazy getInstance(){
        if (instancia == null){
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
