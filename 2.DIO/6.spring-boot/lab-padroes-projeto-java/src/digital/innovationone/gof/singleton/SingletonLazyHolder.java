package digital.innovationone.gof.singleton;
/**
 * Singleton "LazyHolder Boy"
 * @author Rhani
 */
public class SingletonLazyHolder {
    private static class InstanceHolder{
        private static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstance() {
        return InstanceHolder.instancia;
    }
}